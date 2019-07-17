const CPF = document.getElementById('cpf');
const resultado = document.getElementById('resultado');

cpf.addEventListener('keyup', () => {
  let value = cpf.value.replace(/[^0-9]/g, "").replace(/^([\d]{3})([\d]{3})?([\d]{3})?([\d]{2})?/, "$1.$2.$3-$4");
  resultado.innerText = value;
})