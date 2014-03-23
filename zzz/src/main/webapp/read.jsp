<%@ page language="java" contentType="text/html; charset=utf-8"
	import="java.sql.*,com.hibtest1.entity.*,java.util.*"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>极速蜗牛英语学习网站</title>
<link rel="icon" href="picture/favicon.ico" type="image/x-icon" />
<link rel="shortcut icon" href="picture/favicon.ico" type="image/x-icon">
<link rel="stylesheet" href="style.css" type="text/css" />
<style type="text/css">
#main {
	height: 560px;
	width: 85%;
}
</style>
</head>
<body>
	<div id="top">
		<div id="top_txt">
			<a href="#" onclick="AddFavorite()">收藏此页</a><a href="#"
				onclick="SetHome(this,window.location)">|设为首页</a> <a href="#"
				onclick="reload()">|刷新当前页</a>
		</div>
		<h5>
			<em><marquee scrollamount="6" behavior="alternate" loop="3">极速蜗牛英语学习网站</marquee></em>
		</h5>
	</div>
	<div id="vi">
		<div id="photo">
			<img src="picture/logo.png">
		</div>
	</div>
	<div id="nav">
		<ul>
			<li><a href="#" target="_self">首页</a></li>
			<li class="bar">|</li>
			<li><a href="#" target="_self">背单词</a></li>
			<li class="bar">|</li>
			<li><a href="#" target="_self">阅读</a></li>
			<li class="bar">|</li>
			<li><a href="#" target="_self">做练习</a></li>
			<li class="bar">|</li>
			<li><a href="#" target="_self">炼句</a></li>
			<li class="bar">|</li>
			<li><a href="#" target="_self">交流区</a></li>
			<li class="bar">|</li>
			<li><a href="#" target="_self">资料共享区</a></li>
		</ul>
	</div>
	<div id="main">
		<table class="content">
			<tr>
				<td align="center">阅读练习</td>
			</tr>
			<%
				List<Read> list = (List<Read>) session.getAttribute("read");
				StringBuffer choice = new StringBuffer("cc");
				for (int i = 0; i < list.size(); i++) {
					choice.replace(1, 4, new Integer(i).toString());
					Read read = list.get(i);
			%>
			<tr>
				<td><%=(i + 1) + " :" + read.getRid()%></td>

			</tr>
			<%
				}
			%>
		</table>
	</div>
</body>
</html>