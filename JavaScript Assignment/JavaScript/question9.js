function Alternate(array1, array2) {
    if (array1.length == array2.length) {
      var c = [];
      for (var i = 0; i < array1.length; i++) {
        c.push([array1[i], array2[i]]);
      }
      return c;
    }
    return null;
  }
  var array1=["a","b","c"];
  var array2=[1,2,3];
  var answer=Alternate(array1,array2);
console.log("the answer is :--" +answer);