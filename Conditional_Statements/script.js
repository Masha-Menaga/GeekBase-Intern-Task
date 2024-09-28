// Simple if Statement
if (2 == 2) {
  console.log("Equal");
}

// With Variable
var a = 2;
if (a == 2) {
  console.log("Equal");
}

//If Else Statement
if (3 == 2) {
  console.log("Equal");
} else {
  console.log("Not Equal");
}

//Else-if Statement
let mark = 60;
if (mark > 90) {
  console.log("Grade A");
} else if (mark > 80 && mark <= 90) {
  console.log("Grade B");
} else if (mark > 60 && mark <= 80) {
  console.log("Grade C");
} else if (mark > 50 && mark <= 60) {
  console.log("Grade B");
} else if (mark > 40 && mark <= 50) {
  console.log("Grade B");
} else {
  console.log("Fail");
}

//Switch Case
let day = "Monday";
switch (day) {
  case "sunday":
    console.log("First Day");
    break;
  case "Monday":
    console.log("Second Day");
    break;
  case "Tuesday":
    console.log("Third Day");
    break;
  case "Wednesday":
    console.log("Fourth Day");
    break;
  case "Thursday":
    console.log("Fifth Day");
    break;
  case "Friday":
    console.log("Sixth Day");
    break;
  case "Saturday":
    console.log("Seventh Day");
    break;
  default:
    console.log("Given day is not valid");
    break;
}

//Ternory Operator
let num = 5;
num / 2 ? console.log("Even") : console.log("Odd"); //all number divided by 2 but we check the remindar is 0 soo
num % 2 == 0 ? console.log("Even") : console.log("Odd");
