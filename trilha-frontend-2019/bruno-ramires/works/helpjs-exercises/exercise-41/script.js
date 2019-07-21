let count = document.getElementById('main-content');

setInterval(() => {
  count.innerHTML == 1 ? count.innerHTML = 5 : count.innerHTML--;
}, 1000);