package com.blog.library.JPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.blog.library.data.UserDAO;
import com.blog.library.model.User;

public class UserJPA implements UserDAO {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("user");
	private EntityManager em;

	public void add(User user) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();
	}

	public void update(User user) {
		add(user);
	}
	
	public User find(String id) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		User user =em.find(User.class,id);
		em.close();
		return user;
	}

	public void delete(User user) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(user);
		em.getTransaction().commit();
		em.close();
	}

}
