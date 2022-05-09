var add = function (num1, num2) {
    if (num1 === void 0) { num1 = 10; }
    if (num2 === void 0) { num2 = 20; }
    return num1 + num2;
};
console.log("The sum of two numbers is:--" + add());
var Userfriends = function (username, friends) {
    //console.log(username);
    console.log(username, { username: friends });
};
Userfriends("Abhishek", ["Aman", "Ankush", "Abhishek", "Aniket", "Anuragh", "Anirban"]);
Userfriends("Rohit", ["Raman", "Rakhi", "Rahul", "Roshani", "Ram"]);
Userfriends("Komal", ["kajal", "Komal", "kanika", "Kanak"]);
Userfriends("Nitesh", ["Nikhil", "Nitesh", "Neha"]);
var CapitalNames = function (name1) {
    console.log(name1.toUpperCase());
};
CapitalNames("Abhishek");
CapitalNames("aniket");
CapitalNames("rahul");
CapitalNames("mohit");
CapitalNames("sumit");
CapitalNames("rohit");
