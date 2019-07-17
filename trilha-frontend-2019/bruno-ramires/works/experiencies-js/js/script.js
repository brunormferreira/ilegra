import { somaExt } from './funcoes.js';
import { multiExt } from './funcoes.js'
import { divExt } from './funcoes.js'

var form = document.getElementById('inputs');
var n1 = document.getElementById('num1');
var n2 = document.getElementById('num2');
var operation = ["soma", "multi", "div", "lixo", "derivada"];
var number1, number2;

form.addEventListener('submit', function(e) {
  e.preventDefault();
  
  number1 = n1.value;
  number2 = n2.value;

  operation.forEach(myFunction);
});

function myFunction(item) {
    if(item === "soma"){
      console.log(somaExt(number1, number2));
    } else if (item === "multi"){
      console.log(multiExt(number1, number2));
    } else if (item === "div"){
      console.log(divExt(number1, number2));
    }else{
      Error.prototype.message = `${item} WARNING "valor de operacao invalido!"`;
      let date = new Date();
      console.log(date);
      console.log(Error.prototype.message);
    }
}

// function somaExt(a, b){
//   return  parseFloat(a) + parseFloat(b);
// }

// function multiExt(a, b){
//   return (a * b);
// }

// function divExt(a, b){
//   return (a / b);
// }