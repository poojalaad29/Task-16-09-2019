package com.wp;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Emp {
      
	@Id
	private int eno;
	private String ename;
	private int sal;
	
	@OneToOne(fetch=FetchType.LAZY)
	private Laptop laptop;
	
	@OneToOne(fetch=FetchType.LAZY)
	private Vehicle vehicle;
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Emp(int eno, String ename, int sal, Laptop laptop, Vehicle vehicle) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.laptop = laptop;
		this.vehicle = vehicle;
	}
	public Emp() {
		super();
	}
	@Override
	public String toString() {
		return "Emp [eno=" + eno + ", ename=" + ename + ", sal=" + sal + ", laptop=" + laptop + ", vehicle=" + vehicle
				+ "]";
	}
	
	
}
