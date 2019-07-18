const greenButton = document.querySelector('.verde');
const redButton = document.querySelector('.vermelho');

redButton.addEventListener('click', changeBackgroundToRed);
greenButton.addEventListener('click', changeBackgroundToGreen);

function changeBackgroundToRed(){
  document.body.style.backgroundColor = "red";
}

function changeBackgroundToGreen(){
  document.body.style.backgroundColor = "green";
}

/*
* exercise 13
* comments
* so much
* lines
*/