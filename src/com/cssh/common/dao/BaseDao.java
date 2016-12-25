package com.cssh.common.dao;

import java.util.List;

import org.hibernate.HibernateException;

import com.cssh.common.pojo.User;

public interface BaseDao {
	public void saveObject(Object obj) throws HibernateException;

	

	public List<User> getUsers() throws HibernateException;
}