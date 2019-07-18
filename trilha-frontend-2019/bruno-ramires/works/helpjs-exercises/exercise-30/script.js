// const arr = [0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20];
// const result = document.getElementById('resultado');

// arr.forEach(item => result.innerHTML += `${item} `);

const result = document.getElementById('resultado');

for (let n = 0; n <= 20; n++) {
  if(n % 2 === 0) result.innerHTML += `${n} `;
}