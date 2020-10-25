package com.nt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="product_two")
public class ProductTwo {
	
	@Id
	@GeneratedValue
	private Integer ptwoid;
	private String laptop;
	private Double price;
	private String color;
	
	
	
	public ProductTwo() {
		
	}


	public ProductTwo(Integer ptwoid, String laptop, Double price, String color) {
		super();
		this.ptwoid = ptwoid;
		this.laptop = laptop;
		this.price = price;
		this.color = color;
	}
	
	
	public Integer getPtwoid() {
		return ptwoid;
	}
	public void setPtwoid(Integer ptwoid) {
		this.ptwoid = ptwoid;
	}
	public String getLaptop() {
		return laptop;
	}
	public void setLaptop(String laptop) {
		this.laptop = laptop;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "ProductTwo [ptwoid=" + ptwoid + ", laptop=" + laptop + ", price=" + price + ", color=" + color + "]";
	}
	
	

}
