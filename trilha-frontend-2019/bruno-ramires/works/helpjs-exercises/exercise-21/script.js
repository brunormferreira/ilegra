const input = document.getElementById('number');
const btn = document.getElementById('btn');
let valorDesconto;

btn.addEventListener('click', () => alert(discount(input.value)));

function discount(valorDesconto) {
  valorDesconto = valorDesconto * (5 / 100);
  return 'O valor de desconto será de: ' + valorDesconto;
}


// valorDesconto = input.value * 0.05; // Other mode to do at line 8