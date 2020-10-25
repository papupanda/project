package com.nt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="product_one")
public class Productone {
	@Id
	@GeneratedValue
	private Integer poneid;
	private String mobile;
	private Double price;
	private String color;
	
	
	
	public Productone() {
		
	}
	public Productone(Integer poneid, String mobile, Double price, String color) {
		this.poneid = poneid;
		this.mobile = mobile;
		this.price = price;
		this.color = color;
	}
	public Integer getPoneid() {
		return poneid;
	}
	public void setPoneid(Integer poneid) {
		this.poneid = poneid;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
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
		return "Productone [poneid=" + poneid + ", mobile=" + mobile + ", price=" + price + ", color=" + color + "]";
	}
	
	
	
	

}
