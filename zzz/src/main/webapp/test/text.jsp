<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.sql.*,com.hibtest1.entity.*,java.util.*"
	pageEncoding="UTF-8"%>
<%@ taglib prefix='s' uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>做练习啦！</title>
</head>
<body>
	<table class="content">
		<tr>
			<td align="center">阅读练习</td>
		</tr>
		<%
			List<Test> list = (List<Test>) session.getAttribute("testlist");
			StringBuffer choice = new StringBuffer("cc");
			for (int i = 0; i < list.size(); i++) {
				choice.replace(1, 4, new Integer(i).toString());
				Test test = list.get(i);
				 
		%>
		<tr>
			<td><%=(i + 1) + " :" + test.getTcontent()%></td>	
		</tr>
		<%
		

			}
		%>
	</table>
</body>
</html>