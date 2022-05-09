/*
7.	De-structuring assignment:
a.	Suppose there is a javascript array with 4 elements. Print the value of 3rd element using array matching.
b.	Create an organization object having attributes name, address. Write a program to retrieve pin code of an address using object deep matching.

*/

let arrayfind=["abhi","aman","aniket","komal"];
console.log(arrayfind[2]);

const organization={
    'name':"Abhishek",
    'address':{
        "city":"lucknow",
        "state":"Uttar Pradesh",
        "pincode":226110
    }

}
const {address:{pincode}}=organization;
console.log(`name:--${organization.name}   pincode:--${pincode}`);
//console.log(pincode);


