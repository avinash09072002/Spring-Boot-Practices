<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Employee</title>
</head>
<body>
    <h1>Add Employee</h1>
    <frm:form action="add" method="post" modelAttribute="employee">
        Name: <frm:input path="name"/>
        Salary: <frm:input path="salary"/>
        Department: <frm:input path="depart"/>
    
        <input type="submit" value="Save"><br>
        <input type="reset" value="Cancel"><br>
    </frm:form>
</body>
</html>
