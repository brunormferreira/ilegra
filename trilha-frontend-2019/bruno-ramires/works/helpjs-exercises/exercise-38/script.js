var deuses = ['Aegir', 'Aud', 'Balder', 'Bragi', 'Búri', 'Dag', 'Dellingr']
const lista = document.getElementById('nomes');

for (let i = 0; i < 6; i++) {
  lista.innerHTML += `<li>${i + 1} ${deuses[i]}</li>`;
}

// ${i + 1} = acessa o index do array; (key)

// o ${deuses[i]} acessa o valor do array; (value)