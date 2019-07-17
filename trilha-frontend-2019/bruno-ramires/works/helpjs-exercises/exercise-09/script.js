const cpfPoint = document.getElementById('cpfPoint');
const resultado = document.getElementById('resultado');

cpfPoint.addEventListener('keyup', () => {
  let value = cpfPoint.value.replace(/[^\d]+/g,'');
  resultado.innerText = value;
})