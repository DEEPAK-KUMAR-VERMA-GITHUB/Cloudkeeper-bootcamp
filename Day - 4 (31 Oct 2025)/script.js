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
