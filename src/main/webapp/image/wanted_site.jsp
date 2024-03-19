<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function load(){
	var s=document.getElementById("site");
	window.location=s.options[s.selectedIndex].value;
	
}

</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


싸이트 선택 : 
<select name="site" id="site">
  <option value="http://www.google.com">구글</option>
  <option value="http://www.naver.com">네이버</option>
  <option value="http://www.daum.net">다음</option>
</select>
<button onclick="load()">웹사이트접속</button>

</body>
</html>