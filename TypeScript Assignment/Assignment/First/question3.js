/*
: Create an ‘Order’ object having data members ‘id’, ‘title’, ‘price’. Add the methods printOrder() & getPrice().
Now, copy the order object using Object.assign().
*/
function Order(id, title, price) {
    return {
        id: id,
        title: title,
        price: price
        // getorder:function(){
        //     return 
        //         Order(id,title,price);
        // };
    };
    // var getOrder=Object.assign(Order)
}
var getOrder = Order(101, "momoes", 100);
var printOrder = getOrder;
console.log(printOrder);
