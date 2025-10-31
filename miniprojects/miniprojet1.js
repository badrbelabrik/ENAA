const prompt = require("prompt-sync")();

const taxis = [
{ id: 1, position: 5, available: true, timeRemaining: 0, totalRides:
0 },
{ id: 2, position: 12, available: false, timeRemaining: 0,
totalRides: 0 },
{ id: 3, position: 20, available: false, timeRemaining: 0,
totalRides: 0 }
]
;

const requests = [
{ reqId: 1, position: 10, duration: 3, time: 0 },
{ reqId: 2, position: 3, duration: 4, time: 1 },
{ reqId: 3, position: 18, duration: 2, time: 2 },
{ reqId: 4, position: 7, duration: 5, time: 3 }
];

const waitingqueue = [];

function createreq(){
    const position = Number(prompt("Enter your position :"))
    const destination = Number(prompt("Enter your destination :"))
    const duration = Number(prompt("Enter the duration :"))
    let request = {
        reqId: requests.length + 1,
        position: position,
        destination: destination,
        duration: duration,
        time: 0,
    }
    requests.push(request);
    console.log("Request added succesfully!");
    return request;
}


function findtaxi(request){
    // checking for available taxi
    let mindistance = Infinity;
    let closetaxi;
        for(let i=0; i<taxis.length; i++){
            
            if(taxis[i].available){
                let distance = Math.abs(taxis[i].position - request.position)
                if(distance<mindistance){
                    mindistance = distance;
                    closetaxi = taxis[i];
                }
            }
        } 
        if(!closetaxi){
            console.log("There is no available taxi, your request will be in waiting queue")
            waitingqueue.push(request);
            return null;
            }
    console.log(`the request ${request.reqId} has been assigned to taxi ${closetaxi.id}`)

    closetaxi.available = false;
    closetaxi.timeRemaining = request.duration;
    closetaxi.destination = request.destination;
    closetaxi.totalRides++;
    return mindistance;
}

function timesimulation(){
    let timer = 0;
    while(waitingqueue.length > 0 || taxis.some(item => item.timeRemaining > 0)){
         console.log(`Minute :${timer}`)
         
         requests.forEach(item => {
            if(item.time === timer){
            findtaxi(item);
            }
            });

        if(waitingqueue > 0 && taxis.some(item => item.available = true)){
            let first = waitingqueue.shift();
            findtaxi(first);
        }

         taxis.forEach(item => {
         if (item.timeRemaining > 0) {
            console.log(`-> Taxi ${item.id} assigned (distance : )`) 
            item.timeRemaining--;
            if(item.timeRemaining == 0){
                item.available = true;
                item.position = item.destination;
                delete item.destination;
            }
            }
    });
    timer++;
    }
}


timesimulation();
