let sendButton = document.getElementById('btn');
let text = document.getElementById('text');
let list = document.getElementById('resultado');

let arr = [];

sendButton.addEventListener('click', () => {
  arr.push(text.value);
  list.innerHTML += `<li${text.value % 2 == 0 ? ' style="color: #66ff66"' : ''}>${text.value}</li>`;
})