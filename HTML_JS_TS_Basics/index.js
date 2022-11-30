var name = "Harsh"
var age = 24;
console.log(name + " " + age)
var isGraduate = true;
var laptop;
laptop = "dell"
console.log(isGraduate);

function alertUser(){
    var sleeping = false;
    if(sleeping){
        console.log("User is not alert")
    }else{
        console.log("User is alert");
    }
}

function counting(){
    for(let i = 1; i<10; i++){
        console.log(i);
    }
}

var car = new Object();
car.brand = "Tata"
car.model = "Tiago"
car.price = 600000;


console.log(car.model + " " + car.brand + " " + car.price)

console.log(car);

var name = ["HArsh","Malik"]
console.log(name);

alertUser();
counting();

function dogs(){
    this.dogname = "Lab"
    throw new error("This is not a wild dog")
}

dogs.prototype.display = function(){
    return "This dog breed is : " + this.dogname;
}

//constructor function
function Animal(dogname){
    this.dogname = dogname
}

//create an object without using the constructor
Animal.prototype = Object.create(dogs.prototype)
let tommy = new Animal("Gernam Shepherd")
console.log(tommy.display());