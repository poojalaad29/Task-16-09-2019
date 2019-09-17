package com.wp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop{
	@Id
	private String code;
	private String Brand;
	private int Price;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public Laptop(String code, String brand, int price) {
		super();
		this.code = code;
		Brand = brand;
		Price = price;
	}
	public Laptop(String code) {
		super();
		this.code = code;
	}
	public Laptop() {
		super();
	}
	@Override
	public String toString() {
		return "Laptop [code=" + code + ", Brand=" + Brand + ", Price=" + Price + "]";
	}
	
}