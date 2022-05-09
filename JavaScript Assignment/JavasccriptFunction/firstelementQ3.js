/*
Make a function called “find” that takes an array and a test function, and returns the first element of
the array that “passes” (returns non-false for) the test. Don’t use map, filter, or reduce.
function isEven(num) { return(num%2 == 0); }
isEven(3) --> false
isEven(4) --> true
find([1, 3, 5, 4, 2], isEven); --> 4
*/
function isEven(n){

    if(n%2==0){
        return true;
    }

    else{
        return false;
    }

}

function find(arr, fun){
    
    for(i=0;i<arr.length;i++){
        if(fun(arr[i])==true){
            return arr[i];
        }
    }

}
let inputArray = [];
var size = 5; //Maximum Array size

for(var i=0; i<size; i++) {
	
	//Taking Input from user
	inputArray[i] = prompt('Enter Element ' + (i+1));
}
document.write(find(inputArray, isEven));