let fruits = ["Apple", "Banana", "Mango"];

//1. Push

fruits.push("Papaya");

console.log(fruits);

//2. Pop

fruits.pop();

console.log(fruits);

//3. shift

let removefirst = fruits.shift();

console.log(removefirst);

let lang = ["java", "ruby", "python"];

//4. Un Shift

lang.unshift("HTML");

console.log(lang);

//5. Splice

lang.splice(1, 1, "Raj");

console.log(lang);

//6 slice

let num = [1, 2, 3, 4, 5, 6];

let numewmove = num.slice(1, 3);

console.log(numewmove);

//7. concat

let merge = num.concat(fruits);

console.log(merge);

//8. indexof

let pages = [1, 2, 3, 4, 5, 6];

let pageindex = pages.indexOf(2);

console.log(pageindex);

//9. include

pages.includes(7);






