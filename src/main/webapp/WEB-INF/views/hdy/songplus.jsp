<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>앨범곡을 등록합시다</title>
</head>
<script>
	function fn_sendComment(){
		frmComment.method = "post";
		frmComment.action = "albumregi";
		frmComment.submit();
	}
	
	function fn_sendCommend(){
		frmCommend.method = "post";
		frmCommend.action = "albumregi";
		frmCommend.submit();
	}
</script>
<style>
	textarea{
            width: 300px;
            height: 110px;
    }
</style>
</head>
<body>
	<form name="frmComment">
		<div>
			<h2>앨범정보등록</h2>
			<input type="text" name="al_num" placeholder="앨범순번">
			<textarea name="cover" placeholder="앨범표지링크"></textarea>
			<input type="text" name="name" placeholder="앨범이름">
			<textarea name="into" placeholder="앨범소개글"></textarea>
			<textarea name="info" placeholder="아티스트소개"></textarea>
			<input type ="button" value="등록" onclick="fn_sendComment()">
			<input type ="hidden" name="command" value="addAlbum">
		</div>
	</form>
		<br>
	<form name="frmCommend">
		<div>
			<h2>그 앨범의 수록곡 등록</h2>
			<input type="text" name="music_num" placeholder="음악순번">
			<input type="text" name="music_name" placeholder="음악이름">
			<textarea name="link" placeholder="음악링크"></textarea>
			<input type="text" name="time" placeholder="음악런타임">
			<input type ="button" value="등록" onclick="fn_sendCommend()">
			<input type ="hidden" name="commanding" value="addMusic">
		</div>
	</form>
</html>