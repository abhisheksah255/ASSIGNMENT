
/*
1. Make a function called composedValue that takes two functions f1 and f2 and a value and returns
f1(f2(value)), i.e., the first function called on the result of the second function called on the value.
function square(x) { return(x*x); }
function double(x) { return(x*2); }
composedValue(square, double, 5); --> 100 // I.e., square(double(5))
*/
function Square(x){
    return x*x;
}

function double(x){
    return x*2;
}

function composedValue(fun1, fun2, val){
    var doubledValue = fun2(val);
    var squaredValue = fun1(doubledValue);

    return squaredValue;
}

var number = parseInt(prompt("Enter a number: "));

document.write("The composed Value is:--"+composedValue(Square, double, number));