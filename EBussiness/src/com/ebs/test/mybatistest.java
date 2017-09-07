package com.ebs.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ebs.mapper.UserBeanMapper;
import com.ebs.model.QuaninfoBean;
import com.ebs.model.UserBean;

public class mybatistest {
	 
	public static void main(String[] args) {
		 ApplicationContext ctx=null;
		 System.out.println("111111111111");
		
		 ctx=new ClassPathXmlApplicationContext("/WEB-INF/web.xml");
		 UserBeanMapper userDao=(UserBeanMapper) ctx.getBean("user2");
		// userDao.selectByPrimaryKey(usercode)
		 
		
		System.out.println("访问到了业务层！");
		UserBean  user1= userDao.selectByPrimaryKey("0001");
		//System.out.println("user.getUsercode="+user.getUsercode());
		System.out.println("user1.getUsercode="+user1.getUsercode());
	}

}
