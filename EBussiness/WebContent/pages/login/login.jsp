<%@ page language="java" import="java.util.*,com.ebs.servlet.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="com.opensymphony.xwork2.ActionContext"%>	
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>My JSP 'index.jsp' starting page</title>
</head>
<body>
  进来了！！！
  用户=<s:property value="user.Usercode"/>
  
 <s:textfield name="user.Usercode" label="用户名"/>
 <s:textfield name="user.Username" label="密码"/>
 <a href="LogoutServlet">退出1</a>
 <a href="logoutUserinfo.action">退出2</a>
</body>
</html>