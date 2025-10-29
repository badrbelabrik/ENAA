const prompt = require("prompt-sync")();


let N = Number(prompt("Entrez le nombre de bouteilles pleines a commencez: "))
let compteur=N;
while(N>=3){
    N = N-3;
    N = N+1;
    compteur += 1;
}

console.log(`${compteur}`);