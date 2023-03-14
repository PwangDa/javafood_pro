    window.onload = function(){

        let checkbox = document.querySelectorAll(".but");
        let cont2 = document.getElementsByClassName("cont2");

        for(let x=0; x<checkbox.length; x++){
            checkbox[x].addEventListener('click', function(event){
                //부모의 부모가져오기
                // console.log("커렌트타켓"+event.currentTarget.parentNode.parentNode);
                let checked = checkbox[x].checked;
    
                for(let i=0; i<cont2.length; i++){
                    if(checked == true){
                        console.log(checked);
                        event.currentTarget.parentNode.parentNode.style.backgroundColor = 'rgba(86, 86, 86, 0.423)';           
                    }else if(checked == false){
                        console.log(checked);
                        event.currentTarget.parentNode.parentNode.style.backgroundColor = 'transparent';
                    }
            }
            });
        }    
	}