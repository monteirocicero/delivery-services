package com.cicero.deliveryservices.domain;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table(value = "deliveryOrder")
public class DeliveryOrder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PrimaryKey
	private UUID orderId;
	private int quantity;
	private String type;
	private String description;
	private double total;
	private String address;
	private String status;

	public DeliveryOrder() {
	}

	public DeliveryOrder(UUID orderId, int quantity, String type, String description, double total, String address,
			String status) {
		super();
		this.orderId = orderId;
		this.quantity = quantity;
		this.type = type;
		this.description = description;
		this.total = total;
		this.address = address;
		this.status = status;
	}

	public UUID getOrderId() {
		return orderId;
	}

	public void setOrderId(UUID orderId) {
		this.orderId = orderId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
