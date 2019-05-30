// function botao(value) {
//     var save = document.getElementById("campo").value = value;
//     document.getElementById("campo").value = save;
// }

function limpar() {
    document.getElementById('campo').value = '';
}

function preencher(valor) {
    document.getElementById('campo').value += valor;
}

var keys = {
    '1': ['.', ',', '!'],
    '2': ['a', 'b', 'c'],
    '3': ['d', 'e', 'f'],
    '4': ['g', 'h', 'i'],
    '5': ['j', 'k', 'l'],
    '6': ['m', 'n', 'o'],
    '7': ['p', 'q', 'r', 's'],
    '8': ['t', 'u', 'v'],
    '9': ['w', 'x', 'y', 'z'],
}

/* var inputElement = document.getElementById('campo');
var buttonElement = document.querySelector('key');

document.querySelector('button').addEventListener('click', function () {
    var numero = parseInt(inputElement.textContent) + 1;
    inputElement.textContent = numero;
})

var keys = {
    '1': ['.', ',', '!'],
    '2': ['a', 'b', 'c'],
    '3': ['d', 'e', 'f'],
    '4': ['g', 'h', 'i'],
    '5': ['j', 'k', 'l'],
    '6': ['m', 'n', 'o'],
    '7': ['p', 'q', 'r', 's'],
    '8': ['t', 'u', 'v'],
    '9': ['w', 'x', 'y', 'z'],
}; */

/* var inputElement = document.querySelector('input');
var contador = document.querySelector('input');

document.querySelector('button').addEventListener('click', function () {
    var numero = parseInt(contador.textContent) + 1;
    contador.textContent = numero;
}); */