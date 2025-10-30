const prompt = require("prompt-sync")();

/*
the program get a word from the user to show if its palindrome or not
first we reverse the word using the functions split() and reverse() and join()
then we compare it with the original word if they are equal its palindrome
if not it is not palindrome
*/

let mot = prompt("Entrez un mot: ");
let motinverse = mot.split("").reverse().join("");
console.log(motinverse)

if (mot === motinverse){
    console.log("Le mot est palindrome")
} else { console.log("Le mot n'est pas un palindrome")}