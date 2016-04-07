package com.mercury.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mercury.beans.User;
import com.mercury.beans.UserInfo;
import com.mercury.dao.HelloDao;

@Service
public class HelloService {
	@Autowired
	private HelloDao hd;
	
	public String sayHello2(User user){
		return "Hello " + user.getName() + "(" + user.getAge() + "), welcome to MVC + Hibernate.";
	}
	
	
	public UserInfo process(User user){
		hd.save(user);
		UserInfo info = new UserInfo();
		info.setMsg(this.sayHello2(user));
		info.setUsers(hd.queryAll());
		return info;
	}
}
