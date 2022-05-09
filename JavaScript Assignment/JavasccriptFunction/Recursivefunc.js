function isEven(n){
    return (n%2==0);
}

function find(arr, isEven){
    var i = 0, j = 1;

    if(isEven(arr[i])){
        document.write(arr[i]);
    }

    else{
        find(arr.slice(j, 5), isEven);
        j++;
    }

}

let inputArray = [];
var size = 5; //Maximum Array size

for(var i=0; i<size; i++) {
	
	//Taking Input from user
	inputArray[i] = prompt('Enter Element ' + (i+1));
}
find(inputArray, isEven);