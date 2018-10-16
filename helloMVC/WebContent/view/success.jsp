<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- JSP Expression Language -->
	<ul>
		<li> Id: ${customer.id}</li>
		<li> Name: ${customer.name}</li>
		<li> Email: ${customer.email}</li>
	</ul>
	<!-- JSTL -->
	<table>
		<c:forEach var="customer" items="${customers}">
			<tr>
				<td> ${customer.id}</td>
				<td> ${customer.name}</td>
				<td> ${customer.email}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>