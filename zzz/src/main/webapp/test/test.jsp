<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.sql.*,com.hibtest1.entity.*,java.util.*"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix='s'%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	<s:iterator value="testlist" var="test">
		<s:property value="#test.tcontent" />
		<br/>
		<s:iterator value="#test.bks" var="question">
			<s:property value="qcontent" />
			<br/>
		</s:iterator>
		<hr/>
	</s:iterator>
</body>
</html>