let add=(num1=10,num2=20)=>{
    return num1+num2;
}
console.log("The sum of two numbers is:--"+add());

let Userfriends=(username:any,friends:any)=>{
    //console.log(username);
    console.log(username,{username:friends});
}
Userfriends("Abhishek",["Aman","Ankush","Abhishek","Aniket","Anuragh","Anirban"]);
Userfriends("Rohit",["Raman","Rakhi","Rahul","Roshani","Ram"]);
Userfriends("Komal",["kajal","Komal","kanika","Kanak"]);
Userfriends("Nitesh",["Nikhil","Nitesh","Neha"]);

var CapitalNames=(name1:any)=>{
console.log(name1.toUpperCase());
}
CapitalNames("Abhishek");
CapitalNames("aniket");
CapitalNames("rahul");
CapitalNames("mohit");
CapitalNames("sumit");
CapitalNames("rohit");