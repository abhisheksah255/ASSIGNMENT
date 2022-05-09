function squares(n){
    return n*n;
}

function squareRoots(n){
    return (Math.sqrt(n));
}

function mapSquares(arr1, squareValues){

    if(j < inputArray1.length){
        var result = squareValues(arr1[i]);
        newArray[j] = result;
        j++;
        mapSquares(inputArray1.slice(j, 5), squareValues);
    }

    else if(j == inputArray1.length){
        document.write(newArray+"<br>");
        j = 0;
    }

}

function mapSquareRoots(arr2, squareRootValues){

    if(j < inputArray2.length){
        var result = squareRootValues(arr2[i]);
        newArray[j] = result;
        j++;
        mapSquareRoots(inputArray2.slice(j, 5), squareRootValues);
    }

    else if(j == inputArray2.length){
        document.write(newArray+"<br>");
        j = 0;
    }

}
var arr1 = prompt("Enter arr1 elements with commas: ");
var arr2 = prompt("Enter arr2 elements with commas: ");

arr1 = arr1.split(",");
arr2 = arr2.split(",");


var newArray = new Array(5);
var i = 0, j = 0;

for(i = 0; i < arr1.length; i++)
    arr1[i] = parseInt(arr1[i]);
    
for(i = 0; i < arr2.length; i++)
    arr2[i] = parseInt(arr2[i]);

mapSquares(arr1, squares);
mapSquareRoots(arr2, squareRoots);