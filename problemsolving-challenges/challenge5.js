const prompt = require("prompt-sync")();
/*
first we have an array the program create a new array that contain the original array
and the reverse of it
we first create the reverse array then we fusion both of them
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
let tab2 = [...tab1].reverse();

function fusionner(tab1, tab2) {
  let fusion = [];
  for (let i = 0; i < tab1.length; i++) {
    fusion.push(tab1[i]);
  }
  for (let i = 0; i < tab2.length; i++) {
    fusion.push(tab2[i]);
  }
  return fusion;
}
let result = fusionner(tab1, tab2);
console.log(result);