package com.abhisheksah;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/admin").hasRole("admin")
		.antMatchers("/user").hasAnyRole("user","admin")
		.antMatchers("/").permitAll()
		.and()
		.formLogin();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("abhi")
		.password(this.passwordEncoder().encode("abhi"))
		.roles("admin");
		
		
		auth.inMemoryAuthentication()
		.withUser("demon").password(this.passwordEncoder().encode("demon"))
		.roles("user");
	}


	@Bean
	public PasswordEncoder passwordEncoder() {
		   return new	 BCryptPasswordEncoder(10); 
		   }
	
}
