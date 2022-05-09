package com.abhisheksah.controller;

import java.util.Date;
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

import com.abhisheksah.model.Order;
import com.abhisheksah.repository.OrderRepository;

@RestController
public class OrderController {

	@Autowired
	private OrderRepository orderRepository;
	
	@GetMapping("/orders")
	public ResponseEntity<?> getAllOrder(){
		List<Order>order=orderRepository.findAll();
		if(order.size()>0) {
			return new ResponseEntity<List<Order>>(order,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("No Order booked first book order" , HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/orders")
	public ResponseEntity<?> createOrder(@RequestBody Order order){
	
		try {
			order.setOrderAt(new Date(System.currentTimeMillis()));
			orderRepository.save(order);
			return new ResponseEntity<Order>(order,HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
}

	@GetMapping("/orders/{id}")
	public ResponseEntity<?> getSingleOrder(@PathVariable("id")String id){
	
		Optional<Order>orderOptional=orderRepository.findById(id);
		if(orderOptional.isPresent()) {
			return new ResponseEntity<>(orderOptional.get(),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("Order is not found "+id, HttpStatus.NOT_FOUND);
		}
}

	
	@PutMapping("/orders/{id}")
	public ResponseEntity<?> UpdateOrderbyId(@PathVariable("id")String id,
			@RequestBody Order order){
	
		Optional<Order>orderOptional=orderRepository.findById(id);
		if(orderOptional.isPresent()) {
			Order updateOrder=orderOptional.get();
			updateOrder.setCustomerAddress(order.getCustomerAddress()!=null?order.getCustomerAddress():updateOrder.getCustomerAddress());
			updateOrder.setCustomerName(order.getCustomerName()!=null?order.getCustomerName():updateOrder.getCustomerName());
			updateOrder.setProductName(order.getProductName()!=null?order.getProductName():updateOrder.getProductName());
			updateOrder.setUpdateAt(new Date(System.currentTimeMillis()));
			orderRepository.save(updateOrder);
			return new ResponseEntity<>(updateOrder,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("Order is not found "+id, HttpStatus.NOT_FOUND);
		}

	}
	

	@DeleteMapping("/orders/{id}")
	public ResponseEntity<?>deleteOrderbyId(@PathVariable ("id") String id){
		
		try {
			orderRepository.deleteById(id);
			return new ResponseEntity<>("Successfully Cancelled the order by id:-"+id,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	
	
	
}

