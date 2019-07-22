const bear01 = 'https://raw.githubusercontent.com/gabrieldarezzo/helpjs-ravi/master/images/chara-1.png';
const bear02 = 'https://raw.githubusercontent.com/gabrieldarezzo/helpjs-ravi/master/images/chara-2.png';
const bear03 = 'https://raw.githubusercontent.com/gabrieldarezzo/helpjs-ravi/master/images/chara-3.png';

setInterval(() => {
  let actualBear = document.getElementById('bear');
  let srcValue = actualBear.getAttribute('src');

  if(srcValue === bear01) {
    actualBear.setAttribute('src', bear02);
  }
  if(srcValue === bear02) {
    actualBear.setAttribute('src', bear03);
  }
  if(srcValue === bear03) {
    actualBear.setAttribute('src', bear01);
  }
}, 200)

// Other mode to do the resolution
// setInterval(() => {
//   let actualBear = document.getElementById('bear');

//   if(actualBear.src == bear01) {
//     actualBear.src = bear02;
//   }
//   else if(actualBear.src == bear02) {
//     actualBear.src = bear03;
//   }
//   else if(actualBear.src == bear03) {
//     actualBear.src = bear01;
//   }
// }, 200)