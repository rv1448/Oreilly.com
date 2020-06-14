const WebSocket = require('ws');

const connection = new WebSocket('ws://stream.meetup.com/2/rsvps')
connection.onopen = function (e) {
    connection.send("My name is John");
};
// connection.onmessage = function (event) {
//    return new Promise(function handler(event) {
//    }).then(handl => console.log(handl.data));
// };
connection.onmessage = function handler(event) {
    console.log(event.data);
}
