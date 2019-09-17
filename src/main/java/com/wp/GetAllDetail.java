package com.wp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetAllDetail {

	public static void main(String[] args) {
	
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
				Emp emp=session.get(Emp.class, 112);
				Laptop laptop=session.get(Laptop.class,"L112");
				System.out.println(emp.getEno());
				System.out.println(emp.getEname());
				System.out.println(emp.getSal());
				System.out.println(emp.getVehicle().getBrand());
				System.out.println(emp.getLaptop().getBrand());
				session.close();
		}

	}

