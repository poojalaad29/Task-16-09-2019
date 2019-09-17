package com.wp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class VehicleEntry {

	public static void main(String[] args) {
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Vehicle e1=new Vehicle("V111","xxx","yyy",50000);
		Vehicle e2=new Vehicle("V112","ppp","qqq",60000);
		Vehicle e3=new Vehicle("V113","fff","ooo",70000);
		Vehicle e4=new Vehicle("V114","iii","uuu",80000);
		Vehicle e5=new Vehicle("V115","www","rrr",90000);
		
		Transaction tr=session.beginTransaction();
		session.save(e1); session.save(e2);
		session.save(e3); session.save(e4);
		session.save(e5);
		tr.commit();
		session.close();
		
	}

}
