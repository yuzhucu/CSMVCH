package com.cssh.common.manager;

import java.util.List;
import org.hibernate.HibernateException;

import com.cssh.common.dao.BaseDao;
import com.cssh.common.dao.impl.UserDao;
import com.cssh.common.pojo.User;
public class UserManager {
	private BaseDao dao;  
	
	public UserManager(){
		dao = new UserDao();
		System.out.println("UserManager IN");
	}
   
    public BaseDao getDao() {
		return dao;
	}
	public void setDao(BaseDao dao) {
		this.dao = dao;
	}
	public List<User> getUsers() throws HibernateException {  
    	return dao.getUsers();
    } 
}