const { createServer } = require('node:http');
const path = require('path'); // Required for path manipulation
const hostname = '127.0.0.1';
const port = 3000;


const express = require('express');
const app = express();
app.set('view engine', 'ejs'); // Set EJS as the templating engine
// Middleware to parse URL-encoded data (from HTML forms)
app.use(express.urlencoded({ extended: true })); 
// Middleware to parse JSON data (if you also send JSON)
app.use(express.json());
// Serve static files from the 'public' directory
//app.use(express.static(path.join(__dirname, 'public')));
app.post('/submit-newreq', (req, res) => {
    const username = req.body.username;
    const password = req.body.password;

    console.log('Received form data:');
    console.log('Username:', username);
    console.log('Password:', password);

    res.send("Thank you for submitting, ${username}!");
});
app.get('/', (req, res) => {
    //res.sendFile(path.join(__dirname, 'public', 'page.html'));
    // res.send('Welcome to the homepage!');
    const userData = {

            name: 'John Doe',
            email: 'john.doe@example.com'
        };
        res.render('page', { user: userData }); // Render 'index.ejs' and pass 'userData'
    });
app.get('/badr', (req, res) => {
    console.log("test !!!");   
    const data = {
    message: 'Hello from Node.js!',
    timestamp: new Date().toISOString()
  };
  res.json(data); // Send JSON response   
    });

app.listen(port, () => {
        console.log("Server listening at http://localhost:${port}");
    });





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