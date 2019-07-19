const result = document.getElementById('resultado');

for (let i = 1; i < 11; i++) {
  result.innerHTML += `<br/>[Tabuada de ${i}]<br/><br/>`;
  for (let j = 1; j < 11; j++) {
    result.innerHTML += `${i} X ${j} = ${i * j}<br />`;
  }
}