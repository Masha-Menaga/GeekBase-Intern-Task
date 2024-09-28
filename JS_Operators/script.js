var a = 10;
var b = 20;
{
  var c = a + b;
}
console.log("The C value is : " + c);

// var a = 10;
// var b = 20;
// {
//   let c = a + b;
// }
// console.log("The C value is : " + c);

// Arithmetic Operators
console.log(15 + 65);
console.log(15 - 65);
console.log(15 * 65);
console.log(65 / 15); //Shows Quation
console.log(65 % 15); //Shows Reminder
console.log(2 ** 3);

let x = 5;
x++; //increment operator X++ = X+1
console.log(x); //6
console.log(x++); //6 print then only add, after add 7
console.log(x); //7
console.log(++x); //8 alrady 7 in x so 1+7

let y = 10;
y--; //Decrement Operator y-- = y-1
console.log(y); //9
console.log(y--); //9 y value is 9 it prints the value then only decrement works. then9-1=8
console.log(y); //8
console.log(--y); //7 already 8 then -1

//Assignment Operators

let d = 2;
let e = 10;
console.log((d = 2)); //2
console.log((d += 2)); //4  d=d+2
console.log((d -= 2)); //2  d=d-2
console.log((d /= 2)); //1  d=d/2
console.log((e %= 2)); //0  e=e%2
console.log((d **= 2)); //1  d=d**2

//Comparision Operator
//It only prints the Boolean Value
console.log(2 == 3);
console.log(2 != 3);
console.log(2 === 2); // true   it means 3= check also the Data Type whether its same or not
console.log(2 === "2"); // flase   beacuse with double quotes its string
console.log(2 !== 2); // false   beacause its equal
console.log(2 > 3);
console.log(2 < 3);
console.log(2 >= 3);
console.log(2 <= 3);
console.log(3 <= 3);
console.log(3 > 3);

// Logical Operator
// console.log((2=2)&&(2<3));
console.log(2 <= 3 && 2 == 2);
console.log(4 <= 3 && 2 == 2);
//in AND If anyone is False is False

//                 AND     OR      NOT
// true    true  =  true    true    TRUE= FALSE,  FALSE =TRUE
// false   true  = false   true
// true    false = false   true
// false   false = false   false

console.log(2 <= 3 || 2 == 2);
console.log(4 <= 3 || 2 == 2);
//in OR if Anyone is True is True

console.log(!(3 == 2)); //3==2 its false but in put ! so its changes false
console.log(!(2 == 2)); // same here
// because in NOT operator return the opposite of the value if its true its return False, if its false it return true.
