<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>float</title>
<style>
.test:AFTER {
	content: "(adsf)";
}
</style>
</head>
<body>
	<div style="width: 600px; height: 500px; border: solid 1px blue; background-color: yellow;">
		<div style="float: left; width: 250px; height: 250px; border: solid 1px Aqua; background-color: gray; margin: 10px 0 0 10px;">
			浮动DIV
		</div>
		<div style="background-color: red; border: solid 1px green; width: 300px; height: 150px;">
			跟在浮动元素后边的DIV
		</div>
		<span style="background-color: red; border: solid 1px green; margin: 0 0 0 -50px;">
			跟在浮动元素后边的span
		</span>
		<p>abad</p>
		<div style="background-color: red;" class="test">asdf</div>
	</div>
</body>
</html>