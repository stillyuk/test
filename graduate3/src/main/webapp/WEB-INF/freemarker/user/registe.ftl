<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户注册</title>
<link rel="stylesheet" type="text/css" href="../css/login.css" />
</head>
<body>
		<div class="center-form">
		<form action="signIn" method="POST">
			<div class="form-head">注册</div>
			<div class="form-tips"></div>
			<div class="form-body">
				用户名：<input class="form-input" type="text" name="username" />
				密码：<input class="form-input" type="password" name="password" />
				手机/邮箱：<input class="form-input" type="text" name="username" />
				验证码<input class="form-input" type="text" />
				<input class="form-button" type="submit" value="注册" />
				<a href="/user/login">点击登陆</a>
			</div>
		</form>
	</div>
</body>
</html>