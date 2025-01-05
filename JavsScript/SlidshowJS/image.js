const myimage = ["image1.jpg","image2.jpg","image3.jpg","image4.jpg"];
let currentimage = 0;
document.getElementById('next').onclick= nextphoto;
function nextphoto(){
    
    if(currentimage >= (myimage.length-1)){
        currentimage=0;
    }else{
        currentimage++;
    }

    document.getElementById('myimage').src = myimage[currentimage];
}

document.getElementById('Previous').onclick=Previous;
function Previous(){
    if(currentimage <= 0){
        currentimage=myimage.length-1;
    }
    else{
        currentimage--;
    }
    document.getElementById('myimage').src = myimage[currentimage];
}