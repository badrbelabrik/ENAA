const prompt = require("prompt-sync")();

let mot = prompt("Entrez un mot: ");
let counter = 0;
for (let i=0; i<mot.length; i++){
    if(mot[i]=="a" ||mot[i]=="e" ||mot[i]=="i" ||mot[i]=="o" ||mot[i]=="u"){
        counter ++;
    }
}

console.log(`Nombre de voyelles :${counter}`);