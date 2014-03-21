<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>注册</title>
<link rel="stylesheet" href="/css/mobile/jquery.mobile-1.4.2.css" />
<script src="/js/jquery-2.1.0.js"></script>
<script src="/js/mobile/jquery.mobile-1.4.2.js"></script>
</head>
<body>
	<div data-role="page" id="foo">

		<div data-role="header">
			<h1>Foo</h1>
		</div>
		<div role="main" class="ui-content">
			<p>I'm first in the source order so I'm shown as the page.</p>
			<p>
				View internal page called <a href="#bar">bar</a>
			</p>
		</div>
		<div data-role="footer">
			<h4>Page Footer</h4>
		</div>
	</div>

	<div data-role="page" id="bar">
		<div data-role="header">
			<h1>Bar</h1>
		</div>
		<div role="main" class="ui-content">
			<p>I'm the second in the source order so I'm hidden when the page
				loads. I'm just shown if a link that references my id is beeing
				clicked.</p>
			<p>
				<a href="#foo">Back to foo</a>
			</p>
			<div data-role="footer">
				<h4>Page Footer</h4>
			</div>
		</div>
	</div>
</body>
</html>