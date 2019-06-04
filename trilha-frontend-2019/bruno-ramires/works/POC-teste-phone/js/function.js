// let inputValue = document.getElementById("campo").value;
// var count = 0;
// concate = "",
//     result = "";
// let timer;

// arrayList = document.querySelectorAll('.key');

// arrayList.forEach(function (button) {
//     console.log(button.value);
// });

var clicks = 0;
var value = "";

function bla() {
    value = getElementByClass('.key').value;
    if (value === 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9) {
        if (clicks >= event.target.textContent.length) {
            clicks = 0;
        }
        console.log(event.target.textContent[clicks])
        clicks++;
    } else {
        console.log('error')
    }
}

// addEventListener("onclick", function () {
//     var clicks = 0;
//     if (clicks >= event.target.textContent.length) {
//         clicks = 0;
//     }
//     console.log(event.target.textContent[clicks])
//     clicks++;
// })

// keys = ['.,!1', 'abc2'];

// keys.forEach.addEventListener("onclick", function () {

// })

// function bla() {
//     console.log(event);
// }