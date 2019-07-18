const inputValue1 = document.getElementById('mult1');
const inputValue2 = document.getElementById('mult2');
const sumButton = document.getElementById('btn-mult');
let result = document.getElementById('resultado-mult');

sumButton.addEventListener('click', () => result.value = mult(inputValue1.value, inputValue2.value));

function mult(a, b) {
  return parseInt(a) * parseInt(b);
}