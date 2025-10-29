const prompt = require("prompt-sync")();

function remplirtable(){
    let tab = [];
    let elements = Number(prompt("Combien d'elements dans le tableau:"));
    for (let i=0; i<elements; i++){
        let N = Number(prompt(`Entrez la valeur ${i+1}: `));
        tab.push(N);
    }
    return tab;
}
let tab1 = remplirtable();
let somme = 0;
for(let i=0; i<tab1.length; i++){
    if(tab1[i]<0){
        break;
    }
    else{somme += tab1[i]}
}
console.log(`la somme est: ${somme}`)