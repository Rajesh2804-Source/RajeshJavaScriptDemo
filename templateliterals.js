const a = "Testing";

function getXpath(name) {
    return `//input[@id='${name}']`;
};

console.log(getXpath('Rajesh'));