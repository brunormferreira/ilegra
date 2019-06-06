var clicks = 0;
var concate = "";
var timer = "";
let inputValue = document.getElementById("campo").value;

arrayList = document.querySelectorAll(".key");

arrayList.forEach(function(button) {
  button.addEventListener("click", function(e) {
    if (clicks >= event.target.textContent.length) {
      clicks = 0;
    }
    const value = event.target.textContent[clicks];
    clicks++;

    clearTimeout(timer);
    document.getElementById("campo").value = concate + value;

    timer = setTimeout(function() {
      concate = concate.concat(value);
    }, 800);
  });
});

function erase() {
  concate = concate.substring(0, concate.length - 1);
  document.getElementById("campo").value = concate;
  console.log(inputValue);
}
