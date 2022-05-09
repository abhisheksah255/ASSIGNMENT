package com.abhisheksah.model;
/*
Design and develop RESTful web service as follows:
1. A user can place an order
2. A user can update an order
3. A user can view specific order
4. A user can view all the orders
5. A user can delete a specific order.
Note: Use MongoRepository of Spring data to store order details
*/
import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Order")
public class Order {
	
	@Id
	private String id;
	private String productName;
	private String customerName;
	private String customerAddress;
	private Date orderAt;
	private Date updateAt;
	
	public Order(String id, String productName, String customerName, String customerAddress, Date orderAt,
			Date updateAt) {
		super();
		this.id = id;
		this.productName = productName;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.orderAt = orderAt;
		this.updateAt = updateAt;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public Date getOrderAt() {
		return orderAt;
	}

	public void setOrderAt(Date orderAt) {
		this.orderAt = orderAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", productName=" + productName + ", customerName=" + customerName
				+ ", customerAddress=" + customerAddress + ", orderAt=" + orderAt + ", updateAt=" + updateAt + "]";
	}

	
}
