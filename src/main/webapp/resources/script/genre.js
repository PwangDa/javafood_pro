/**
 * 
 */


function checkSelectAll() {

	const checkboxes = document.querySelectorAll('input[name="chk"]');
	const checked = document.querySelectorAll('input[name="chk"]:checked');
	const selectAll = document.querySelector('input[name="selectall"]');

	if (checkboxes.length === checked.length) {
		selectAll.checked = true;
	} else {
		selectAll.checked = false;
	}

}
function selectAll(selectAll) {
	console.log(selectAll.checked);
	const checkboxes = document.getElementsByName("chk");

	checkboxes.forEach((checkbox) => {
		checkbox.checked = selectAll.checked;
	})
}
// 체크박스에서 값 가져오기
function getCheckedValue() {
	const checkboxes = document.querySelectorAll('input[name="chk"]:checked');
	let checkedValue = [];
	checkboxes.forEach((checkbox) => {
		checkedValue.push(checkbox.value);
	})
	console.log(checkedValue)
	//document.getElementByID("btn").value = checkedValue;
	return checkedValue;
}


(function() {
	document.onmousemove = function(e) { var ob = document.getElementById("foo").style; ob.left = e.pageX + 15 + "px"; ob.top = e.pageY + 15 + "px"; }
	document.write("<img src='https://tistory1.daumcdn.net/tistory/4694508/skin/images/hai1.gif' id='foo' style='position:absolute; transition:all 0.3s ease-in; z-index: 1;'>");
}());

//담기 버튼 누르면, 곡이 추가될 플레이 리스트 선택하는 팝업 뜨게 하기
let addList = document.querySelectorAll("img.addList");

//console.log(addList);

for(let i = 0; i < addList.length; i++)
{
	addList[i].addEventListener("click", (event)=> //()=>는 화살표 함수
	{
		console.log("img.addList의 EventListener 실행됨."); //확인용
		
		addList[i].parentNode.parentNode.target = "_blank"; //새 창으로 열기
		addList[i].parentNode.parentNode.submit(); //form 서밋하기
	});
}

//여러 개가 체크 된 곡들을 플레이 리스트에 추가하기
let addLists = document.querySelector("img.addLists");

addLists.addEventListener("click", ()=>{
	addLists.parentNode.parentNode.action = "javafood?javafood=3_6&songNumbers="+getCheckedValue()+"&addWhere=NewGenre";
	addLists.parentNode.parentNode.submit();
});

