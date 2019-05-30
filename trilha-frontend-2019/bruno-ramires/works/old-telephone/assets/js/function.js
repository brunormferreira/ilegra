var count = 0;
var tt = '';
var concate = '';
var inputElement = document.getElementById('campo');
var result = '';

function button_01() {
    this.count += 1;
    if (this.count === 1) {
        tt = document.getElementById('campo').value = ".";
    } else if (this.count === 2) {
        tt = document.getElementById('campo').value = ",";
    } else if (this.count === 3) {
        tt = document.getElementById('campo').value = "!";
    } else if (this.count === 4) {
        tt = document.getElementById('campo').value = "1";
        count = 0;
    }
    concate = concate.concat(tt)
    document.getElementById('campo').innerHTML = concate;
}

function button_02() {
    this.count += 1;
    if (this.count === 1) {
        tt = document.getElementById('campo').value = "a";
    } else if (this.count === 2) {
        tt = document.getElementById('campo').value = "b";
    } else if (this.count === 3) {
        tt = document.getElementById('campo').value = "c";
    } else if (this.count === 4) {
        tt = document.getElementById('campo').value = "2";
        count = 0;
    }
}

function button_03() {
    this.count += 1;
    if (this.count === 1) {
        tt = document.getElementById('campo').value = "d";
    } else if (this.count === 2) {
        tt = document.getElementById('campo').value = "e";
    } else if (this.count === 3) {
        tt = document.getElementById('campo').value = "f";
    } else if (this.count === 4) {
        tt = document.getElementById('campo').value = "3";
        count = 0;
    }
}

function button_04() {
    this.count += 1;
    if (this.count === 1) {
        tt = document.getElementById('campo').value = "g";
    } else if (this.count === 2) {
        tt = document.getElementById('campo').value = "h";
    } else if (this.count === 3) {
        tt = document.getElementById('campo').value = "i";
    } else if (this.count === 4) {
        tt = document.getElementById('campo').value = "4";
        count = 0;
    }
}

function button_05() {
    this.count += 1;
    if (this.count === 1) {
        tt = document.getElementById('campo').value = "j";
    } else if (this.count === 2) {
        tt = document.getElementById('campo').value = "k";
    } else if (this.count === 3) {
        tt = document.getElementById('campo').value = "l";
    } else if (this.count === 4) {
        tt = document.getElementById('campo').value = "5";
        count = 0;
    }
}

function button_06() {
    this.count += 1;
    if (this.count === 1) {
        tt = document.getElementById('campo').value = "m";
    } else if (this.count === 2) {
        tt = document.getElementById('campo').value = "n";
    } else if (this.count === 3) {
        tt = document.getElementById('campo').value = "o";
    } else if (this.count === 4) {
        tt = document.getElementById('campo').value = "6";
        count = 0;
    }
}

function button_07() {
    this.count += 1;
    if (this.count === 1) {
        tt = document.getElementById('campo').value = "p";
    } else if (this.count === 2) {
        tt = document.getElementById('campo').value = "q";
    } else if (this.count === 3) {
        tt = document.getElementById('campo').value = "r";
    } else if (this.count === 4) {
        tt = document.getElementById('campo').value = "s";
    } else if (this.count === 5) {
        tt = document.getElementById('campo').value = "7";
        count = 0;
    }
}

function button_08() {
    this.count += 1;
    if (this.count === 1) {
        tt = document.getElementById('campo').value = "t";
    } else if (this.count === 2) {
        tt = document.getElementById('campo').value = "u";
    } else if (this.count === 3) {
        tt = document.getElementById('campo').value = "v";
    } else if (this.count === 4) {
        tt = document.getElementById('campo').value = "8";
        count = 0;
    }
}

function button_09() {
    this.count += 1;
    if (this.count === 1) {
        tt = document.getElementById('campo').value = "w";
    } else if (this.count === 2) {
        tt = document.getElementById('campo').value = "x";
    } else if (this.count === 3) {
        tt = document.getElementById('campo').value = "y";
    } else if (this.count === 4) {
        tt = document.getElementById('campo').value = "v";
    } else if (this.count === 5) {
        tt = document.getElementById('campo').value = "9";
        count = 0;
    }
}

function limpar() {
    document.getElementById('campo').value = '';
}