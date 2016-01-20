<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" 
           uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.error {
    color: #ff0000;
    font-style: italic;
    font-weight: bold;
}
</style>
</head>
<body>
<form:form method="post" action="/ProjectX/ValidateData" modelAttribute="customer">

<spring:message code="label.name"/>
<form:input path="name"/>
<br/>
<form:errors path="name" cssClass="error"/>
<br/>
<spring:message code="label.age"/>
<form:input path="age"/>
<br/>
<form:errors path="age" cssClass="error"/>
<br/><br/>
<input type="submit" value="Submit">
</form:form>
</body>
</html>