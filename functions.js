function add(a, b){
    return a*b;
}

const sum = add(4, 6);

console.log(sum);



//2. Annonymous function OR Function expression
//This functions has no name but we are giving with variable name

const multi = function(a, b){
   return a*b;
}

const multivalues = multi(5, 9);

console.log(multivalues);

//3. Arrow Function
// No need give any name here this is also cally Annonymouns function

const substract = (t1, t2) => t1-t2;

console.log(substract(5, 8));

//4. Function Constructor : In this constructur last argument will be the body

const multy = new Function('a', 'b', 'return a*b;');

const multiply = multy(5, 6);

console.log(multiply);

//5. IIFE (Immediatly Invoked Function Expression)

(function() {
    console.log("This is Java Script");
})();

//6. High Order function

function add(a, b){
    return a+b;
}

function operator(funcName, a, b){
   return funcName(a, b);
}

const addition = operator(add, 4, 5);
 
console.log(addition);