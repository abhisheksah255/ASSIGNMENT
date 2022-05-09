/*
4. Recent JavaScript versions added the “map” method of arrays, as we saw in the notes and used in
the previous set of exercises. But, in earlier JavaScript versions, you had to write it yourself. Make
a function called “map” that takes an array and a function, and returns a new array that is the result
of calling the function on each element of the input array. Don’t use map, filter, or reduce.
map([1, 2, 3, 4, 5], square); --> [1, 4, 9, 16, 25]
map([1, 4, 9, 16, 25], Math.sqrt); --> [1, 2, 3, 4, 5]
Hint: remember the push method of arrays.

*/
function findSquares(a1){
    var squaredArray = [];

    for(i = 0; i < a1.length; i++){   
        var square = a1[i]*a1[i];
        squaredArray.push(square);
    }

    return squaredArray;
}

function findSquareRoot(a2){
    var squareRootedArray = [];

    for(i = 0; i < a2.length; i++){
        var squareRoot = Math.sqrt(a2[i]);
        squareRootedArray.push(squareRoot);
    }

    return squareRootedArray;
}

var arr1 = prompt("Enter arr1 elements with commas: ");
var arr2 = prompt("Enter arr2 elements with commas: ");

arr1 = arr1.split(",");
arr2 = arr2.split(",");

for(i = 0; i < arr1.length; i++)
    arr1[i] = parseInt(arr1[i]);
            
for(i = 0; i < arr2.length; i++)
    arr2[i] = parseInt(arr2[i]);
                
document.write("Input Array1: "+arr1+" ---->  "+findSquares(arr1));
document.write("<br>Input Array2: "+arr2+" ----> : "+findSquareRoot(arr2));