var currentImage = 0;
const myphoto = ["image1.jpg","image2.jpg","image3.jpg","image4.jpg"];
var container = document.getElementById('content');
var nextBtn = document.getElementById('next');
var prevBtn = document.getElementById('prev');
console.log('hello');

//next button click event
nextBtn.addEventListener('click', function(event){
    event.preventDefault();
    currentImage++;
    if(currentImage>myphoto.length-1){currentImage = 0;}

    var newSlide = document.createElement('img');
    newSlide.src = 'slide/${myphoto[currentImage]}';
    newSlide.className='faddingimg';
    container.appendChild('newSlide');
});

//