<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%
	String id = (String)request.getAttribute("id");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%= id %>님의 플레이 리스트</title>


<!-- css 파일 불러오기 -->
<link rel="stylesheet" href="resources/style/playList.css">


</head>
<body>
	<!-- 상단바 jsp 삽입하기 -->
<%-- 	<jsp:include page="javascript:void(0)" /> --%>
	<br>
	<div class="title"><h1><%= id %>님의 플레이 리스트</h1></div>
	    <br>
    <hr>
    <img class="addList" src="https://c11.kr/1asbg"> <span class="addList">리스트 추가</span>
    
    <div class="search hidden">
        <form name = "PL_addList">
        	<input type="hidden" name="javafood" value="3_2">
        	<input type="hidden" name="id" value="<%=id %>">
            <input type="text" name="addList_title" class="addList_textbar" placeholder="플레이리스트 제목을 입력해주세요."> <br>
            <input type="text" name="addList_explain" class="addList_ex_textbar" placeholder="플레이리스트 설명을 입력해주세요."> <br>
            <input type="button" name="addList_btn" class="addList_btn" value="추가">
        </form>
    </div>
    
    <br>
    
   	<c:choose>
   		<%-- 해당 유저의 플레이 리스트가 아무것도 없다면 --%>
		<c:when test="${ empty playList }">
			<div class="noList">등록된 리스트가 없습니다. 리스트를 추가해 주세요.</div>
		</c:when>
		
		<%-- 해당 유저의 플레이 리스트가 하나라도 존재한다면 --%>
		<c:when test="${ !empty playList }">
			<c:forEach var="list" items="${ playList }">
			<a href="playListContent?pl_id=${ list.pl_id }">
				<div class="playList">
					<!-- 앨범 표지가 추가되면 해당 부분의 src를 수정할 것. -->
					<img class="album" src="https://image.bugsm.co.kr/album/images/original/203228/20322838.jpg?version=undefined">
					<div class="plText">${ list.pl_title }</div>
				</div>
			</a>
			</c:forEach>
		</c:when>
   	</c:choose>
   	
   	
   	<!-- js파일 불러오기 -->
   	<script src="resources/script/playList.js"></script>
   	
   	
   	
</body>
</html>