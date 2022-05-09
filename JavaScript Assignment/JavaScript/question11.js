
var str='abhishek';
function reverse(str){
    let tempValue="";
    for(let i=str.length-1;i>=0;i--){
        let char=str.charAt(i);
        tempValue +=char;

    }
    return tempValue;
};
console.log(reverse(str));
