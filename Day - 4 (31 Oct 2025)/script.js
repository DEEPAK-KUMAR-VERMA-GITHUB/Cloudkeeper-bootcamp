/**
 1. Convert to Arrow Function
Rewrite the following function using an arrow function:
function add(a, b) {
    return a + b;
}

 */

const add = (a, b) => a + b;

console.log(add(3, 4));

/**
 * 
 * 2. Default Parameters
Create a function greet that takes two parameters, name and message. If the message is not provided, it should default to "Welcome!". Use default parameters in your implementation.
 * 
 * 
 */

function greet(name, message = "Welcome!") {
  if (name.trim()) {
    console.log(` ${message} ${name}`);
  }
}

greet("Aman");
greet("Aman", "Hi,");

/**
 * 
 * 3. Template Literals
Write a function formatString that takes a name and an age and returns a sentence in the format:
"Hello, my name is [name] and I am [age] years old."

 */

function formatString(name, age) {
  if (name.trim() && age > 0)
    return `Hello, my name is ${name} and I am ${age} years old.`;
}

const formatedString = formatString("Deepak", 25);
console.log(formatedString);

/**
 * 
 * 4. Object Destructuring
Given the following object:
const person = {
    name: 'Alice',
    age: 25,
    address: {
        city: 'New York',
        country: 'NY'
    }
};
Write a function that extracts the name and city properties and logs the sentence: "Alice lives in New York." It should also access and log the address object.

 * 
 */

function extractPersonData(personData) {
  const name = personData.name ? personData.name : "Person";
  const city = personData.address.city
    ? personData.address.city
    : "Default City";

  console.log(personData.address);
  return `${name} lives in ${city}.`;
}

const person = {
  name: "Alice",
  age: 25,
  address: {
    city: "New York",
    country: "NY",
  },
};

console.log(extractPersonData(person));

/**
 * 
 * 5. Rest Operator
Write a function sumAll that takes any number of arguments and returns their sum. Use the rest operator to handle the arguments.
 * 
 */

function sumAll(...numbers) {
  const sum = numbers.reduce((acc, number) => acc + parseInt(number), 0);
  return sum;
}

console.log(sumAll(5, 4, 6, 9, 8, 2));

/***
 * 
 * 6. Filter Even Numbers
Write a function filterEvens that takes an array of numbers and returns a new array containing only the even numbers. Use the filter method.
Example:
filterEvens([1, 2, 3, 4, 5, 6]); // Output: [2, 4, 6]

 * 
 */

function filterEvens(numbers) {
  return numbers.filter((number) => number % 2 === 0);
}

console.log(filterEvens([1, 2, 3, 4, 5, 6]));

/***
 * 
 * 
 * 7. Array Mapping
Write a function doubleValues that takes an array of numbers and returns a new array where each number is doubled. Use the map method.
Example:
doubleValues([1, 2, 3]); // Output: [2, 4, 6]

 * 
 */

function doublevalues(numbers) {
  return numbers.map((number) => number * 2);
}

console.log(doublevalues([1, 2, 3]));

/***
 * 8. Find the Maximum
Write a function findMax that takes an array of numbers and returns the largest number in the array. Use the spread operator.
Example:
findMax([3, 5, 7, 2, 8]); // Output: 8

 * 
 */

function findMax(numbers) {
  let max = numbers[0];
  numbers.forEach((number) => {
    if (number > max) max = number;
  });
  return max;
}

console.log(findMax([3, 5, 7, 2, 8, 6, 7]));

/**
 * 9. Object and Array Destructuring
Given the following data:
const data =[
  {
    name: "Bob",
    age: 24
  },
  {
    name: "Alice",
    age: 21
  }
]

Write a function that extracts the age as  “24”  and name as “Alice” and returns a sentence: "Alice’s age is 24."

 */

function extractData(data) {
  const [person_1, person_2] = data;
  const { name: name_1, age: age_1 } = person_1;
  const { name: name_2, age: age_2 } = person_2;

  return `${name_1}'s age is ${age_1}.\n${name_2}'s age is ${age_2}.`;
}

const data = [
  { name: "Bob", age: 24 },
  { name: "Alice", age: 21 },
];

console.log(extractData(data));

/**
 *
 * 10. Data Manipulation using Array functions
Write a function that manipulates data in such a way that it returns an array of objects again but with the selected keys only.
Input:
[{
"id": 1,
"title": "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
"price": 109.95,
"description": "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
"category": "men's clothing",
"image": "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
"rating": {
"rate": 3.9,
"count": 120
}
}]

Output: 

[{
"id": 1,
"title": "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
"rate": 3.9,
"count": 120
}]
 *
 *
 */

const inputData = [
  {
    id: 1,
    title: "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
    price: 109.95,
    description:
      "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
    category: "men's clothing",
    image: "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
    rating: {
      rate: 3.9,
      count: 120,
    },
  },
];

function manipulateData(inputData) {
  const [obj] = inputData;
  const {
    id,
    title,
    rating: { rate, count },
  } = obj;

  // const { rate, count } = rating;

  return {
    id,
    title,
    rate,
    count,
  };
}

console.log(manipulateData(inputData));

/**
 * 
 * 11. Default Parameter
 const fun = (name = "abc") => {
        if (name) {
          console.log("if", name);
        } else {
          console.log("else", name);
        }
      };
	  
fun(""); 
Output ?
 * 
 */

const fun = (name = "abc") => {
  if (name) {
    console.log("if", name);
  } else {
    console.log("else", name);
  }
};

console.log(fun(""));
// Output =
// else
// undefined

/**
 * 
 * 12. Deep Clone Objects
Write a function deepClone that creates a deep copy of a given object. Ensure that nested objects and arrays are properly cloned without retaining references to the original object.
Example:
const obj = { a: 1, b: { c: 2 } };
const clonedObj = deepClone(obj);
clonedObj.b.c = 42;
console.log(obj.b.c); // Output: 2

 */

function deepClone(obj) {
  // method 1 :
  return structuredClone(obj);
  // method 2 :
  return JSON.parse(JSON.stringify(obj));
}

const obj = { a: 1, b: { c: 2 } };
const clonedObj = deepClone(obj);
clonedObj.b.c = 42;
console.log(obj.b.c); // Output: 2

/***
 * 
 * 13. Flatten Nested Arrays
Write a function flattenArray that takes a nested array and returns a flattened array. Use recursion and/or ES6 methods to solve this problem.
Example:
flattenArray([1, [2, [3, [4, 5]]]]); // Output: [1, 2, 3, 4, 5]
 * 
 */

function flattenArray(nestedArr) {
  // method 1 :
  // return nestedArr.flat(Infinity);

  // method 2 :
  let flattened = [];
  for (let i = 0; i < nestedArr.length; i++) {
    if (Array.isArray(nestedArr[i])) {
      flattened = flattened.concat(flattenArray(nestedArr[i]));
    } else {
      flattened.push(nestedArr[i]);
    }
  }

  return flattened;
}

console.log(flattenArray([1, [2, [3, [4, 5]]]]));
