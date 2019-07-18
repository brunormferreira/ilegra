const inputValue1 = document.getElementById('soma1');
const inputValue2 = document.getElementById('soma2');
const sumButton = document.getElementById('btn-soma');
let result = document.getElementById('resultado-soma');

sumButton.addEventListener('click', () => result.value = sum(inputValue1.value, inputValue2.value));

function sum(a, b) {
  console.log(a, b);
  return parseInt(a) + parseInt(b);
}