const prompt = require("prompt-sync")();

/*
for every bottle drinked you get a full one the objectif of the program is to calculate how 
many bottle you can get for the initial number of bottle you get in the beginning
so first we get N of the initial number of bottle from the user
then in a while loop we calculate : N = N-3; N = N+1; with a counter that increment by 1 for every
irretation the loop stop when the condition N>=3 is achieved
then we display the value of the counter
*/

let N = Number(prompt("Entrez le nombre de bouteilles pleines a commencez: "))
let compteur=N;
while(N>=3){
    N = N-3;
    N = N+1;
    compteur += 1;
}

console.log(`${compteur}`);