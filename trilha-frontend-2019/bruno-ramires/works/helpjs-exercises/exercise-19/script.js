const input = document.getElementById('number');
const btn = document.getElementById('btn');

btn.addEventListener('click', () => alert(evenOdd(input.value)));

function evenOdd(n) {
  if (n % 2 == 0) {
    return 'Par';
  } else {
    return 'Impar';
  }
}