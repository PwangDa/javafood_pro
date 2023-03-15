<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- css파일 불러오기 -->
<link rel="stylesheet" href="resources/style/main.css">

</head>
<body>
<%-- 	<jsp:include page="/menu.jsp" /> --%>

	<br>
	<br>
	<br>

	<div class="topArea">
        <a class="topButton" href="javafood?javafood=7"><span>최신 음악</span></a>
        <a class="topButton" href="javafood?javafood=2"><span>차트</span></a>
        <a class="topButton" href="javafood?javafood=6"><span>장르</span></a>
    </div>
    
    <br>
    <br>
    <%--검색 내용 출력 --%>
    <c:if test="${ls!=null }">
  		<table>
   			<tr>
   				<th>이미지</th>
				<th>노래</th>
				<th>가수</th>
				<th>앨범</th>
				<th>시간</th>
				<th>하트</th>
				<th>보관</th>
   			</tr>
   			<c:forEach items="${ls }" var="i">
	   			<tr class="ddr">
					<td><a class="at" href="${i.link }"><img src="${i.imglink }"></a></td>
					<td><a class="at" href="${i.link }"><c:out value="${i.songname }"/></a></td>
					<td><a class="at" href="javafood?javafood=ArtistList&num=${i.songnumber }"><c:out value="${i.artistname }"/></a></td>
					<td><a class="at" href="javafood?javafood=AlbumList&num=${i.songnumber }"><c:out value="${i.album_name}"/></a></td>
					<td><c:out value="${i.playtime }"/></td>
					<td>
						<input type="image"  src="https://c11.kr/1asbx" 
						onmouseover="this.src='https://c11.kr/1asby'" 
						onmouseout="this.src='https://c11.kr/1asbx'"
						class="sub" onclick="good(${i.songnumber})">
					</td>
					<td>
						<form name="addPlayList" method="post" action="/javafood_team/javafood?javafood=3_6" onclick="this.submit();">
							<img class="img" src="https://c11.kr/1asd6" 
								onmouseover="this.src='https://c11.kr/1asd9'" 
								onmouseout="this.src='https://c11.kr/1asd6'">
	               			<input type="hidden" name="songNumber" value="${i.songnumber }">
	               			<input type="hidden" name="addWhere" value="main">
         	  			</form>
					</td>
				</tr>
   			</c:forEach>
 		</table>
    </c:if>
    <%-- 매인 리스트 목록 --%>
    <c:if test="${ls==null }">
	    <div class="hitList">
	    	<div class="subtitle">
	    		인기곡
	    		<div class="hitListController">
	    			<p class="point prev"><</p>
	    			<p class="point next">></p>
	    		</div>
	    	</div>
	    </div>
	    
	    <br>
	    
	    <div class="songContent songContentPage0">
	    
		    <div id="hitListLine">
		    	<c:forEach var="hitList" items="${hitList }" varStatus="vs">
			    	<c:if test="${vs.count<=4 }">
			            <div class="hitListViewerContent">
			                <div class="hitListViewerThumnail">
			                    <img class="thumnail" src="${hitList.imglink }">
			                </div>
			    
			                <div class="hitListRank">${hitList.songnumber }</div>
			    
			                <div class="songContentInfo">
			    
			                    <div class="hitListViewerSongTitle">
			                        <a href="${hitList.link }">${hitList.songname }</a>
			                    </div>
			                    <div class="hitListViewerSongInfo">
			                    <!-- 곡 정보와 앨범 정보 DB가 생기면 링크를 수정할 것. -->
			                        <a href="javascript:void(0)">${hitList.artistname }</a>·<a href="javascript:void(0)">${hitList.album }</a>
			                    </div>
			                </div>
			            </div>
			    	</c:if>
		    	</c:forEach>
		    </div>
	
	    
		    <div id="hitListLine">
		    	<c:forEach var="hitList" items="${hitList }" varStatus="vs">
			    	<c:if test="${vs.count>=5 && vs.count<=8}">
			            <div class="hitListViewerContent">
			                <div class="hitListViewerThumnail">
			                    <img class="thumnail" src="${hitList.imglink }">
			                </div>
			    
			                <div class="hitListRank">${hitList.songnumber }</div>
			    
			                <div class="songContentInfo">
			    
			                    <div class="hitListViewerSongTitle">
			                        <a href="${hitList.link }">${hitList.songname }</a>
			                    </div>
			                    <div class="hitListViewerSongInfo">
			                    <!-- 곡 정보와 앨범 정보 DB가 생기면 링크를 수정할 것. -->
			                        <a href="javascript:void(0)">${hitList.artistname }</a>·<a href="javascript:void(0)">${hitList.album }</a>
			                    </div>
			                </div>
			            </div>
			    	</c:if>
		    	</c:forEach>
		    </div>
	    
		    <div id="hitListLine">
		    	<c:forEach var="hitList" items="${hitList }" varStatus="vs">
			    	<c:if test="${vs.count>=9 && vs.count<=12}">
			            <div class="hitListViewerContent">
			                <div class="hitListViewerThumnail">
			                    <img class="thumnail" src="${hitList.imglink }">
			                </div>
			    
			                <div class="hitListRank">${hitList.songnumber }</div>
			    
			                <div class="songContentInfo">
			    
			                    <div class="hitListViewerSongTitle">
			                        <a href="${hitList.link }">${hitList.songname }</a>
			                    </div>
			                    <div class="hitListViewerSongInfo">
			                    <!-- 곡 정보와 앨범 정보 DB가 생기면 링크를 수정할 것. -->
			                        <a href="javascript:void(0)">${hitList.artistname }</a>·<a href="javascript:void(0)">${hitList.album }</a>
			                    </div>
			                </div>
			            </div>
			    	</c:if>
		    	</c:forEach>
		    </div>
	    
		    <div id="hitListLine">
		    	<c:forEach var="hitList" items="${hitList }" varStatus="vs">
			    	<c:if test="${vs.count>=13 && vs.count<=16}">
			            <div class="hitListViewerContent">
			                <div class="hitListViewerThumnail">
			                    <img class="thumnail" src="${hitList.imglink }">
			                </div>
			    
			                <div class="hitListRank">${hitList.songnumber }</div>
			    
			                <div class="songContentInfo">
			    
			                    <div class="hitListViewerSongTitle">
			                        <a href="${hitList.link }">${hitList.songname }</a>
			                    </div>
			                    <div class="hitListViewerSongInfo">
			                    <!-- 곡 정보와 앨범 정보 DB가 생기면 링크를 수정할 것. -->
			                        <a href="javascript:void(0)">${hitList.artistname }</a>·<a href="javascript:void(0)">${hitList.album }</a>
			                    </div>
			                </div>
			            </div>
			    	</c:if>
		    	</c:forEach>
		    </div>
	    
		    <div id="hitListLine">
		    	<c:forEach var="hitList" items="${hitList }" varStatus="vs">
			    	<c:if test="${vs.count>=17 && vs.count<=20}">
			            <div class="hitListViewerContent">
			                <div class="hitListViewerThumnail">
			                    <img class="thumnail" src="${hitList.imglink }">
			                </div>
			    
			                <div class="hitListRank">${hitList.songnumber }</div>
			    
			                <div class="songContentInfo">
			    
			                    <div class="hitListViewerSongTitle">
			                        <a href="${hitList.link }">${hitList.songname }</a>
			                    </div>
			                    <div class="hitListViewerSongInfo">
			                    <!-- 곡 정보와 앨범 정보 DB가 생기면 링크를 수정할 것. -->
			                        <a href="javascript:void(0)">${hitList.artistname }</a>·<a href="javascript:void(0)">${hitList.album }</a>
			                    </div>
			                </div>
			            </div>
			    	</c:if>
		    	</c:forEach>
		    </div>
	    
		    <div id="hitListLine">
		    	<c:forEach var="hitList" items="${hitList }" varStatus="vs">
			    	<c:if test="${vs.count>=21 && vs.count<=24}">
			            <div class="hitListViewerContent">
			                <div class="hitListViewerThumnail">
			                    <img class="thumnail" src="${hitList.imglink }">
			                </div>
			    
			                <div class="hitListRank">${hitList.songnumber }</div>
			    
			                <div class="songContentInfo">
			    
			                    <div class="hitListViewerSongTitle">
			                        <a href="${hitList.link }">${hitList.songname }</a>
			                    </div>
			                    <div class="hitListViewerSongInfo">
			                    <!-- 곡 정보와 앨범 정보 DB가 생기면 링크를 수정할 것. -->
			                        <a href="javascript:void(0)">${hitList.artistname }</a>·<a href="javascript:void(0)">${hitList.album }</a>
			                    </div>
			                </div>
			            </div>
			    	</c:if>
		    	</c:forEach>
		    </div>
	    
		    <div id="hitListLine">
		    	<c:forEach var="hitList" items="${hitList }" varStatus="vs">
			    	<c:if test="${vs.count>=25 && vs.count<=28}">
			            <div class="hitListViewerContent">
			                <div class="hitListViewerThumnail">
			                    <img class="thumnail" src="${hitList.imglink }">
			                </div>
			    
			                <div class="hitListRank">${hitList.songnumber }</div>
			    
			                <div class="songContentInfo">
			    
			                    <div class="hitListViewerSongTitle">
			                        <a href="${hitList.link }">${hitList.songname }</a>
			                    </div>
			                    <div class="hitListViewerSongInfo">
			                    <!-- 곡 정보와 앨범 정보 DB가 생기면 링크를 수정할 것. -->
			                        <a href="javascript:void(0)">${hitList.artistname }</a>·<a href="javascript:void(0)">${hitList.album }</a>
			                    </div>
			                </div>
			            </div>
			    	</c:if>
		    	</c:forEach>
		    </div>
		
		    <div id="hitListLine">
		    	<c:forEach var="hitList" items="${hitList }" varStatus="vs">
			    	<c:if test="${vs.count>=29 && vs.count<=32}">
			            <div class="hitListViewerContent">
			                <div class="hitListViewerThumnail">
			                    <img class="thumnail" src="${hitList.imglink }">
			                </div>
			    
			                <div class="hitListRank">${hitList.songnumber }</div>
			    
			                <div class="songContentInfo">
			    
			                    <div class="hitListViewerSongTitle">
			                        <a href="${hitList.link }">${hitList.songname }</a>
			                    </div>
			                    <div class="hitListViewerSongInfo">
			                    <!-- 곡 정보와 앨범 정보 DB가 생기면 링크를 수정할 것. -->
			                        <a href="javascript:void(0)">${hitList.artistname }</a>·<a href="javascript:void(0)">${hitList.album }</a>
			                    </div>
			                </div>
			            </div>
			    	</c:if>
		    	</c:forEach>
		    </div>
	    
		    <div id="hitListLine">
		    	<c:forEach var="hitList" items="${hitList }" varStatus="vs">
			    	<c:if test="${vs.count>=33 && vs.count<=36}">
			            <div class="hitListViewerContent">
			                <div class="hitListViewerThumnail">
			                    <img class="thumnail" src="${hitList.imglink }">
			                </div>
			    
			                <div class="hitListRank">${hitList.songnumber }</div>
			    
			                <div class="songContentInfo">
			    
			                    <div class="hitListViewerSongTitle">
			                        <a href="${hitList.link }">${hitList.songname }</a>
			                    </div>
			                    <div class="hitListViewerSongInfo">
			                    <!-- 곡 정보와 앨범 정보 DB가 생기면 링크를 수정할 것. -->
			                        <a href="javascript:void(0)">${hitList.artistname }</a>·<a href="javascript:void(0)">${hitList.album }</a>
			                    </div>
			                </div>
			            </div>
			    	</c:if>
		    	</c:forEach>
		    </div>
	    
		    <div id="hitListLine">
		    	<c:forEach var="hitList" items="${hitList }" varStatus="vs">
			    	<c:if test="${vs.count>=37 && vs.count<=40}">
			            <div class="hitListViewerContent">
			                <div class="hitListViewerThumnail">
			                    <img class="thumnail" src="${hitList.imglink }">
			                </div>
			    
			                <div class="hitListRank">${hitList.songnumber }</div>
			    
			                <div class="songContentInfo">
			    
			                    <div class="hitListViewerSongTitle">
			                        <a href="${hitList.link }">${hitList.songname }</a>
			                    </div>
			                    <div class="hitListViewerSongInfo">
			                    <!-- 곡 정보와 앨범 정보 DB가 생기면 링크를 수정할 것. -->
			                        <a href="javascript:void(0)">${hitList.artistname }</a>·<a href="javascript:void(0)">${hitList.album }</a>
			                    </div>
			                </div>
			            </div>
			    	</c:if>
		    	</c:forEach>
		    </div>
		</div>
    </c:if>



	<!-- js파일 불러오기 -->
	<script src="resources/script/main.js" />
</body>
</html>