    document.querySelector("img.delete_icon").addEventListener("mouseover", ()=>
    {
        document.querySelector("img.delete_icon").classList.toggle("hidden");
        document.querySelector("img.delete_icon2").classList.toggle("hidden");
    });

    document.querySelector("img.delete_icon").addEventListener("mouseout", ()=>
    {
        document.querySelector("img.delete_icon").classList.toggle("hidden");
        document.querySelector("img.delete_icon2").classList.toggle("hidden");
    });

    
    document.querySelector("span.delete").addEventListener('click', ()=>
    {
        if(confirm("정말로 해당 플레이 리스트를 삭제하겠습니까?") )
        {

        	deleteList.method='get';
        	deleteList.action='javafood';
        	deleteList.submit();
        }
    });
    for(let i = 0; i < document.querySelectorAll("img.sDelete_icon").length; i++)
    {
        document.querySelectorAll("img.sDelete_icon")[i].addEventListener("mouseover", ()=>
        {
            document.querySelectorAll("img.sDelete_icon")[i].classList.toggle("hidden");
            document.querySelectorAll("img.sDelete_icon2")[i].classList.toggle("hidden");
        });

        document.querySelectorAll("img.sDelete_icon")[i].addEventListener("mouseout", ()=>
        {
            document.querySelectorAll("img.sDelete_icon")[i].classList.toggle("hidden");
            document.querySelectorAll("img.sDelete_icon2")[i].classList.toggle("hidden");
        });
    }
    for(let i = 0; i < document.querySelectorAll("span.deleteSong").length; i++)
    {
        document.querySelectorAll("span.deleteSong form")[i].addEventListener('click', (event)=>
        {
            if(confirm("정말로 해당 곡을 리스트에서 삭제하겠습니까?") )
            {
                event.currentTarget.method='get';
                event.currentTarget.action='javafood';
                event.currentTarget.submit();
            }
        });
    }
    
    (function (){  
        document.onmousemove=function (e){ var ob=document.getElementById("foo").style; ob.left=e.pageX+15+"px"; ob.top=e.pageY+15+"px";}
        document.write("<img src='https://tistory1.daumcdn.net/tistory/4694508/skin/images/hai1.gif' id='foo' style='position:absolute; transition:all 0.3s ease-in'>");
     }());