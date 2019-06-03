<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix= "s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>计算两数之和</title>
</head>
<body>
	<h2>求和</h2>
	<s:form action = "mystruts/calSum">
	<s:textfield name = "num1" label = "数1"></s:textfield>
	<s:textfield name = "num2" label = "数2"></s:textfield>
	<s:submit value = "求和"/>
	</s:form>

</body>
</html>