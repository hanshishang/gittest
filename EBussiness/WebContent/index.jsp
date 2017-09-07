<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>管理平台</title>
</head>
<body>
<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td bgcolor="#e5f6cf">&nbsp;</td>
  </tr>
  <tr>
    <td height="608" background="<%=basePath%>/pages/login/images/login_03.gif"><table width="862" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td height="266" background="<%=basePath%>/pages/login/images/login_04.gif">&nbsp;</td>
      </tr>
      <tr>
        <td height="95"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="424" height="95" background="<%=basePath%>/pages/login/images/login_06.gif">&nbsp;</td>
            <td width="183" background="<%=basePath%>/pages/login/images/login_07.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="21%" height="30"><div align="center"><span class="STYLE3">用户</span></div></td>
                <td width="79%" height="30"><input type="text" name="textfield"  style="height:18px; width:130px; border:solid 1px #cadcb2; font-size:12px; color:#81b432;"></td>
              </tr>
              <tr>
                <td height="30"><div align="center"><span class="STYLE3">密码</span></div></td>
                <td height="30"><input type="password" name="textfield2"  style="height:18px; width:130px; border:solid 1px #cadcb2; font-size:12px; color:#81b432;"></td>
              </tr>
              <tr>
                <td height="30">&nbsp;</td>
                <td height="30"><img src="<%=basePath%>/pages/login/images/dl.gif" width="81" height="22" border="0" usemap="#Map"></td>
              </tr>
            </table></td>
            <td width="255" background="<%=basePath%>/pages/login/images/login_08.gif">&nbsp;</td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td height="247" valign="top" background="<%=basePath%>/pages/login/images/login_09.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="22%" height="30">&nbsp;</td>
            <td width="56%">&nbsp;</td>
            <td width="22%">&nbsp;</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td height="30"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="44%" height="20">&nbsp;</td>
                <td width="56%" class="STYLE4">版本 2015V1.0 </td>
              </tr>
            </table></td>
            <td>&nbsp;</td>
          </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td bgcolor="#a2d962">&nbsp;</td>
  </tr>
</table>

<map name="Map"><area shape="rect" coords="3,3,36,19" href="#"><area shape="rect" coords="40,3,78,18" href="#"></map>

<!-- ---------------------------------------------------------------------------- -->
  <!--this is my jsp!  --> 
    <!--<s:form  action="loginUserinfo.action"  method="post">
    	<s:textfield name="sUsercode" label="用户"/>e
    	<s:textfield name="sUsername" label="密码"/>
    	<s:submit value="添加"/>
   </s:form>-->
   
   <!--<s:form action="loginUserinfo.action" method="post" >
  		用户名：<s:textfield name="user.usercode"/><br/>
  		 密 码：<s:password name="user.username"/><br/>
         <s:submit value="提交"/> 
   </s:form>-->
   
</body>
</html>