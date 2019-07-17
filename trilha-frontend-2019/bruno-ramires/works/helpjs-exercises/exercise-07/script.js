// Exercise 7
let lightOn = document.querySelector('img');

lightOn.addEventListener('mousemove', changeImage)

function changeImage() {
  let newImage = "https://raw.githubusercontent.com/gabrieldarezzo/helpjs-ravi/master/images/lampada-on.jpg"
  lightOn.src = newImage;
  return newImage
}

// Exercise 7a
const btnSaudacao = document.getElementById('btn-saudacoes');

btnSaudacao.addEventListener('click', novaSaudacao);

function novaSaudacao() {
  const primeiroInput = document.getElementById('nome').value;
  const segundoInput = document.getElementById('sobrenome').value;
  alert(`Saudações! ${primeiroInput} ${segundoInput}`);
}