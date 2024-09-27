console.log("Hi!");
console.log(10 + 5);
// console.log means like Printing Statement
// Everthing writtrn within console.log it prints

a = 15;
b = 110;
console.log(a + b);
// Here a is variable its stores the value of 5

var a = 2; // declaration & innitilaization iat same time
var b = 3.5;
console.log(a + b);

var a; //variable declaration
var b = 3.5;
a = 5.5; // variable initialization
console.log(a + b);

// Decaring a Variable
/* achieved in 3 Ways

var (gloabal declaration)
let (Block level CSSStyleDeclaration)
const (Constant / static variable in cannot change) */

console.log(typeof a);
// Defines what the type of value stored in variable a

var c = "masha";
console.log(typeof c);
//yes it shown its string (string is nothing but Sequence of / combination of, characters / letters.)

var x = true;
console.log(typeof x);
//it shows boolean, yes boolean is also a data type it only mention 2 state true or false

var x = "true";
console.log(typeof x);
// in this the true mentioned in "" its shows the type is string

var a;
var y;
console.log(typeof a);
console.log(typeof y);
//in this we not assign any value to the variable y so it return the data type undefined

const name = "masha";
console.log(name);
// name = "menaga";
// console.log(name);
//it throws an error beacuse const variable define only one time the same variable cannot assign any value anothertime

var name1 = "masha ";
var name2 = "menaga";
console.log("The Actual name is " + name1 + name2);
//here  we can concadinate(+) the strings, variables and printing statemnets also
