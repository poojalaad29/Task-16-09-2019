package com.wp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class QBCRetrieval {

	public static void main(String[] args) {
		Configuration config=new Configuration().configure();
		Session session=config.buildSessionFactory().openSession();
		Criteria cr=session.createCriteria(Laptop.class);
		List<Laptop> emps=cr.list();
		for(Laptop laptop:emps){
			System.out.println(laptop.getCode());
			System.out.println(laptop.getBrand());
			System.out.println(laptop.getPrice());
			System.out.println("______________________________________________");
		}
			System.out.println("Using Filters:-------------------------------------------");
			Criterion crt1=Restrictions.eq("Brand", "hp");
			Criterion crt2=Restrictions.gt("Price", 50000);
			//Criterion crt3=Restrictions.or(crt1,crt2);
			Criterion crt3=Restrictions.and(crt1,crt2);
		cr.add(crt3);
		List<Laptop> vlist=cr.list();
		for(Laptop v:vlist){
			System.out.println(v);
		}
		
		
		

	}

}
