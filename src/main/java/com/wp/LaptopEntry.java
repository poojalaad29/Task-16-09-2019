package com.wp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LaptopEntry {

	public static void main(String[] args) {
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Laptop e1=new Laptop("L111","hp",50000);
		Laptop e2=new Laptop("L112","Dell",60000);
		Laptop e3=new Laptop("L113","hp",70000);
		Laptop e4=new Laptop("L114","lenovo",80000);
		Laptop e5=new Laptop("L115","hp",90000);
		
		Transaction tr=session.beginTransaction();
		session.save(e1); session.save(e2);
		session.save(e3); session.save(e4);
		session.save(e5);
		tr.commit();
		session.close();
		
	}
}