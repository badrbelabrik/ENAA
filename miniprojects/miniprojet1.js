const prompt = require("prompt-sync")();

const taxis = [
{ id: 1, position: 5, available: true, timeRemaining: 0, totalRides:
0 },
{ id: 2, position: 12, available: true, timeRemaining: 0,
totalRides: 0 },
{ id: 3, position: 20, available: true, timeRemaining: 0,
totalRides: 0 }
]
;

const requests = [
{ reqId: 1, position: 10, duration: 3, time: 0, destination: 13},
{ reqId: 2, position: 3, duration: 4, time: 1, destination: 19 },
{ reqId: 3, position: 18, duration: 2, time: 2, destination: 20 },
{ reqId: 4, position: 7, duration: 5, time: 3, destination: 4 }
];

const completedreq = [];
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

            if(closetaxi){
            closetaxi.available = false;
            closetaxi.timeRemaining = request.duration;
            closetaxi.destination = request.destination;
            closetaxi.currentreq = request.reqId;
            closetaxi.reqposition = request.position;
            closetaxi.distance = mindistance;
            completedreq.push(request);
            console.log(`the request ${request.reqId} has been assigned to taxi ${closetaxi.id}`)
        }
        else if(!closetaxi){
            console.log(`No taxi available for request ${request.reqId}, waiting...`);
            waitingqueue.push(request);
            return;
            }
       
        
        

    const index = requests.indexOf(request);
    if (index > -1) requests.splice(index, 1);
    
}

function timesimulation(){
    let timer = 0;
    while( requests.length > 0  || waitingqueue.length > 0 || taxis.some(item => item.timeRemaining > 0)){
         console.log(`Minute :${timer}`)
         
         for (let i = requests.length - 1; i >= 0; i--) {
            let item = requests[i];
            if(item.time === timer){
            findtaxi(item);
            }
            }

        while(waitingqueue.length > 0 && taxis.some(item => item.available)){
            const req = waitingqueue.shift();
            findtaxi(req);
            }

         taxis.forEach(item => {
         if (item.timeRemaining > 0) {
            console.log(`Request ${item.currentreq} at position ${item.reqposition} -> Taxi ${item.id} assigned  : (distance: ${item.distance})`) 
            item.timeRemaining--;
            if(item.timeRemaining == 0){
                item.available = true;
                item.position = item.destination;
                item.totalRides++;
                delete item.destination;
                delete item.currentreq;
                delete item.reqposition;
                delete item.distance;
            }
            }
    });
    timer++;
    }
}

// let request = createreq();
timesimulation();

