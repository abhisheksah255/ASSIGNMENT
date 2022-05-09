package com.abhisheksah.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abhisheksah.model.Customer;
import com.abhisheksah.repository.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;

	@PostMapping("/customers")
	public String addCustomer(@RequestBody Customer customer) {
		customerRepository.save(customer);
		return "Added Customer Detail Successfully";
	}
	
	@GetMapping("/customers")
	public List<Customer> getdetail(){
		return customerRepository.findAll();
	}

	@GetMapping("/customers/{id}")
	public ResponseEntity<?>fetchSingleDetail(@PathVariable("id") int id){
		Optional<Customer> customerOptional=customerRepository.findById(id);
		if(customerOptional.isPresent()) {
			return new ResponseEntity<>(customerOptional.get(),HttpStatus.ACCEPTED);
		}
		else {
			return new ResponseEntity<>("Customer is not present in this List "+id,HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/customers/{id}")
	public ResponseEntity<?>UpdateDetail(@PathVariable("id") int id,
			@RequestBody Customer customer){
		Optional<Customer> customerOptional=customerRepository.findById(id);
		if(customerOptional.isPresent()) {
			Customer customerdetail=customerOptional.get();
			customerdetail.setCity(customer.getCity()!=null?customer.getCity():customerdetail.getCity());
			customerdetail.setCountry(customer.getCountry()!=null?customer.getCountry():customerdetail.getCountry());
			customerdetail.setState(customer.getState()!=null?customer.getState():customerdetail.getState());
			customerdetail.setStreet(customer.getStreet()!=null?customer.getStreet():customerdetail.getStreet());
			customerdetail.setFirstName(customer.getFirstName()!=null?customer.getFirstName():customerdetail.getFirstName());
			customerdetail.setLastName(customer.getLastName()!=null?customer.getLastName():customerdetail.getLastName());
			customerRepository.save(customerdetail);
			return new ResponseEntity<>(customerdetail,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("Customer is not present in this List "+id,HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/customers/{id}")
	public String deleteCustomer(@PathVariable int id) {
		customerRepository.deleteById(id);
		return "Delete Customer Successfully";
	}
	
	
	
	
}
