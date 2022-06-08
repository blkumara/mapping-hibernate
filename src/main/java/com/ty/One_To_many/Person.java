package com.ty.One_To_many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {
	@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
	
	private int id;
	private String name;
	private int age;
	private String Address;
	private long mobile;
	@OneToMany
	private List<BankAccount> account;
	public int getId() {
		return id;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public List<BankAccount> getAccount() {
		return account;
	}
	public void setAccount(List<BankAccount> account) {
		this.account = account;
	}
	
	
}
