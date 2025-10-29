const prompt = require("prompt-sync")();

const tab =  [1, 1, 0, 1, 0];
let index;
for(let i=0; i<tab.length; i++){
    if(tab[i] == 0){
        index = i;
        break;
    }
}
console.log(`La premier place libre est: ${index+1}`)