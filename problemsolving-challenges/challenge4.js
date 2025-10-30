const prompt = require("prompt-sync")();

/*
we have an array of number we should add one to another till we get a negatif number
we create a loop that check if the element of array is negative, if its negatif we close the loop
if not we keep adding every element to the total
*/
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