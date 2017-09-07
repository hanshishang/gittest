package com.ebs.service;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.ebs.mapper.AbcMapper;
import com.ebs.mapper.UserBeanMapper;
import com.ebs.model.Abc;
import com.ebs.model.UserBean;
@Service("us")
public class UserService {
	@Resource
	private UserBeanMapper usermapper;

	public boolean login( UserBean user ){
		
		System.out.println("访问到了业务层！");
		System.out.println("111111111111");
		UserBean  user1= usermapper.selectByPrimaryKey(user.getUsercode());
		if(user1==null){
			System.out.println("失败");
			return false;
		}else{
			System.out.println("user.getUsercode="+user.getUsercode());
			System.out.println("user1.getUsercode="+user1.getUsercode());
			System.out.println("user1.getUsername"+user1.getUsername());
			if(user1.getUsercode().equals(user.getUsercode())){
				System.out.println("成功进入sevice 业务逻辑处理！");
				return true;	
			}else{
				return false;
			}
			
		}
		
	}
	
	public boolean  alogin(){
		ApplicationContext ctx=null;
		 ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		 AbcMapper userDao=(AbcMapper) ctx.getBean("cc");
		 Abc ss =new Abc();
		 ss.setUsername("aaa");
		 ss.setAge("20");
		 userDao.insert(ss);
		return true;
	}

	

}
