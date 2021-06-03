package com.example.Product1.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int quatity;
	private double price;
	
	public int getId() {
		return getId();
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuatity() {
		return quatity;
	}
	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name, int quatity, double price) {
		super();
		this.id = id;
		this.name = name;
		this.quatity = quatity;
		this.price = price;
	}
	/*@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", quatity=" + quatity + ", price=" + price + "]";
	} */
	

}
