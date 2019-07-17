const btn = document.getElementById('btn-exibir-nome');

btn.addEventListener('click', exibirNome);

function exibirNome() {
  const nameInput = document.getElementById('nome-completo').value;
  alert("O nome completo é: " + nameInput);
}
