

function addtwoarray(x,y){
   
    let c=x.concat(y);
    console.log(c);
  return c;
}
let x=["a","b","c"];
let y=[1,2,3];
//var answer=addtwoarray(["a","b","c"],[1,2,3]);
var answer=addtwoarray(x,y);
console.log("the answer is :--" +answer);