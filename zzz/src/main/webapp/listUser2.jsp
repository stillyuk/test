<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<s:iterator value="listPhrase" var="list">
		<s:property value="#list.pcontent" />
		<s:property value="#list.pword" /><br/>
	</s:iterator>
	<s:iterator value="pageBean">
		<tr>
			<td colspan="6" align="center" bgcolor="#5BA8DE">共<s:property
					value="allRow" />条记录 共<s:property value="totalPage" />页 当前第<s:property
					value="currentPage" />页<br>
				
				<s:if test="%{currentPage == 1}">    
           			第一页  上一页    
         		</s:if> <s:else>
					<a href="listUser2.action?page=1">第一页</a>
					<a
						href="listUser2.action?page=<s:property value="%{currentPage-1}"/>">上一页</a>
				</s:else> <s:if test="%{currentPage != totalPage}">
					<a
						href="listUser2.action?page=<s:property value="%{currentPage+1}"/>">下一页</a>
					<a href="listUser2.action?page=<s:property value="totalPage"/>">最后一页</a>
				</s:if> <s:else>    
         下一页  最后一页    
         </s:else>
			</td>
		</tr>
	</s:iterator>

</body>
</html>