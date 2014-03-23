<%@ page language="java" contentType="text/html; charset=utf-8"
	import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix='s' uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>练习类型选择</title>
</head>
<body>
	<form action="state/stateChoice" method="post">
		<table id="advSearch" width="380" height="66">
			<tr>
				<td><input type="radio" name="test.tstate" value="4" checked />
					CET-4 <input type="radio" name="test.tstate" value="6" checked />CET-6</td>
			</tr>
			<tr>
				<td><s:submit align="left" value="确认" /></td>
			</tr>
		</table>
	</form>
</body>
</html>