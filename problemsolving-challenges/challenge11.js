const prompt = require("prompt-sync")();

const tab =  [1, 2, 3, 4, 6];
let missing;
for (let i=0; i<tab.length; i++){
    if(tab[i+1]-tab[i]>1){
        missing = tab[i]+1;
        break;
    }
}

console.log(`Le nombre absent est : ${missing}`)