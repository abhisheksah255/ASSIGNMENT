var fibonaci = function (a, b) {
    var _current = a + b;
    return { 
               current: _current, 
                 next: function () { 
                     return fibonaci(b, _current); 
                 } 
           }
  }
  var generator = fibonaci(1,1);
  console.log(generator.current); // will print out 2
  var result = generator.next();
  console.log(result.current);