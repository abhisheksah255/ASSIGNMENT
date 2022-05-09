var fib = function (a, b) {
    var _current = a + b;
    return {
        current: _current,
        next: function () {
            return fib(b, _current);
        }
    };
};
var generator = fib(1, 7);
console.log(generator.current); // will print out 2
var result = generator.next();
console.log(result.current);
