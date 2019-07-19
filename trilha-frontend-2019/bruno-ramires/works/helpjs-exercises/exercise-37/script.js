// 37a
var deuses = ['Aegir', 'Aud', 'Balder'];
alert('Alerta com tamanho do array: ' + deuses.length);

// 37b
var deuses2 = ['Aegir', 'Aud', 'Balder'];
deuses2.forEach(item => alert(('Alerta com forEach() ' + item)));

// 37c
var deuses3 = ['Aegir', 'Aud', 'Balder'];
deuses3.map(item => alert('Alerta com map() ' + item));

// 37e
var deuses4 = ['Aegir', 'Aud', 'Balder'];
deuses4.push('Loki', 'Odin', 'Frey');
console.log('Adicionando item ao arr c/ push()');
console.log(deuses4);

// 37f
var deuses5 = ['Aegir', 'Aud', 'Balder'];
deuses5[deuses5.length] = 'Loki';
deuses5[deuses5.length] = 'Odin';
deuses5[deuses5.length] = 'Frey';
console.log('Adicionando item ao arr c/ length()');
console.log(deuses5)

// 37g
var numbers = [5, 7, 1, 8, 9];
numbers.sort();
console.log('Array ordenado em ordem crescente');
console.log(numbers);

// 37h
// Inverte o array com reverse()
var numbers2 = [5, 7, 1, 8, 9];
numbers2.reverse();
console.log('Array apenas invertido');
console.log(numbers2)

// Forma decrescente do array através do sort() com tais parâmetros
var numbers3 = [5, 7, 1, 8, 9];
numbers3.sort((a, b) => b - a);
console.log('Array ordenado em ordem decrescente');
console.log(numbers3);
