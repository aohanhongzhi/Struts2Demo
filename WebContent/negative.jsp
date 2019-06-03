<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib prefix= "s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>显示和</title>
</head>
<body>
	结果小于0：
	<h1>
		<!-- 通过一个struts标签，来获取在Action里名为“sum”的属性对象。在myAction.java里，定义了一个getSum的方法，所以就会自动生成一个sum的属性。 -->
		<s:property value = "sum"/>
	</h1>
</body>
</html>