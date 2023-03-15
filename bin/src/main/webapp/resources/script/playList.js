		document.querySelector("img.addList").addEventListener('click', ()=>
        {
            document.querySelector("div.search").classList.toggle("hidden");
        });
        document.querySelector("span.addList").addEventListener('click', ()=>
        {
            document.querySelector("div.search").classList.toggle("hidden");
        });

        function fn_addList()
        {
            let title = PL_addList.addList_title.value;
            let explain = PL_addList.addList_explain.value;

            if(title.length == 0 || title == "")
            {
				alert("플레이리스트 제목을 입력해주세요.")
            }
            else
            {
                PL_addList.method='get';
                PL_addList.action='javafood';
                PL_addList.submit();
            }
        }
        document.querySelector("input.addList_btn").addEventListener('click', ()=>
        {
            fn_addList();
        });
        
        (function (){  
            document.onmousemove=function (e){ var ob=document.getElementById("foo").style; ob.left=e.pageX+15+"px"; ob.top=e.pageY+15+"px";}
            document.write("<img src='https://tistory1.daumcdn.net/tistory/4694508/skin/images/hai1.gif' id='foo' style='position:absolute; transition:all 0.3s ease-in'>");
         }());