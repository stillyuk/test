<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>上传文件</title>
<style>
	.file-box {
		position: relative;
		width: 370px;
		padding: 10px 10px;
		margin: 10px 10px;
	}
	.file {
		position: absolute;
		width: 285px;
		top: 15px;
		left: 10px;
		opacity: 0;
	}
	.text {
		position: relative;
		top: 5px;
		width: 200px;
	}
	.btn {
		position: relative;
		width: 75px;
		height: 26px;
		top: 5px;
		font-size: 16px;
	}
	.registeInfo {
		border: 1px dotted #ccc;
	}
</style>
</head>
<body>
	<div class="file-box">
		<form method="POST" action="doUpload" enctype="multipart/form-data">
			<input type="text" class="text" id="text" />
			<input type="button" value="浏览" class="btn" />
			<input type="file" name="file" class="file" onchange="document.getElementById('text').value=this.value" />
			<input type="submit" value="提交" class="btn" />
		</form>
	</div>
</body>
</html>