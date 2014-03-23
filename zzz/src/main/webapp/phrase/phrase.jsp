<%@ page language="java" contentType="text/html; charset=utf-8"
	import="java.sql.*,com.hibtest1.entity.*,java.util.*"
	pageEncoding="utf-8"%>
	<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>炼句字啦！</title>
</head>
<body>
<s:iterator value="{'1','2','3','4','5'}" id='number'> 
    <s:property value='#number'/>A
</s:iterator>

</body>
</html>