package com.hongruan.online.admin.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.hongruan.online.entity.Admin;
import com.hongruan.online.entity.TaskBit;

@Repository
public class AdminDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	public List<Admin> getAllAdmins(){
		String hql = "from Admin";
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	public void saveTask(TaskBit taskBit) {
		this.sessionFactory.getCurrentSession().save(taskBit);
	}
	
}
