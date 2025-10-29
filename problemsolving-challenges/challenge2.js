const prompt = require("prompt-sync")();

/* we take a number N
we check if N % 3 == 0 we display "Tech"
else if N % 5 == 0 we display "Lead"
else if N % 3 == 0 and N % 5 == 0 we display "TechLead"
if no conditions of the above is true we display the number itself
*/


let N = Number(prompt("Entrez le nombre :"));

if (N % 3 == 0){
    console.log("Tech");
} else if (N % 5 == 0){
    console.log("Lead");
} else if ( N%3==0 && N%5==0){
    console.log("TechLead");
} else {console.log(`${N}`);}