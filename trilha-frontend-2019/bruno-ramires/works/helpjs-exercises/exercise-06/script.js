// Exercise 06 done above (helpjs)

// let lightOn = document.querySelector('img');

// lightOn.addEventListener('click', changeImage)

// function changeImage() {
//   let newImage = "https://raw.githubusercontent.com/gabrieldarezzo/helpjs-ravi/master/images/        lampada-on.jpg"
//   lightOn.src = newImage;
//   return newImage
// }


// My new solution to an light switch
let srcLampadaDesligada = "https://github.com/gabrieldarezzo/helpjs-ravi/blob/master/images/lampada.jpg?raw=true"
let srcLampadaLigada = "https://raw.githubusercontent.com/gabrieldarezzo/helpjs-ravi/master/images/lampada-on.jpg"
let imagemAtual = document.querySelector('img');
let novaImagem;

function changeImage() {
  if(imagemAtual.src === srcLampadaDesligada) {
    novaImagem = imagemAtual.src = srcLampadaLigada
    return novaImagem;
  } else {
    novaImagem = imagemAtual.src = srcLampadaDesligada;
    return novaImagem;
  }
}

imagemAtual.addEventListener('click', changeImage);