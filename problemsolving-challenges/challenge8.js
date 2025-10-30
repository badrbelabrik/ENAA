const prompt = require("prompt-sync")();

/*
the program is about showing how many times every letter of word is repeated
first we ask for a word from the user 
then i create a loop for assigning the letters in an array without been repeated
after that in another loop we compare the elements of the array with the word letters
using a counter
the we display how much time every letter have been repeated
*/

let mot = prompt("Entrez un mot: ");
let lettres = [];

for (let i=0; i<mot.length; i++){
    if(!lettres.includes(mot[i])){
    lettres.push(mot[i]);
    }
}

for(let i=0; i<lettres.length; i++){
    let counter=0;
    for (let j=0; j<mot.length; j++){
        if(lettres[i] == mot[j]){
            counter ++;
        }
    }
console.log(`${lettres[i]} repetée ${counter} fois`)
}
