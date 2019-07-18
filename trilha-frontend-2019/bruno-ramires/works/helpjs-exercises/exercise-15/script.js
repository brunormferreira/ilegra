const btn = document.getElementById('btn');
const result = document.getElementById('resultado');

btn.addEventListener('click', () => {
  document.onload(result.innerHTML = 'Esse texto foi inserido pelo JavaScript...');
})