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
<caption>출력현황</caption>
<tr> 
<th>번호</th> <th>이름</th> <th>나이</th> <th>거주지</th> 
<th>국어</th> <th>영어</th> <th>수학</th> 
</tr>
<c:forEach var="i" items="${list }">
<tr>
<td>${i.bun} </td>
<td>
<a href="<c:url value='/delete?name=${i.name}'/>">
${i.name }
</a>
</td>

<td>${i.age }</td>
<td>${i.address }</td>
<td>${i.myscoreDTO.kor }</td>
<td>${i.myscoreDTO.eng }</td>
<td>${i.myscoreDTO.mat }</td>

</tr>

</c:forEach>

</table>

<a href="main">메인으로</a>
</body>
</html>