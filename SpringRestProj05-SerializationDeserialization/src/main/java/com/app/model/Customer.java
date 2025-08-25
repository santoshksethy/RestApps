package com.app.model;



public class Customer
{
	private Integer id;
	
	private String name;
	
	private String address;
	
	private Double bill;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getBill() {
		return bill;
	}

	public void setBill(Double bill) {
		this.bill = bill;
	}

	public Customer(Integer id, String name, String address, Double bill) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.bill = bill;
	}

	@Override
	public String toString()
	{
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", bill=" + bill + "]";
	}
	
	

}
