package com.abhisheksah.question9;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class postprocessor implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object bean, String beanName) 
			throws BeansException {
		
		System.out.println("this is the postprocessor After Initialization method"+beanName);
		return bean;
	}
	public Object postProcessBeforeInitialization(Object bean, String beanName) 
			throws BeansException {
		System.out.println("this is the postprocessor Before Initialization method"+beanName);
		return bean;
	}
}
