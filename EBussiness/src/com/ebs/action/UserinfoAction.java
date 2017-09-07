package com.ebs.action;import javax.annotation.Resource;import javax.servlet.http.HttpServletRequest;import javax.servlet.http.HttpServletResponse;import javax.servlet.http.HttpSession;import org.apache.log4j.Logger;import org.apache.struts2.ServletActionContext;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.context.annotation.Scope;import org.springframework.stereotype.Component;import org.springframework.stereotype.Controller;import org.springframework.web.bind.annotation.RequestMapping;import com.ebs.model.UserBean;import com.ebs.service.UserService;import com.opensymphony.xwork2.ActionContext;import com.opensymphony.xwork2.ActionSupport;
public class UserinfoAction extends ActionSupport {

	/**
	 * @author hanshishang
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger log =  Logger.getLogger(UserinfoAction.class); 	private String tojsp;	private UserBean user;	@Resource	private UserService us;	public String login() throws Exception{		System.out.println("--------------begin------------------------");		log.error("errorwrit"); 		System.out.println("--------------ing------------------------");		log.debug("debugwrite");		System.out.println("--------------end------------------------");		log.info("infowrite");		boolean flag=us.login(user);		if(flag){			tojsp="pages/login/login";			return "success";		}else{			System.out.println("跳转失败。");			tojsp="pages/login/error";			return "success";		}	
	}		public String logout() throws Exception{		System.out.println("进入logout方法");		//struts2 获取session的办法		ActionContext cxt = ActionContext.getContext();		cxt.getSession();		HttpServletResponse response = ServletActionContext.getResponse();		HttpServletRequest request = ServletActionContext.getRequest();		//cxt.put(key,);		tojsp="pages/login/logout";		return "success";	}
		public String getTojsp() {
		return tojsp;
	}

	public void setTojsp(String tojsp) {
		this.tojsp = tojsp;
	}	public UserBean getUser() {		return user;	}	public void setUser(UserBean user) {		this.user = user;	}
}