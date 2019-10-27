# Data Streaming architechture

Collection Tier
	- Collect data from producer
	- Send data into Message queue before sending to analysis tier
	- Consumer messages from __ws://stream.meetup.com/2/rsvps__
Analysis
	- In memory database or cache
Technologies
	- Spring boot - collection - netty Grizzly
	- Spark - analysis - samza, Strom, Flink
	- Spring boot - reactive frame work - RXjava, Datamill

* Deployment of Collection message Quueing tier
	- Collection is between streaming source and message queuing
	- Collection tier is needed to bring data into our pipeline
	- Spring boot using spring websocket
	- Send the data into message queue tier
	- Collection
		- Request Response Pattern
			- USed to browse internet
			- Wait for the response
			- Synchronous pattern
		- Client Async
			- Collection api can do other things while it expects a response
			- Netty play  node.js
		- Full Async
			- Both collection and streaming both ASYNC
* Protocal

* websocket is a protocal for bidirectional communications over HTTP
	- The initial handshake is done using HTTP
	- Then communication is followed on TCP
	- WebSocketClient	
