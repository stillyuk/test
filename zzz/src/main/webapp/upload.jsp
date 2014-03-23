<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>
<head>
<title>文件上传</title>
</head>
<body>
	<form action="upload/upload" enctype="multipart/form-data" method="post">
		文件:<input type="file" name="image"> <input type="submit" value="上传" />
		 
	</form>
	<br />
</body>
</html>