const WebSocket = require('ws');

const connection = new WebSocket('ws://stream.meetup.com/2/rsvps')
connection.onopen = function (e) {
    connection.send("My name is John");
};
connection.onmessage = function (event) {
    console.log(event.data)
};
