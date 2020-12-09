let text: string;
text = 'Hello World';

let text1: string;
text = 'Hello Worldaaaa';

console.log(text);
console.log(text1);

let in1: string;
in1 = "JOHN ZA 007"
console.log("1",in1.length);

console.log("2",in1.charAt(20));

console.log("3",in1[20]);

let str1: string = "Hello";
let str2: string = "World";

console.log("4",`${str1} ${str2}`)



console.log(str1.startsWith("sss"));

console.log(str1.startsWith("H"));

console.log( "Widget with id".includes("Widget") );

//lab1
console.log("microsoft excel".toUpperCase());
console.log("GOOGLE AND APPLE".toLowerCase());
let hello = "hello world";
hello = "H" + hello.slice(1, 6) + "W" + hello.slice(7);
console.log(hello);

//lab2
console.log(text.startsWith("Hello"));
console.log(text.startsWith("World"));
console.log(text.endsWith("Hello"));
console.log(text.endsWith("World"));
console.log("Computer".slice(3, 6));
console.log("Death Race".slice(0, 4));
console.log("Republican".slice(2, 8));

//Number
let a =1e6;
console.log("a",a)

let b =1e7;
console.log("b",b)

let c =43e9;
console.log("c",c)

let d = 0.e612;
console.log("d",d)

let num: number = 100
let num2: number = 111
let num3: number = 55
let num4: number = 21
let num5: number = 99
console.log(num.toString(8));
console.log(num2.toString(8));
console.log(num3.toString(8));
console.log(num4.toString(8));
console.log(num5.toString(8));

console.log(num.toString(16));
console.log(num2.toString(16));
console.log(num3.toString(16));
console.log(num4.toString(16));
console.log(num5.toString(16));

console.log(Math.round(12.423));
console.log(Math.round(31313.135));
console.log(Math.round(42.809));