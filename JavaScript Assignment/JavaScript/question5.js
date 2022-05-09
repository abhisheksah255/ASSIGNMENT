var year = prompt("Enter year to find out the next 20 leap years:--");
var counter = 20;

function leapyear(years, num) {
   
    years = parseInt(years);
    var origNum = num;
    years++;
   
    var leapYears = '';
    while (num > 0) {
        // logic to count leap year 
        if (years % 4 === 0 && (years % 100 !== 0 || ( years % 100 === 0 && years % 400 === 0))) {
           
            if (num === 1) {
                leapYears += years + ".";
            }
            else {
                leapYears += years + "--";
            }
            //increase years
            years++;
            //decrease num
            num--;
        }
        else {
            years++;
        }
    }
    return "Next " + origNum + " leap years:---> " + leapYears;
}
console.log(leapyear(year,counter));
document.write(leapyear(year, counter));