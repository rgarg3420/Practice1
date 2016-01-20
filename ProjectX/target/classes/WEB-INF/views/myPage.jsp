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
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script >
$(document).ready(function(){
	
	$('#ajaxForm').submit(function(event){
		alert('1');
		var dataName = $('#name').val();
		var dataAge = $('#age').val();
		 var json =  "Name=" + dataName+ "&Age=" + dataAge;

		alert('2');
		$.ajax({
			url: $("#ajaxForm").attr( "action"),
			        data: json,
			        type: "POST",
			       /*   beforeSend: function(xhr){
			        	xhr.setRequestHeader("Accept","application/json");
			        	xhr.setRequestHeader("Content-type","application/json");
			        },  */
			        success:function(customer){
			        	 var  response  = "Success";      	       	 
			        	
			        	             $("#custData").html(response); 
			        	             alert(response);
			        }
		});
		
		event.preventDefault();
	});
});
</script>

<title><spring:message code="label.title"></spring:message></title>
</head>
<body>
<div id="custData"></div>
<spring:message code="label.firstName"/>
<c:out value="${firtsName}"/><br/>

<spring:message code="label.lastName"/>
<c:out value="${lastName}"/><br/>

<form:form action="/ProjectX/sendAjaxData" id="ajaxForm" modelAttribute="customer">

<c:out value="Name: "/>
<form:input path="name" id="name"/>

<c:out value="Age: "/>
<form:input path="age" id="age"/>

<input type="submit" value="Submit">


</form:form>

</body>
</html>