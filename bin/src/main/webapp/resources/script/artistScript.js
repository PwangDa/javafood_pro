 		/*댓글 입력창 if문*/
        /* function fn_sendComment(){
        	
        	var frmCommand = document.frmComment;
        	var id = frmCommand.id.value;
        	var cont = frmCommand.cont.value;
        	if(id.length == 0 || id == ""){
        		alert("아이디를 입력해주세요")
        	}else if(cont.length == 0 || cont == ""){
        		alert("내용을 입력해주세요")
        	}else{
            frmComment.method = "post";
            frmComment.action = "/javafood_team/javafood?javafood=1&command=addcommnet.do";
            frmComment.submit();
        	}
        } */
 		
        function fn_sendComment_2(){
        	
        	var frmCommand = document.frmComment_2;
        	var id = frmCommand.id_2.value;
        	var cont = frmCommand.cont_2.value;
        	
        	if(id.length == 0 || id == ""){
        		alert("아이디를 입력해주세요")
        	}else if(cont.length == 0 || cont == ""){
        		alert("내용을 입력해주세요")
        	}else{
            frmComment.method = "post";
            frmComment.action = "/javafood_team/javafood?javafood=1&command=addReply.do";
            frmComment.submit();
        	}
        }
        
        let btn_del = document.querySelector(".btn_del");
        
         /*btn_del.addEventListener('click', function() {
    	           if(){
    	           		console.log('안녕 친구들');

    	           }
    	     });*/
        
        var prevScrollpos = window.pageYOffset;
        window.onscroll = headerbarToggle
        window.onload = headerbarToggle
        function headerbarToggle(){
            console.log(1234);
        /*메뉴상단 스크롤 함수*/
            /*var headerbar = document.getElementById("menu");
            var currentScrollPos = window.pageYOffset;
            if(prevScrollpos < currentScrollPos){
                headerbar.style.opacity = 1;
            }else{
                headerbar.style.opacity = 0.6;
            }*/
            
            /*앨범 < > 함수*/
            let prev = document.querySelector(".prev");
            let next = document.querySelector(".next");
            let slides = document.querySelector(".clides");
            let slds = document.querySelector("#slds");
            let slidelmg = document.querySelectorAll(".clides li");
            let current = 0; //현재 슬라이드 인덱스
            let slideCount = slidelmg.length;

            let slideWidth = 760; //한개의 슬라이드 넓이
            let slideMargin = 100;
            let currentIdx = 0;

            // slides.style.width = (slideWidth + slideMargin) * slideCount + 'px';

            function moveSlide(num) {
                slides.style.left = -num * 890 + 'px';
                currentIdx = num;
            }

    	    //    next.addEventListener('click', function() {
    	    //        console.log(slideCount); /*5*/
    	    //        if(current !== slideCount-1){
    	    //        		console.log('안녕 친구들');
    	    //     	    current = slideCount;
    	    //     	    console.log(current);
    	    //        		slds.classList.add("marLeft");
    	    //        }
    	    //    });

            console.log('총 앨범 갯수 slideCount : '+slideCount); 
            console.log(' (slideCount / 4) : '+(slideCount / 4)); 
               next.addEventListener('click', function() {
    	           if(currentIdx <= (slideCount / 4)-1){
    	           		console.log('안녕 친구들');
    	        	    console.log('next: current : '+current);
                        moveSlide(currentIdx + 1);
                        console.log('currentIdx : '+currentIdx);
    	           }
    	       });
    	        
               prev.addEventListener('click', function() {
    	    	   if(currentIdx !== 0){
    	           	    console.log('hello');
                        console.log('prev : current : '+current);
    	           	    console.log(slideCount);
                        moveSlide(currentIdx - 1)
    	    	   }
    	       });

    	    //    prev.addEventListener('click', function() {
    	    // 	   if(current !== 0){
    	    //        	console.log('hello');
    	    //        	console.log(slideCount);
    	    //        	slds.classList.remove("marLeft");
    	    //        	current = 0;
    	    // 	   }
    	    //    });
    	       
        }