<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" 
           uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
<c:out value="ID:"/>
<c:out value="${id}" escapeXml="true"></c:out>

<c:out value="Name:"/>
<c:out value="${name}" escapeXml="true"></c:out>

<c:out value = "Super Hero : "/><c:out value="${superHeroName}" escapeXml="true"></c:out>
<c:out value="lives in "/><c:out value="${superHeroCity}" escapeXml="true"></c:out>
<c:out value="has alias name as :"/><c:out value="${alias}" escapeXml="true"/>


<form:form  action = "/ProjectX/sendData" modelAttribute="customer" method="post" >

<c:out value="Name"/>
<form:input  path="name" id="name" />
<c:out value="Age"/>
<form:input  path="age" id="age"/>
<br/>
<input type="submit" value="Submit">

</form:form>

</body>
</html>