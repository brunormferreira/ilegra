const input = document.getElementById('number');
const btn = document.getElementById('btn');
const anoAtual = new Date().getFullYear();

btn.addEventListener('click', () => alert(ageCalc(input.value)));

function ageCalc() {
  if (anoAtual - input.value >= 18) {
    return 'Maior de idade!';
  } else {
    return 'Menor de idade!';
  }
}