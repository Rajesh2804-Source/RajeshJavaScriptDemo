const values = [1, 2, 3, 4];

const [a, b, c, d] = values;

console.log(a);

console.log(b);

console.log(c);

console.log(d);

const langs = ["JAVA", "PYTHON", "RUBY"];

const [p, q, ...testlanguages] = langs;


//object creation

const details = {
   name: 'Rajesh',
   age: 20,
   gender : 'Male'
};

const {name, age, study='B.tech', gender} = details;

console.log(name);
console.log(age);
console.log(gender);
console.log(study);


const persondetails = {
    name: 'Rajesh',
    wife: 'Siri'
};

function printdetails(persondetails) {
     console.log(persondetails.name+ '   '+persondetails.wife );
};

printdetails(persondetails);

const details1 = {
    username: 'user1',
    password: 'pwd1',
};

function testdetails({username, password}) {
     console.log(username);
     console.log(password);
}



testdetails(details1);


