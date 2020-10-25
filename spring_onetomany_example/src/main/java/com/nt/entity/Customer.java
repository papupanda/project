package com.nt.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue
	private Integer customerid;
	private String customername;
	private String emailid;
	private String gender;
	
	@OneToMany(targetEntity = Productone.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "cp_fk",referencedColumnName = "customerid")
	private List<Productone> productone;
	
	@OneToMany(targetEntity = ProductTwo.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "cp_fk",referencedColumnName = "customerid")
	private List<ProductTwo> producttwo;
	
	

	public Customer() {
		
	}

	public Customer(Integer customerid, String customername, String emailid, String gender, List<Productone> productone,
			List<ProductTwo> producttwo) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.emailid = emailid;
		this.gender = gender;
		this.productone = productone;
		this.producttwo = producttwo;
	}

	public Integer getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Productone> getProductone() {
		return productone;
	}

	public void setProductone(List<Productone> productone) {
		this.productone = productone;
	}

	public List<ProductTwo> getProducttwo() {
		return producttwo;
	}

	public void setProducttwo(List<ProductTwo> producttwo) {
		this.producttwo = producttwo;
	}

	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", emailid=" + emailid
				+ ", gender=" + gender + ", productone=" + productone + ", producttwo=" + producttwo + "]";
	}
	
	

	
}
