<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理组</title>
<link rel="stylesheet" type="text/css" href="/css/desktop/group.css" />
<script type="text/javascript" src="/js/jquery-2.1.0.js"></script>
<script type="text/javascript" src="/js/desktop/registe.js"></script>
</head>
<body>
	<div>
		<#if allGroup ??>
			<#list allGroup as group>
				<a href="/group/${group.groupName}">${group.groupName}</a>
			</#list>
		</#if>
	</div>
</body>
</html>