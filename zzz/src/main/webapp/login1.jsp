<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix='s' uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
<link rel="stylesheet" href="style.css" type="text/css" />
<body>
	<s:form action="doLogin.action"  target="_parent">
		<table >
			<tr>
				<s:textfield name="loginName" label="用户名"
					style="width:300px; height:40px" />
			</tr>
			<tr>
				<s:textfield name="loginPwd" label="密码"
					style="width:300px; height:40px;" />
			</tr>
			<tr>
				<td><s:submit value="确认" />
				<td>
				<td><s:reset value="取消" />
				<td>
			</tr>

		</table>
	</s:form>
</body>
</html>