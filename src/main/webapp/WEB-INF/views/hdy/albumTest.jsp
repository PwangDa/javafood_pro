<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "com.java.food.dao.JavafoodDAO"
    import = "album.info.AlbumVO"
    import = "javafood_DTO.AlbumDTO"
    import = "SecondProject.JavaFood_DAO"
    import = "java.util.List"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Album 이ㅣㅇ걸est</title>
<script link src ="javafoodScript/albumScript.js"></script>
<style>       
        <c:forEach var="album" items="${listMusic}" varStatus="loop"> 
        	.cont2_${loop.count}:hover span{
        		display : none;
        	}
  
        	.cont2_${loop.count}:hover .but{
        		display : block;
        	}       
        </c:forEach>
</style>
<link rel="stylesheet" href="javafoodCSS/albumCSS.css?css=css">
</head>
<body>
   <%-- <jsp:include page="/views/menu.jsp"></jsp:include> --%>
    <div id = "home">
        <div class="cont1">
            <div class="cont1_1">
                <img class="img1" src="${listMusic[0].album_cover }">
            </div>
            <div class="cont1_1">
                <h1>${listMusic[0].album_name }</h1>
                <p><a href="/javafood_team/javafood?javafood=ArtistList&num=${listMusic[0].album_add}">${listMusic[0].artistname }</a></p>
                <p>${listMusic[0].album_into }</p>
                <details>
                    <summary style="color: rgb(150, 150, 150);">출처</summary>
                    <p>Wikipedia(https://ko.wikipedia.org/wiki)</p>
                </details>
                <br>
                <button class="btn" type="button" style="font-size: 16px;">+ 보관함에 추가</button>
            </div>
        </div>

        <c:forEach var="album" items="${listMusic}" varStatus="loop">
        	<div class= "musiclist ">
            	<div class="cont2 cont2_${loop.count}">
                	<div class="left_item" style="color: rgb(187, 187, 187);">${loop.count}</div>
                	<div class="left_item left_name"><a href="naver.com"><strong>${album.music_name}</strong></a></div>
                	<div class="right_item">
                	<input type="checkbox" class="but btn${loop.count}">
                	<span class="chek1" style="color: rgb(187, 187, 187);">${album.music_time}</span>
                	</div>
            	</div>		
        	</div>
        </c:forEach>
    </div>
</body>
</html>