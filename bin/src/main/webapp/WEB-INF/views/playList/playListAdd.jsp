<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%
// 	String songNumber = ""
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트에 노래 추가</title>
</head>
<body>
	<div class="title"><h1>노래를 추가할 플레이 리스트를 선택하세요.</h1></div>
	<br>
	<hr>
	<c:forEach var="playList" items="${ playList }">
		<!-- 누르면 추가함  -->
<%-- 		<a href="javafood?javafood=3_7&pl_id=${playList.pl_id }&addWhere=<%=addWhere%>&songNumber=<%=songNumber%>&songNumbers=<%=songNumbers%>"> --%>
			<div class="playList">
				<!-- 앨범 표지가 추가되면 해당 부분의 src를 수정할 것. -->
				<img class="album" src="https://image.bugsm.co.kr/album/images/original/203228/20322838.jpg?version=undefined">
				<div class="plText">${ playList.listTitle }</div>
			</div>
		</a>
	</c:forEach>
</body>
</html>