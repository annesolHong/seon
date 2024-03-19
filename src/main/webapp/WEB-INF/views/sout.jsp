<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1" width="450px" align="center">
<caption>실습출력</caption>
<tr> 
<th>아이디</th> <th>이름</th> <th>전화</th> <th>총점</th> 
<th>직위</th> <th>수령액</th> </tr>
<c:forEach var="i" items="${list }">
<tr>
<td>${i.id} </td>
<td>
<a href="<c:url value='/delete?name=${i.name}'/>">
${i.name }
</a>
</td>

<td>${i.tel }</td>
<td>${i.scoredto.tot }</td>
<td>${i.insadto.position }</td>
<td>${i.insadto.pay }</td>

</tr>

</c:forEach>

</table>

<a href="main">메인으로</a>
</body>
</html>