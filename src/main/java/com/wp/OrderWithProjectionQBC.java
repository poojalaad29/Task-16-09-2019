package com.wp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class OrderWithProjectionQBC {

	public static void main(String[] args) {
		Configuration config=new Configuration().configure();
		Session session=config.buildSessionFactory().openSession();
		ProjectionList pList=Projections.projectionList();
		Criteria cr=session.createCriteria(Laptop.class);
		System.out.println("Order By Sal :-------------------------------------------");
		//Order ord1=Order.asc("Price");
		Order ord1=Order.desc("Price");
		cr.addOrder(ord1);
		List<Laptop> lst=cr.list();
		for(Laptop v:lst){
			System.out.println(v);
		}
		System.out.println("______________________________________________");
		System.out.println("With Projection");
		Projection p1=Projections.property("Brand");
		Projection p2=Projections.property("Price");
		pList.add(p1); pList.add(p2);
		cr.setProjection(pList);
		
      List<Object[]> vlist=cr.list();
		for(Object ar[]:vlist){
			
			for(Object obj:ar){
				System.out.println(obj);
			}
			System.out.println("______________________________________________");
		}

		session.close();
	}

}
