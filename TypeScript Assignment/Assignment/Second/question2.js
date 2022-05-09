/*
 Write a program that returns next Armstrong number after calling getNextArmstrong() method.
*/
var numbers = [122, 153, 300];
function Armstrong(numbers) {
    if (numbers === void 0) { numbers = 153; }
    var sum = 0;
    var dublicateNumber = numbers;
    while (dublicateNumber > 0) {
        var remainder = dublicateNumber % 10;
        dublicateNumber = parseInt(dublicateNumber / 10);
        sum += remainder * remainder * remainder;
    }
    if (sum == numbers) {
        console.log("This Number is an Armstrong Number:--" + numbers);
    }
    else {
        console.log("not a armstrong number");
    }
}
var result = Armstrong(numbers);
console.log(result);
var iter = numbers[Symbol.iterator]();
console.log(iter.next());
console.log(iter.next());
