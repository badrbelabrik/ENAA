const prompt = require("prompt-sync")();
/* we have an array
we want to check every element of the array if its repeated
so we will create a first loop that give us every element of the array
inside that loop we create a second loop
that check how many times the element repeated
using a counter , we use the condition if (counter>1)
we push the element one time in the new array
*/

let unique = [];
function remplirtable(){
    let tab = [];
    let elements = Number(prompt("Combien d'elements dans le tableau:"));
    for (let i=0; i<elements; i++){
        let N = prompt(`Entrez la valeur ${i+1}: `);
        tab.push(N);
    }
    return tab;
}
let tab1 = remplirtable();
console.log(tab1);

for (let i=0; i<tab1.length; i++){
if(!unique.includes(tab1[i])){
    unique.push(tab1[i]);
}    
}

console.log(unique);


