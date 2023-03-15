<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <script src="https://code.jquery.com/jquery-3.6.3.js"></script>
	<script link src ="/music/resources/style/loginScript.js"></script>
	
	<link rel="stylesheet" href="/music/resources/style/loginCSS.css?css=css">
	
<c:if test="${good!=null }">
	<c:if test="${good==1 }"><script>alert("회원가입 성공")</script></c:if>
	<c:if test="${good==0 }"><script>alert("회원가입 실패")</script></c:if>
</c:if>

<c:if test="${re!=null }"><script>alert('회원정보 수정이 완료되었습니다. 다시 로그인 해주세요.')</script></c:if>

<c:if test="${membership!=null }">

	<title>javafood 회원가입</title>
	</head>
	<body>
	        <form id="form" method="post" action="http://localhost:8080/javafood_team/aj" 
		   		   enctype="multipart/form-data" 
		  		   accept-charset="utf-8">
		  		<div class="div_1" style="margin-top:30px;">
					<div><img src="https://c11.kr/1asbb" class="logo-img"><h1 style="margin-top:-11px;"><c:out value="Create Account"/></h1></div>
					<div class="upload">
						<img class="upload_img" src="http://localhost:8080/javafood_team/aj1?fileName=new_javafood.JPG" style="width: 150px;height: 150px;">
						<input type="file" name="file1">
						<input class="butt" type="button" id="but" value="업로드">
					</div>
				</div>
			</form>
			
	        <form method="post" action="javafood?javafood=4">
	            <div class="head">
	             	<table class="tdtd">
				        <tr class="tr">
				            <th></th>
				            <td>
				            <strong><c:out value=" 아이디 "/><span style="color:red;">*</span></strong>
				            <input class="ttt" type="text" name="Id1" id="Id1" placeholder="아이디(4~16자 사이의 영문+숫자)"></td>
				            <td></td>
				            <td><input class="butt" type="button" id="idbutt" value="중복 확인"></td>
				            <td><input type="checkbox" id="ch1" class="ch"></td>
				        </tr>
				        <tr class="tr">
				            <th></th>
				            <td>
				            <strong><c:out value="닉네임 "/><span style="color:red;">*</span></strong>
				            <input class="ttt" type="text" id="nic" name="nic" placeholder="닉네임(2~14자 사이)"></td>
				            <td></td>
				            <td><input class="butt" type="button" id="nicbutt" value="중복확인"></td>
				            <td><input type="checkbox" id="ch3" class="ch"></td>
				        </tr>
				        <tr>
				            <th></th>
				            <td>
				            <strong><c:out value="비밀번호 "/><span style="color:red;">*</span></strong>
				            <input class="ttt" type="password" id="pw1" name="PW1"placeholder="비밀번호(6~20자 사이)">
				            </td>
				            <td></td>
				            <td rowspan="2"><input class="butt" type="button" id="pwbutt" value="일치 확인"></td>
				            <td><input type="checkbox" id="ch2" class="ch"></td>
				        </tr>
				        <tr>
				            <th></th>
				            <td>
				            <input class="ttt" type="password" id="pw2" placeholder="비밀번호(확인)"></td>
				            <td></td>
				        </tr>
				               
				        <tr>
				            <th></th>
				            <td>
				            <strong><c:out value="이메일 "/><span style="color:red;">*</span></strong>
				            <input class="ttt" type="text" id="email" name="mail" placeholder="이메일(비밀번호 찾기에 사용됩니다.)"></td>
				            <td></td>
				            <td><input class="butt" type="button" id="mailbutt" value="인증번호 전송"></td>
				            <td><input type="checkbox" id="ch4" class="ch"></td>
				        </tr>
				        <tr id="mail">
				            <th></th>
				            <td>
				            <input class="ttt_2" type="text" placeholder="메일 인증번호"></td>
				            <td></td>
				            <td><input class="butt" type="button" id="mailchbutt" value="인증확인"></td>
				            <td><input type="checkbox" id="ch5" class="ch"></td>
				        </tr>
				        <tr>
				            <th id="pn" class="tr"></th>
				            <td>
				            	<strong><c:out value="주민등록 번호 "/><span style="color:red;">*</span></strong><br>
				                <input class="ttt_2" type="text" class="pn" name="pn1" id="pn1" placeholder="6자리 숫자">
				                <input class="ttt_2" type="password" class="pn" name="pn2" id="pn2" placeholder="******">
				            </td>
				            <td></td>
				            <td><input class="butt" type="button" id="pnbutt" value="중복확인"></td>
				            <td><input type="checkbox" id="ch6" class="ch"></td>
				        </tr>
				        <tr>
				            <th class="tr"></th>
				            <td>
				            	<strong><c:out value=" 휴대폰 번호 "/><span style="color:red;">*</span></strong><br>
				                <input class="ttt_1" type="text" class="phone" name="phone1" id="phone1" placeholder="010">
				                <input class="ttt_1" type="text" class="phone" name="phone2" id="phone2" placeholder="1234">
				                <input class="ttt_1" type="text" class="phone" name="phone3" id="phone3" placeholder="4567">
				            </td>
				            <td></td>
				            <td><input class="butt" type="button" id="phonebutt" value="연락처 확인"></td>
				            <td><input type="checkbox" id="ch7" class="ch"></td>
				        </tr>
				        <tr>
				        	<th class="tr"></th>
				            <th><input class="sub butt" type="reset" id="re" value="다시작성"></th>
				        	<td></td>
				            <th><input class="sub" type="submit" value="회원가입" id="end" disabled></th>
				        </tr>
				    </table>
	            </div>
	            <a href="login" class="at"><c:out value=" 이미 가입하셨다면, 로그인해 주세요! "/></a>
	        </form>
	        <hr>
	</body>
	</html>
 </c:if>
 
 <c:if test="${log==2 }">
	<title>javafood</title>
	</head>
	<body>
		<h1><c:out value="javafood 로그인성공"/></h1>
		<h1>${login.nic } <c:out value="님 환영합니다."/></h1>
		<strong id="time"></strong><c:out value="초후에 매인 화면으로 이동됩니다. 마음의 준비를 해주세요."/>
		<script>loging();</script>
	</body>
	</html>
 </c:if>
<c:if test="${log==0 }"><script>alert('아이디가 틀렸습니다.');location.href='javafood?javafood=4';</script></c:if>
<c:if test="${log==1 }"><script>alert('패스워드가 틀렸습니다.');location.href='javafood?javafood=4';</script></c:if>

<c:if test="${membership==null&&log==null }">
	<title>Log In</title>
	</head>
		<body>
			<div class="table">
				<div>
					<div>
						<img src="https://c11.kr/1asbb" class="logo-img">
						<h1 style="margin-top:-11px;">MUSIC</h1>
					</div>
					<div class="table1">
						<h1 class="h1_1"><c:out value="Log in to your account"/></h1>
					    <form method="post" action="login">
					        <div class="head1">
					            <div class = "inputbtn">
					            	<input class = "tt" type="text" name="ID" placeholder="USER NAME">
					            	<button class="btnClear" type="button" ></button>
					            </div>
					            <br>
					            <input class = "tt" type="password" name="PW" placeholder="PASSWORD">
					            <button class="btnClear" type="button" ></button>
					            <input class="sub sub1" type="submit" value="Log In"><br>
					            <span class = "chec"><input type="checkbox" name="ID" value="ID">Remember me</span> <span class ="chec" style= "margin-left :77px;">계정 찾기</span>
					            <p><a href="login?membership=0" class="at"><c:out value="아직 JavaMusic을 사용하고 있지 않으신가요? 가입하기"/></a></p>
					        </div>
					    </form>
			        </div>
				    <br>
			    </div >
		    </div>
		</c:if>
		
		<h1>TEST</h1>
		<c:forEach items="${ll }" var="i">
			<c:out value="${i.id }"/><br>
		</c:forEach>
		
		<%-- 
		<c:if test="${llll!=null }">
			<div class="search hidden">
		   	<h1>찾는 방법을 선택해 주세요.</h1>
		    <table>
    	    <tr>주민등록번호로 찾기</tr>
		    	<form method="post" action="javafood?javafood=4">
		            <td>
		            	이름 <input class="name" type="text" name="NAME">
		            </td>
		            <td>
		            	주민등록번호 
		            	<input class="pn" type="text" name="PN" placeholder="주민등록번호">
		            </td>
		         </form>
		         
		         <form>
		         	<tr>
		         		전화번호로 찾기
		         	</tr>
			         <td>
			         	이름 
			         	<input class="name" type="text" name="NAME">
			         </td>
			         <td>
			         	전화번호 
			         	<input class="phone" type="text" name="PHONE" placeholder="전화번호">
			         </td>
		         </form>
		      </table>
		      <input class="searchsubmit" type="submit" value="확인">
		   </div>
		</c:if>
		--%>
		</body>
	</html>
	<br>







<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-twitter" viewBox="0 0 16 16">
	<path d="M5.026 15c6.038 0 9.341-5.003 9.341-9.334 0-.14 0-.282-.006-.422A6.685 6.685 0 0 0 16 3.542a6.658 6.658 0 0 1-1.889.518 3.301 3.301 0 0 0 1.447-1.817 6.533 6.533 0 0 1-2.087.793A3.286 3.286 0 0 0 7.875 6.03a9.325 9.325 0 0 1-6.767-3.429 3.289 3.289 0 0 0 1.018 4.382A3.323 3.323 0 0 1 .64 6.575v.045a3.288 3.288 0 0 0 2.632 3.218 3.203 3.203 0 0 1-.865.115 3.23 3.23 0 0 1-.614-.057 3.283 3.283 0 0 0 3.067 2.277A6.588 6.588 0 0 1 .78 13.58a6.32 6.32 0 0 1-.78-.045A9.344 9.344 0 0 0 5.026 15z"/>
</svg>
<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-instagram" viewBox="0 0 16 16">
	<path d="M8 0C5.829 0 5.556.01 4.703.048 3.85.088 3.269.222 2.76.42a3.917 3.917 0 0 0-1.417.923A3.927 3.927 0 0 0 .42 2.76C.222 3.268.087 3.85.048 4.7.01 5.555 0 5.827 0 8.001c0 2.172.01 2.444.048 3.297.04.852.174 1.433.372 1.942.205.526.478.972.923 1.417.444.445.89.719 1.416.923.51.198 1.09.333 1.942.372C5.555 15.99 5.827 16 8 16s2.444-.01 3.298-.048c.851-.04 1.434-.174 1.943-.372a3.916 3.916 0 0 0 1.416-.923c.445-.445.718-.891.923-1.417.197-.509.332-1.09.372-1.942C15.99 10.445 16 10.173 16 8s-.01-2.445-.048-3.299c-.04-.851-.175-1.433-.372-1.941a3.926 3.926 0 0 0-.923-1.417A3.911 3.911 0 0 0 13.24.42c-.51-.198-1.092-.333-1.943-.372C10.443.01 10.172 0 7.998 0h.003zm-.717 1.442h.718c2.136 0 2.389.007 3.232.046.78.035 1.204.166 1.486.275.373.145.64.319.92.599.28.28.453.546.598.92.11.281.24.705.275 1.485.039.843.047 1.096.047 3.231s-.008 2.389-.047 3.232c-.035.78-.166 1.203-.275 1.485a2.47 2.47 0 0 1-.599.919c-.28.28-.546.453-.92.598-.28.11-.704.24-1.485.276-.843.038-1.096.047-3.232.047s-2.39-.009-3.233-.047c-.78-.036-1.203-.166-1.485-.276a2.478 2.478 0 0 1-.92-.598 2.48 2.48 0 0 1-.6-.92c-.109-.281-.24-.705-.275-1.485-.038-.843-.046-1.096-.046-3.233 0-2.136.008-2.388.046-3.231.036-.78.166-1.204.276-1.486.145-.373.319-.64.599-.92.28-.28.546-.453.92-.598.282-.11.705-.24 1.485-.276.738-.034 1.024-.044 2.515-.045v.002zm4.988 1.328a.96.96 0 1 0 0 1.92.96.96 0 0 0 0-1.92zm-4.27 1.122a4.109 4.109 0 1 0 0 8.217 4.109 4.109 0 0 0 0-8.217zm0 1.441a2.667 2.667 0 1 1 0 5.334 2.667 2.667 0 0 1 0-5.334z"/>
</svg>
<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-facebook" viewBox="0 0 16 16">
	<path d="M16 8.049c0-4.446-3.582-8.05-8-8.05C3.58 0-.002 3.603-.002 8.05c0 4.017 2.926 7.347 6.75 7.951v-5.625h-2.03V8.05H6.75V6.275c0-2.017 1.195-3.131 3.022-3.131.876 0 1.791.157 1.791.157v1.98h-1.009c-.993 0-1.303.621-1.303 1.258v1.51h2.218l-.354 2.326H9.25V16c3.824-.604 6.75-3.934 6.75-7.951z"/>
</svg>
<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-youtube" viewBox="0 0 16 16">
	<path d="M8.051 1.999h.089c.822.003 4.987.033 6.11.335a2.01 2.01 0 0 1 1.415 1.42c.101.38.172.883.22 1.402l.01.104.022.26.008.104c.065.914.073 1.77.074 1.957v.075c-.001.194-.01 1.108-.082 2.06l-.008.105-.009.104c-.05.572-.124 1.14-.235 1.558a2.007 2.007 0 0 1-1.415 1.42c-1.16.312-5.569.334-6.18.335h-.142c-.309 0-1.587-.006-2.927-.052l-.17-.006-.087-.004-.171-.007-.171-.007c-1.11-.049-2.167-.128-2.654-.26a2.007 2.007 0 0 1-1.415-1.419c-.111-.417-.185-.986-.235-1.558L.09 9.82l-.008-.104A31.4 31.4 0 0 1 0 7.68v-.123c.002-.215.01-.958.064-1.778l.007-.103.003-.052.008-.104.022-.26.01-.104c.048-.519.119-1.023.22-1.402a2.007 2.007 0 0 1 1.415-1.42c.487-.13 1.544-.21 2.654-.26l.17-.007.172-.006.086-.003.171-.007A99.788 99.788 0 0 1 7.858 2h.193zM6.4 5.209v4.818l4.157-2.408L6.4 5.209z"/>
</svg>  