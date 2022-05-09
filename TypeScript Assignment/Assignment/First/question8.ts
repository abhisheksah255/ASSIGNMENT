/*
8.	Classes & Modules:
    Write a class Account with attributes id, name, balance. 
    Add two sub classes SavingAccount & CurrentAccount having specific attribute interest & cash_credit respectively.
    Create multiple saving & current account objects. Write a functionality to find out total balance in the bank.
*/
class Account{
    constructor(id:Number,name:any,balance:any){
    id=id;
    name=name;
    balance=balance;
    console.log("id:--"+" " +id+" "+ "name:--"+name+" "+ "balance:-" + balance);
    }

}
let input=new Account(121,"Abhishek kumar sah",654321);
var inputamount=new Account(101,"Abhishek",23456);

class SavingAccount extends Account{
    constructor(intrest:any){
        super(id:Number,name:any,balance:any,intrest:any);
        intrest =balance/100*10;
        let updatebalance=intrest+balance;
        return updatebalance;
    }

}

class CurrentAccount extends Account{
constructor(cash_credit:Number){
    super(id:Number,name:any,balance:any,cash_credit:Number);
    cash_credit=1000;
    let updatebalance=balance-cash_credit;
    return updatebalance;
}
}

