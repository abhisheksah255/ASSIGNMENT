/*
 Write a program that returns next Armstrong number after calling getNextArmstrong() method.
*/
let numbers = [122,153,300];
function Armstrong(numbers=153){
    
    let sum=0;
    let dublicateNumber=numbers;

    while(dublicateNumber>0){
        let remainder=dublicateNumber%10;
        dublicateNumber=parseInt(dublicateNumber/10);
        sum +=remainder*remainder*remainder;
    }
    if(sum==numbers){
        console.log("This Number is an Armstrong Number:--"+numbers);
    }
    else{
        console.log("not a armstrong number");
        
    }
}
let result=Armstrong(numbers);
console.log(result);
let iter = numbers[Symbol.iterator]();
console.log(iter.next());
console.log(iter.next());
