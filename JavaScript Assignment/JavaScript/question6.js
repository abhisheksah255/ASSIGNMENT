var x = ["hello","world","in","a","frame"];

function star(str) {
  let arr = [];

  for (let index = 0; index < 1; index++) {
    console.log("*******");
    for (let j = 0; j <= arr.length; j++) {
     arr == arr[j].split(",");
      console.log("*" + arr[j] + "*" );
    }
  }
  console.log("******");
  return arr;
}
console.log(star(x));