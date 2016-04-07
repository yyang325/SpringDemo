package com.mercury.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mercury.beans.User;
import com.mercury.dao.HelloDao;

@Repository
public class HelloDaoImpl implements HelloDao {
	private HibernateTemplate template;
	
	@Autowired
	@Qualifier("mySessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		template = new HibernateTemplate(sessionFactory);
	}
	
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		template.save(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		template.update(user);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		template.delete(user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> queryAll() {
		// TODO Auto-generated method stub
		String hql = "from User";
		return template.find(hql);
	}

	@Override
	public User findByName(String name) {
		// TODO Auto-generated method stub
		return (User)template.get(User.class, name);
	}

}
