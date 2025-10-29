// ================ Q3 to Q9 ====================


// Starting array
var numbers = [1, 2, 3, 4];
console.log("Initial array:", numbers);

// 1. Add a number to the end of the array
numbers.push(5);
console.log("After adding 5 to the end:", numbers);

// 2. Remove the first number from the array
numbers.shift();
console.log("After removing the first element:", numbers);

// 3. Insert a number at a specific index
// Example: insert 99 at index 2
numbers.splice(2, 0, 99);
console.log("After inserting 99 at index 2:", numbers);

// 4. Replace all occurrences of a number with another number
// Example: replace 3 with 100
numbers = numbers.map(num => num === 3 ? 100 : num);
console.log("After replacing 3 with 100:", numbers);

// 5. Sort the array in ascending order (without using sort())
for (let i = 0; i < numbers.length - 1; i++) {
  for (let j = 0; j < numbers.length - i - 1; j++) {
    if (numbers[j] > numbers[j + 1]) {
      let temp = numbers[j];
      numbers[j] = numbers[j + 1];
      numbers[j + 1] = temp;
    }
  }
}
console.log("After manual ascending sort:", numbers);

// 6. Reverse the array (without using reverse())
for (let i = 0; i < Math.floor(numbers.length / 2); i++) {
  let temp = numbers[i];
  numbers[i] = numbers[numbers.length - 1 - i];
  numbers[numbers.length - 1 - i] = temp;
}
console.log("After manual reverse:", numbers);

// 7. Find the index of a specific number
// Example: find index of number 5
let index = -1;
for (let i = 0; i < numbers.length; i++) {
  if (numbers[i] === 5) {
    index = i;
    break;
  }
}
console.log("Index of 5:", index);
