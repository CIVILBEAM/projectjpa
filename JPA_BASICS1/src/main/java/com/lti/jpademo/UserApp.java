package com.lti.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserApp {

	public static void main(String[] args) {

		Student s = new Student("LTI", 2000);
		System.out.println(s);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();

		// add a new record//insert//CRUD//create(insert) Retrieve(select,search,find)
		// Update

		em.getTransaction().begin();

		em.persist(s);
		System.out.println(" record added ");

		em.getTransaction().commit();

		// find the student //search//
		// Student tempStu = em.find(Student.class, 102);
		// System.out.println(tempStu);

		// update
		/*
		 * em.getTransaction().begin(); tempStu.setScore(60); em.merge(tempStu);
		 * System.out.println(" record updated "); em.getTransaction().commit();
		 */

		// delete
		// em.getTransaction().begin();
		// em.remove(tempStu);
		// em.getTransaction().commit();

		em.close();
		factory.close();
	}

}
