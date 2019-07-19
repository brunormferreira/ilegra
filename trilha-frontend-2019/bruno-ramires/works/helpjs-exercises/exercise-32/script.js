const btnSubmit = document.getElementById('btn');
const inputValue = document.getElementById('name');

btnSubmit.addEventListener('click', () => alert(verifyIt(inputValue.value)))

function verifyIt(string) {
  if (string.includes('dota') || string.includes('Dota')) {
    return true;
  } else {
    return false;
  }
}