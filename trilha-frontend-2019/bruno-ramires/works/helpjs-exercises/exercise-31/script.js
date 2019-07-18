const result = document.getElementById('resultado');

for (let i = 0; i < 11; i++) {
  result.innerHTML += `<br/>[Tabuada de ${i}]<br/><br/>`;
  for (let j = 0; j < 11; j++) {
    result.innerHTML += `${i} X ${j} = ${i * j}<br />`;
  }
}