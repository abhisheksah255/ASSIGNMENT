var input = parseInt(prompt('Enter a number for calulating the sum  from 1 to n:--'));

var sum = 0;
for (let i = 1; i <= input; i++) {
    sum += i;
}

console.log("The sum of the numbers are:--", sum);
document.write("The sum of the numbers are:--", sum);