const prompt = require("prompt-sync")();

let mot = prompt("Entrez un mot: ");
let motinverse = mot.split("").reverse().join("");
console.log(motinverse)

if (mot === motinverse){
    console.log("Le mot est palindrome")
} else { console.log("Le mot n'est pas un palindrome")}