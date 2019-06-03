var count = 0;
let tt = "",
  concate = "",
  result = "";
let timer;

function button_01() {
  this.count += 1;
  if (this.count === 1) {
    tt = document.getElementById("campo").value = ".";
    clearTimeout(timer);
  } else if (this.count === 2) {
    tt = document.getElementById("campo").value = ",";
    clearTimeout(timer);
  } else if (this.count === 3) {
    tt = document.getElementById("campo").value = "!";
    clearTimeout(timer);
  } else if (this.count === 4) {
    tt = document.getElementById("campo").value = "1";
    count = 0;
    clearTimeout(timer);
  }
  document.getElementById("campo").value = concate + tt;
  timer = setTimeout(function () {
    concate = concate.concat(tt);
    count = 0;
  }, 1000);
}

function button_02() {
  this.count += 1;
  if (this.count === 1) {
    tt = document.getElementById("campo").value = "a";
    clearTimeout(timer);
  } else if (this.count === 2) {
    tt = document.getElementById("campo").value = "b";
    clearTimeout(timer);
  } else if (this.count === 3) {
    tt = document.getElementById("campo").value = "c";
    clearTimeout(timer);
  } else if (this.count === 4) {
    tt = document.getElementById("campo").value = "2";
    count = 0;
    clearTimeout(timer);
  }
  document.getElementById("campo").value = concate + tt;
  timer = setTimeout(function () {
    concate = concate.concat(tt);
    count = 0;
  }, 1000);
}

function button_03() {
  this.count += 1;
  if (this.count === 1) {
    tt = document.getElementById("campo").value = "d";
    clearTimeout(timer);
  } else if (this.count === 2) {
    tt = document.getElementById("campo").value = "e";
    clearTimeout(timer);
  } else if (this.count === 3) {
    tt = document.getElementById("campo").value = "f";
    clearTimeout(timer);
  } else if (this.count === 4) {
    tt = document.getElementById("campo").value = "3";
    clearTimeout(timer);
    count = 0;
  }
  document.getElementById("campo").value = concate + tt;
  timer = setTimeout(function () {
    concate = concate.concat(tt);
    count = 0;
  }, 1000);
}

function button_04() {
  this.count += 1;
  if (this.count === 1) {
    tt = document.getElementById("campo").value = "g";
    clearTimeout(timer);
  } else if (this.count === 2) {
    tt = document.getElementById("campo").value = "h";
    clearTimeout(timer);
  } else if (this.count === 3) {
    tt = document.getElementById("campo").value = "i";
    clearTimeout(timer);
  } else if (this.count === 4) {
    tt = document.getElementById("campo").value = "4";
    count = 0;
    clearTimeout(timer);
  }
  document.getElementById("campo").value = concate + tt;
  timer = setTimeout(function () {
    concate = concate.concat(tt);
    count = 0;
  }, 1000);
}

function button_05() {
  this.count += 1;
  if (this.count === 1) {
    tt = document.getElementById("campo").value = "j";
    clearTimeout(timer);
  } else if (this.count === 2) {
    tt = document.getElementById("campo").value = "k";
    clearTimeout(timer);
  } else if (this.count === 3) {
    tt = document.getElementById("campo").value = "l";
    clearTimeout(timer);
  } else if (this.count === 4) {
    tt = document.getElementById("campo").value = "5";
    count = 0;
    clearTimeout(timer);
  }
  document.getElementById("campo").value = concate + tt;
  timer = setTimeout(function () {
    concate = concate.concat(tt);
    count = 0;
  }, 1000);
}

function button_06() {
  this.count += 1;
  if (this.count === 1) {
    tt = document.getElementById("campo").value = "m";
    clearTimeout(timer);
  } else if (this.count === 2) {
    tt = document.getElementById("campo").value = "n";
    clearTimeout(timer);
  } else if (this.count === 3) {
    tt = document.getElementById("campo").value = "o";
    clearTimeout(timer);
  } else if (this.count === 4) {
    tt = document.getElementById("campo").value = "6";
    count = 0;
    clearTimeout(timer);
  }
  document.getElementById("campo").value = concate + tt;
  timer = setTimeout(function () {
    concate = concate.concat(tt);
    count = 0;
  }, 1000);
}

function button_07() {
  this.count += 1;
  if (this.count === 1) {
    tt = document.getElementById("campo").value = "p";
    clearTimeout(timer);
  } else if (this.count === 2) {
    tt = document.getElementById("campo").value = "q";
    clearTimeout(timer);
  } else if (this.count === 3) {
    tt = document.getElementById("campo").value = "r";
    clearTimeout(timer);
  } else if (this.count === 4) {
    tt = document.getElementById("campo").value = "s";
    clearTimeout(timer);
  } else if (this.count === 5) {
    tt = document.getElementById("campo").value = "7";
    count = 0;
    clearTimeout(timer);
  }
  document.getElementById("campo").value = concate + tt;
  timer = setTimeout(function () {
    concate = concate.concat(tt);
    count = 0;
  }, 1000);
}

function button_08() {
  this.count += 1;
  if (this.count === 1) {
    tt = document.getElementById("campo").value = "t";
    clearTimeout(timer);
  } else if (this.count === 2) {
    tt = document.getElementById("campo").value = "u";
    clearTimeout(timer);
  } else if (this.count === 3) {
    tt = document.getElementById("campo").value = "v";
    clearTimeout(timer);
  } else if (this.count === 4) {
    tt = document.getElementById("campo").value = "8";
    count = 0;
    clearTimeout(timer);
  }
  document.getElementById("campo").value = concate + tt;
  timer = setTimeout(function () {
    concate = concate.concat(tt);
    count = 0;
  }, 1000);
}

function button_09() {
  this.count += 1;
  if (this.count === 1) {
    tt = document.getElementById("campo").value = "w";
    clearTimeout(timer);
  } else if (this.count === 2) {
    tt = document.getElementById("campo").value = "x";
    clearTimeout(timer);
  } else if (this.count === 3) {
    tt = document.getElementById("campo").value = "y";
    clearTimeout(timer);
  } else if (this.count === 4) {
    tt = document.getElementById("campo").value = "v";
    clearTimeout(timer);
  } else if (this.count === 5) {
    tt = document.getElementById("campo").value = "9";
    count = 0;
    clearTimeout(timer);
  }
  document.getElementById("campo").value = concate + tt;
  timer = setTimeout(function () {
    concate = concate.concat(tt);
    count = 0;
  }, 1000);
}

function clean() {
  document.getElementById("campo").value = "";
}

function space() {
  timer = setTimeout(function () {
    concate = concate.concat(" ");
    count = 0;
  }, 400);
}