function Paritybased(number)
{
    var parity = false;
    while(number != 0)
    {
        parity = !parity;
        number = number & (number - 1);
    }
    return parity;
}
     
var number=prompt("enter any number:-");
document.write("Parity of no " + number + " = " +
              (Paritybased(number) ? "odd": "even"));