<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>welcome</title>
<link rel="stylesheet" type="text/css" href="/css/desktop/home.css" />
</head>
<body>
	<div class="user">
		<a href="">${username}</a> 欢迎您
	</div>
		<div style="clear:both"></div>
	<div class="navigation">
		<div class="navigation-menu"><a href="../file/upload">上传文件</a></div>
		<div class="navigation-menu"><a href="../file/showAllFiles">下载文件</a></div>
		<div class="navigation-menu"><a href="../group/addGroup">新建组</a></div>
	</div>
	<div style="clear:both"></div>
	<div>
		<#if allFiles ??>
			<#list allFiles as file>
				<a href="download?fileName=${file.name}">${file.name}</a>
			</#list>
		</#if>
	</div>
</body>
</html>