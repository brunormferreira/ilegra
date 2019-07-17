const btn = document.getElementById('send-btn');

btn.addEventListener('click', countCharacters)

function countCharacters() {
  const inputValue = document.getElementById('txt').value;
  alert(inputValue.length);
}