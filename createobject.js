function car(Brand, Model, Price) {
    this.Brand = Brand;
    this.Model = Model;
    this.Price = Price;
};

const c1 = new car("BMW", "G4", "200000");

console.log(c1.Brand+" "+c1.Model+" "+c1.Price);


