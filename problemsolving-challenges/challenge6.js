const prompt = require("prompt-sync")();

/*
the program is about showing the number of vowels in a word given by the user
so we create a loop that check every element of the word 
if its a vowels the counter increment by 1
*/

let mot = prompt("Entrez un mot: ");
let counter = 0;
for (let i=0; i<mot.length; i++){
    if(mot[i]=="a" ||mot[i]=="e" ||mot[i]=="i" ||mot[i]=="o" ||mot[i]=="u"){
        counter ++;
    }
}

console.log(`Nombre de voyelles :${counter}`);