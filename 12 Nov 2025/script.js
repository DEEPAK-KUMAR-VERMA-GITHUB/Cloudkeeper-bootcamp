// const add = (a, b) => a + b;    // function to add two numbers

// const person = {
//     name: 'Alice', age: 25, address: {
//         city: 'New York',
//         country: 'NY'
//     }
// };

// const { name, address: { city } } = person;
// console.log(name, city);

// const fun = (name = "abc") => {
//     if (name) console.log("if", name);
//     else console.log("else", name);
// };
// fun("");


var arr = [3, 1, 4, 1, 5];

// function to make element to zero
function convertToZero(number){
    return arr.map(num => num == number ? 0 : num)
}

const convertedArr = convertToZero(1);
console.log(convertedArr)

// const inputArray = [1,[2,3],4,[5,6,7]];

// const flattenArray = (arr) => {

//     if(arr instanceof Object){
//         return arr;
//     }

//     if(Array.isArray(arr)){
//         arr.forEach(arr => flattenArray(arr));
//     }
// }

// console.log(flattenArray(inputArray));