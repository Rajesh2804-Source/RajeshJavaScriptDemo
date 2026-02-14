console.log("Java Test Framework".replace("Java", "JS"));

console.log("Java Test Framework Java".replace("Java", "JS"));

console.log("Java Test Framework Java".replaceAll("Java", "JS"));


let value = "JAVASCRIPT";

let valuearray = value.split("");

for(let i=0; i<value.length; i++) {
   console.log(valuearray[i])
}

let rev = "PLAYWRITE";

let revarray = rev.split("");

for(let i=rev.length-1; i>=0; i--) {
   console.log(revarray[i]);
}



function reverseString(str) {
    let newString = "";
    for (let i = str.length - 1; i >= 0; i--) {
        newString += str[i];
    }
    return newString;
}

console.log(reverseString("JAVA123"));