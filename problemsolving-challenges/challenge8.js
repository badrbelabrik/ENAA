const prompt = require("prompt-sync")();

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
