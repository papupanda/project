package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee_mvc")
public class Employee {
	@Id
	@GeneratedValue
	private Integer empid;
	
	@Column(name = "emp_name")
	private String empname;
	
	@Column(name = "salary")
	private Double salary;
	@Column(name = "mobile_num")
	private long mobilenum;

}
