const btnSubmit = document.getElementById('btn');
const inputValue = document.getElementById('number');

btnSubmit.addEventListener('click', () => alert(game(+inputValue.value)))

function game(n) {
  const ALEATORY = Math.floor(Math.random() * (10 - 5 + 1)) + 5;
  if (n === ALEATORY) {
    return 'Você acertou! ' + true;
  } else {
    return 'Você errou! ' + false;
  }
}