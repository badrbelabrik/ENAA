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
{ reqId: 2, position: 3, duration: 4, time: 2 },
{ reqId: 3, position: 18, duration: 2, time: 4 },
{ reqId: 4, position: 7, duration: 5, time: 5 }
];

const waitingqueue = [];

function createreq(){
    const position = Number(prompt("Enter your position :"))
    const duration = Number(prompt("Enter the duration :"))
    let request = {
        reqId: requests.length + 1,
        position: position,
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
            return;
            }
    console.log(`the request ${request.reqId} has been assigned to taxi ${closetaxi.id}`)

    closetaxi.available = false;
    closetaxi.timeRemaining = request.duration;


}

let request1 = createreq();
findtaxi(request1);
console.log(taxis);
