<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Edit</title>
</head>
<body>
    <frm:form action="edit" method="post" modelAttribute="employee">
        ID: <frm:input path="id" readonly="true"/><br>
        Name: <frm:input path="name"/><br>
        Salary: <frm:input path="salary"/><br>
        Department: <frm:input path="depart"/><br>
        Hire Date: 
<%--         <frm:input path="hiredate" type="date" /><br> <!-- Use type="date" for HTML5 date input -->
 --%>        <input type="submit" value="Save"><br>
        <input type="reset" value="Cancel"><br>
    </frm:form>
</body>
</html>