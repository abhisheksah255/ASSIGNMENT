
var number=prompt("Enter any number:-");
sum=0;
if(number>3){
    console.log("work on process");
    document.write("Numbers which are divisible by 3 or 5:--");
for(let i=3;i<=number;i++){
    if(i%3==0 || i%5==0){
        sum=sum+i;
        
 console.log(i);  
 document.write(",",i); 
    }else{
        console.log("Not a multiple");
    }
}
}