<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>注册</title>
<link href="../css/registe.css" rel="stylesheet" />
<script src="../js/init.js"></script>
</head>
<body>
	<nav>
		<a href="#">home</a>
		<a href="#">home</a>
	</nav>
	<div class="my-form">
		<div class="my-form-head">
			registe
		</div>
		<div class="my-form-body">
			<form method="post" action="signUp">
				用户名：
				<input class="my-form-input" type="text" name="username" tabindex="1" />
				密码：
				<input class="my-form-input" type="password" name="password" tabindex="2" />
				<input class="my-form-button" type="submit" value="注册" tabindex="3" />
			</form>
		</div>
	</div>
</body>
</html>