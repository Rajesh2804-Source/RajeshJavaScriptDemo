const value =  [1, 1, 1, 3, 3, 7, 9 ];
const uniquevalues = [...new Set(value)];
console.log(uniquevalues); 

// Integer to String
const num = 30;
const str = num + '';
console.log(str);

// String to Integer
const strNum = "50";
const intNum = parseInt(strNum, 10);
console.log(intNum);

// Capitalize First Letter of Each Word
const sentence = "hello world from javascript";
const capitalized = sentence.split(' ').map(word => word.charAt(0).toUpperCase() + word.slice(1)).join(' ');
console.log(capitalized);

// Check if a Number is Even or Odd
const number = 42;
const isEven = number % 2 === 0;
console.log(isEven ? 'Even' : 'Odd');

// Reverse a String
const originalString = "JavaScript";
const reversedString = originalString.split('').reverse().join('');
console.log(reversedString);

// Find Maximum in an Array     