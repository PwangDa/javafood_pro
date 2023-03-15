/**
 * 
 */
 
		  function refresh() {
			 
				/* setTimeout('location.reload()', 60000); */
				window.scrollTo({ left: 0, top: 0, behavior: "smooth"});
		
		} 
////////////////////////////////////////////////////////////////////////////////////////		
		
		function nowtime() {
			let now = new Date();

			let hour = now.getHours();
			let minute = now.getMinutes();
			let second = now.getSeconds();

			if (hour < 10) {
				hour = "0" + hour;
			}
			if (minute < 10) {
				minute = "0" + minute;
			}
			if (second < 10) {
				second = "0" + second;
			}

			document.getElementById("timebox").value = hour + ":" + minute
					+ ":" + second;
				//console.log(123, document.getElementById("timebox"));
		}
		window.addEventListener("load", function() {
			//HTML이 다 load가 완료 됐을 때 실행됨
			nowtime();
			setInterval(function() {
			
				nowtime();
			}, 1000); //1초 단위
		})
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		function addhit(id,song) {
			console.log("id = "+id)
			console.log("song = "+song)
			location.href = 'javafood?javafood=2&play='+song+'&id='+id;
			
		}
		
		/*function playVideo() {
			
			const login = "${login}";
			const songnumber = "${dao.songnumber}";
			
			// 유튜브 동영상 ID 생성
			const videoId = "유튜브 동영상 ID를 여기에 입력하세요";
			// 유튜브 동영상 링크 생성
  			const videoUrl = `https://www.youtube.com/watch?v=${videoId}`;
  			// 새 창에서 유튜브 동영상 링크 열기
 			 window.open(videoUrl, '_blank');
		}*/
		
	let save = document.querySelectorAll("img.save");
	for(let i=0; i<save.length; i++){
		save[i].addEventListener("click",function(){
			console.log("담기 버튼 눌림");
			
			save[i].parentNode.target = "_blank";
			save[i].parentNode.submit();
		});
	}
	
	//여러 개가 체크 된 곡들을 플레이 리스트에 추가하기
	let allsave = document.querySelector("img#allsave");
	allsave.addEventListener("click", function(){
		allsave.parentNode.action = "javafood?javafood=3_6&songNumbers="+getCheckedValue()+"&addWhere=song";
		allsave.parentNode.submit();
	});
//////////////////////////////////////////////////////////////////////////////////////////
			/* refresh(); */
			
			function checkSelectAll() {

	const checkboxes = document.querySelectorAll('input[name="check"]');
	const checked = document.querySelectorAll('input[name="check"]:checked');
	const selectAll = document.querySelector('input[name="checkall"]');

	if (checkboxes.length === checked.length) {
		selectAll.checked = true;
	} else {
		selectAll.checked = false;
	}

}
function selectAll(selectAll) {
	console.log(selectAll.checked);
	const checkboxes = document.getElementsByName("check");

	checkboxes.forEach((checkbox) => {
		checkbox.checked = selectAll.checked;
	})
}
// 체크박스에서 값 가져오기
function getCheckedValue() {
	const checkboxes = document.querySelectorAll('input[name="check"]:checked');
	let checkedValue = [];
	checkboxes.forEach((checkbox) => {
		checkedValue.push(checkbox.value);
	})
	console.log(checkedValue)
	return checkedValue;
}
		
         (function (){  
            document.onmousemove=function (e){ var ob=document.getElementById("foo").style; ob.left=e.pageX+15+"px"; ob.top=e.pageY+15+"px";}
            document.write("<img src='https://tistory1.daumcdn.net/tistory/4694508/skin/images/hai1.gif' id='foo' style='position:absolute; transition:all 0.3s ease-in; z-index: 1;'>");
         }());
