// Crie um campo texto no html que armazena o conteúdo em um array sempre que você clicar no botão, e apresente em uma lista(ul)

let sendButton = document.getElementById('btn');
let text = document.getElementById('text');
let list = document.getElementById('resultado');

let arr = [];

sendButton.addEventListener('click', () => {
  arr.push(text.value);
  list.innerHTML += `<li>${text.value}</li>`;
  console.log(arr);
})