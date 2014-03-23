<%@ page language="java" contentType="text/html; charset=utf-8"
	import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="statePhrase/phraseChoice" method="post">
		<table id="phraseSearch" width="380" height="66">
			<tr>
				<td><input type="radio" name="phrase.pstate" value="4" checked />
					CET-4 <input type="radio" name="phrase.pstate" value="6" checked />CET-6</td>
			</tr>
			<tr><td><input type="submit" align="left" value="确认" /></td></tr>
		</table>
	</form>
</body>
</html>