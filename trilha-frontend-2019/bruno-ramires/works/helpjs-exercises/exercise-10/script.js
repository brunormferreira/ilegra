// one line commentary for exercise 12.

const inputValue1 = document.getElementById('soma1');
const inputValue2 = document.getElementById('soma2');
const sumButton = document.getElementById('btn-soma');
let result = document.getElementById('resultado-soma');

sumButton.addEventListener('click', () => result.value = parseInt(inputValue1.value) + parseInt(inputValue2.value));