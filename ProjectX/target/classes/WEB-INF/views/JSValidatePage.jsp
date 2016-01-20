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
<script src="//ajax.aspnetcdn.com/ajax/jquery.validate/1.11.0/jquery.validate.min.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>

<script src="//ajax.aspnetcdn.com/ajax/jquery.validate/1.11.0/additional-methods.js"></script>

<script >
$(document).ready(function(){
	var dataName = $('#name').val();
	var dataAge = $('#age').val();
	 var json =  "Name=" + dataName+ "&Age=" + dataAge;
	$.ajax({
		url: $("#ajaxForm").attr( "action"),
		        data: json,
		        type: "POST",
		       //  beforeSend: function(xhr){
		        //	xhr.setRequestHeader("Accept","application/json");
		        //	xhr.setRequestHeader("Content-type","application/json");
		        //},  
		        success:function(customer){
		        	 var  response  = "Success";      	       	 
		        	
		        	             $("#custData").html(response); 
		        	             alert(response);
		        }
	});
	
	
	$("#ajaxForm").validate({
		 rules: {
			 name: {
	                required:true,
	                minlenght:3
	              
	            },
	            age: {
	                required: true,
	                integer: true
	            }
	        }, 
	        messages: {
	        	name : {
	            required : 'Enter Username',
	            maxlength :'Not more than 30 Charachters',
	            minlength :'Should be more than 3 characters'
	        },
	        age:{
	        	required:"Enter Age",
	        	integer: "Should be integer"
	        }
	    }
		
	});
	event.preventDefault();
});
</script>

<title><spring:message code="label.title"></spring:message></title>
</head>
<body>


<form:form action="/ProjectX/sendAjaxJsonData" id="ajaxForm" modelAttribute="customer">

<spring:message code="label.name"/>
<form:input path="name" id="name" name="name"/>

<spring:message code="label.age"/>
<form:input path="age" id="age" name="age"/>

<input type="submit" value="Submit">


</form:form>

</body>
</html>