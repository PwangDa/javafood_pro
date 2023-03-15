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
<title><%= id %>님의 ${ playListContent[0].pl_title }</title>

<!-- css 파일 불러오기 -->
<link rel="stylesheet" href="resources/style/playListContent.css">


</head>
<body>
	<!-- 상단바 jsp 삽입하기 -->
<%-- 	<jsp:include page="javascrpit:void(0)" /> --%>
	
		<c:choose>
		<%-- 해당 플레이 리스트의 내용이 하나도 없다면 --%>
		<c:when test="${ empty playListContent }">
		<div class="album_info">
				<!-- 아래 코드는 플레이 리스트의 대표 앨범사진 코드. 좀 더 고민해보기. -->
				<img class="list_thumnail" src="https://image.bugsm.co.kr/album/images/original/203228/20322838.jpg?version=undefined">
				<br>
				<br>
				<h2 style="text-shadow:2px 2px 2px gray; color:whitesmoke;">${ playListContent[0].pl_title }</h2>
				<br>
				<div class="ablum_explain">
					${ playListContent[0].pl_explain }
				</div>
			</div>
				
			<span class="delete">
				<form name="deleteList">
					<input type="hidden" name="pl_id" value="${ playListContent[0].pl_id }">
					<input type="hidden" name="id" value="<%=id %>">
					<input type="hidden" name="javafood" value="3_5">
					<img class="delete_icon" src="https://popcat.click/twitter-card.jpg" width="50">
					<img class="delete_icon2 hidden" src="https://play-lh.googleusercontent.com/ID5wHCs0FsgS018pX0e0My5z3u4cBG7dAYAr2owB9gwylWaNZTJ0pWAKl9It7ys5iEM" width="50">
					<div style="font-size:12px; text-align:center;">삭제하기</div>
				</form>
 			</span>
			<div class="noList list_parent">등록된 곡이 없습니다.<br>곡을 추가해 주세요.</div>
		</c:when>
		
		<%-- 해당 플레이 리스트의 내용이 하나라도 존재한다면 --%>
		<c:when test="${ !empty playListContent }">
			<div class="album_info">
				<!-- 아래 코드는 플레이 리스트의 대표 앨범사진 코드. 좀 더 고민해보기. -->
				<img class="list_thumnail" src="https://image.bugsm.co.kr/album/images/original/203228/20322838.jpg?version=undefined">
				<br>
				<br>
				<a href="${ list.link }"><h2 style="text-shadow:2px 2px 2px gray; color:whitesmoke;">${ playListContent[0].pl_title }</h2></a>
				<br>
				<div class="ablum_explain">
					${ playListContent[0].pl_explain }
				</div>
			</div>
				
			<span class="delete">
				<form name="deleteList">
					<input type="hidden" name="pl_id" value="${ playListContent[0].pl_id }">
					<input type="hidden" name="id" value="<%=id %>">
					<input type="hidden" name="javafood" value="3_5">
					<img class="delete_icon" src="https://popcat.click/twitter-card.jpg" width="50">
					<img class="delete_icon2 hidden" src="https://play-lh.googleusercontent.com/ID5wHCs0FsgS018pX0e0My5z3u4cBG7dAYAr2owB9gwylWaNZTJ0pWAKl9It7ys5iEM" width="50">
					<div style="font-size:12px; text-align:center;">삭제하기</div>
				</form>
 			</span>
 				
			<div class="list_parent">
			<c:forEach var="list" items="${ playListContent }">
				<div class="list_child">
					<img class="album" src="${ list.imageLink }">
					<div class="list_info">
						<span class="song_title">${ list.songName }</span>
						<br>
						<br>
						${ list.artistName }
						<br>
						${ list.album }
					</div>
					<span class="deleteSong">
						<form class="deleteSong">
							<img class="sDelete_icon" src="https://popcat.click/twitter-card.jpg" width="25">
							<img class="sDelete_icon2 hidden" src="https://play-lh.googleusercontent.com/ID5wHCs0FsgS018pX0e0My5z3u4cBG7dAYAr2owB9gwylWaNZTJ0pWAKl9It7ys5iEM" width="25">
							<input type="hidden" name="javafood" value="3_4">
							<input type="hidden" name="listNumber" value="${ list.listNumber }">
							<input type="hidden" name="PL_ID" value="${ list.pl_id }">
						</form>
					</span>
				</div>
				<form name="PLC_delete_list">
					<input type="hidden" name="doDeleteList" value="doDelete">
					<input type="hidden" name="res.PL_ID" value="${ list.pl_id }">
				</form>
			</c:forEach>
			</div>
		</c:when>
	</c:choose>
	   	
   	
   	<!-- js파일 불러오기 -->
   	<script src="resources/script/playListContent.js"></script>
   	
   	
</body>
</html>