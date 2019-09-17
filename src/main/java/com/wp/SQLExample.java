package com.wp;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;


public class SQLExample {

	public static void main(String[] args) {
		Configuration config=new Configuration().configure();
		Session session=config.buildSessionFactory().openSession();
		String sql="Select * from Laptop";
		SQLQuery query=session.createSQLQuery(sql);
		query.addEntity(Laptop.class);
		List<Laptop> list=query.list();
		for(Laptop v:list){
			System.out.println(v);
		}
      }
}
