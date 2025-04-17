<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee List</title>
    
   <script>
    function confirmDelete(empId) {
        if (confirm("Are you sure you want to delete this record of " + empId)) {
            window.location.href = "delete?no=" + empId;
        }
    }
</script>

</head>
<body>
    <c:choose>
        <c:when test="${!empty empList}">
            <table align="center" border="1">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Salary</th>
                    <th>Department</th>
                    <th>Hire Date</th>
                </tr>
                
                <c:forEach var="emp" items="${empList}">
                    <tr>
                        <td>${emp.id}</td>
                        <td>${emp.name}</td>
                        <td>${emp.salary}</td>
                        <td>${emp.depart}</td>
                       <%--  <td>
                            <fmt:formatDate value="${emp.hiredate}" pattern="dd-MM-yyyy" />
                        </td> --%>
                        <td>
                            <a href="edit?no=${emp.id}">Edit</a> | 
						    <button onclick="confirmDelete(${emp.id})">Delete</button>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </c:when>
        <c:otherwise>
            <p align="center">Employee not found</p>
            
        </c:otherwise>
    </c:choose>
                <a href="add">Add Employee</a>
    
</body>
</html>