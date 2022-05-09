/*
Make a function called compose that takes two functions f1 and f2 and returns a new function that,
when called on a value, will return f1(f2(value)). Assume that f1 and f2 each take exactly one argument.
var f1 = compose(square, double);
f1(5); --> 100
f1(10); --> 400
var f2 = compose(double, square);
f2(5); --> 50
f2(10); --> 200
*/

function squareValue(num){
    return num*num;
}

function doubleValue(num){
    return num*2;
}

function compose(){
    return squareValue(doubleValue(num))+ " "+doubleValue(squareValue(num));
}

var num = parseInt(prompt("Enter a number: "));
document.write("The composed value is:---"+compose());