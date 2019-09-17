package com.wp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class EmpEntry {

		public static void main(String[] args) {
			Configuration config=new Configuration().configure();
			SessionFactory sf=config.buildSessionFactory();
			Session session=sf.openSession();
		
			Emp e1=new Emp(111,"AAA",50000, new Laptop("L111"),new Vehicle("V112"));
			Emp e2=new Emp(112,"BBB",60000, new Laptop("L112"),new Vehicle("V113"));
			Emp e3=new Emp(113,"CCC",70000, new Laptop("L113"),new Vehicle("V113"));
			
			Transaction tr=session.beginTransaction();
			session.save(e1); session.save(e2);
			session.save(e3); 
			tr.commit();
			session.close();
			System.out.println("RECORD ADDED");
		}

	}

