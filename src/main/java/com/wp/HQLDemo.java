package com.wp;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.List;
import org.hibernate.query.Query;
public class HQLDemo {

	public static void main(String[] args) {
		Configuration config=new Configuration().configure();
		Session session=config.buildSessionFactory().openSession();
		
		String qr="Update Laptop set Price=100000 where code=:id";
		Transaction txn = session.beginTransaction();
		Query query = session.createQuery(qr);
		query.setParameter("id","112");
        int count = query.executeUpdate();
		System.out.println("Updated succeccfully");
		txn.commit();
		session.close();
		}

	}

