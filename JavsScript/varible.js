var a = 10;
let str = "HEllo world";
console.log(str);
console.log(a);
console.log(typeof(str));
console.log(typeof(a));
a = 15;
console.log(a);
const n = 10;
console.log("The constant declare is: "+n);
//n=15; // Error: Assignment to constant variable.
//console.log("The varible calue does not change.: "+n);

// Array declaration
let arr = [1, 2, 3, 4, 5];
console.log(arr);
let arr2 = new Array("hello","MOTO","Kaju","motaha");
console.log(arr2);
console.log();
console.log("The length of array is: "+arr.length);
console.log("Type of arr: "+typeof(arr));
console.log("Type of arr: "+typeof(arr2));

// Neasted array
let nestedArr = [1,[1,2,3],2,[4,5,6],3,[7,8,9]]
console.log('The normal coll of array element'+nestedArr[3]);
console.log('This is neasted element coll in the array.'+nestedArr[3][1]);

// add the element in array

var animal = ["dog","cat",'cow'];
console.log(animal);
animal.push("horse");//add the element
console.log(animal);
// add the element in array at the specific index
animal.splice(2,0,"goat");
console.log(animal);
// delete the element from array
animal.splice(2,1);
console.log(animal);
console.log(animal.sort());