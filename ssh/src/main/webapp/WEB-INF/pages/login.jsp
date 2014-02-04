<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>登陆系统</title>
<script src="../jquery/jquery.js"></script>
<script type="text/javascript" src="../js/init.js"></script>
<link type="text/css" rel="stylesheet" href="../css/css.css" />
</head>
<body>
	<div class="head">
		<div style="width:300px; height: 25px; float: left"></div>
		<div style="float:left;">
			<input class="search" id="search" type="text" />
			<span id="tip">Search</span>
		</div>
		<div class="head-action">
			<a class="button primary" href="">Sign in</a>
			<a class="button" href="">Sign up</a>
		</div>
		<div style="clear: both;"></div>
	</div>
	<div class="my-form" id="loginForm">
		<form method="post" action="signIn">
			<div class="my-form-head"><h1>Sign in</h1></div>
			<div class="my-form-body">
				<label for="username">Username or Email</label>
				<input name="username" class="input-block" type="text" />
				<label for="password">Password</label>
				<input name="password" class="input-block" type="password" />
				<input class="button" type="submit" value="Sign in" />
			</div>
		</form>
	</div>
</body>
</html>