package com.cssh.common.test;

import java.util.List;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.cssh.common.manager.UserManager;
import com.cssh.common.pojo.User;
public class HibernateTest {
	public static void main(String[] args) {
		UserManager userManager=new UserManager();
		
		userManager.getUsers();
	}
}