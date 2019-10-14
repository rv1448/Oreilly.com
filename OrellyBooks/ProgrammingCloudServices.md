* MIME types
	- How to Interpret Body of the message
	- image/jpg or image/png are format of the data in the body
	- meta information in the headers __content-type__
	- content-type specifies MIME type of the body of the message

* Send data to the server
	- url encoded key value pair `small amounts of data`
	- multipart for sending `large files`

* HTTP response
	- __Status Line__
		- responce code did it find the resource
		- phrase hint to what happened on the server

* Cookies
	- Server sends a small piece of information to client
	- Any future requests to server client puts it in the header

* Building Cloud Services over on HTTP
	- Inserting a video into database and metadata or catalog
	- Sending commands using command line
		- Mobile application
			- HTTP commands to application in cloud
			- PUT command from mobile to insert video
				- using multipart body
				- content-type in the header
			- GET command to fetch or retreive
				- using query params
				- each video has its own URL path
			- HTTP response
				- is it 200
				- was it able to store the video 
				- body can have data/ Text coming back
				- type of the video using content-type
	- query parameters can be done differently

* Protcol Layering & HTTP design methodologies
	- Design choices
	- encode parameters or request parameters
	- webservice : Service built on HTTP
	- Rest: Representational state transfer
	- Rest: Methodologies to build a service on top of HTTP
	- Service built on HTTP that may follow rest Methodologies

* What is REST ?
	- /video/1 access to the video
	- /video/1/duration - access resource in finer and finer granua
	- /video - All video
	- URL addressing that follows hierarchy starting wider
* HTTP polling
	- cient initiates the conversation
	- cant have the server push the data
	- The client at regular intervals to sent request to the server
	- wasting server resources/Network
	- Adaptive polling
* Web sockets - Newer HTTP based protocal
	- once the websocket connection is established
	- client and server can talk continously
	- server can push data when ever is wants
	- connection to drop
	- client has to connect and change it to websocket connection
	- can be heavy weight for the persistent connection

* Push Notification
	- Every andriod client sets up a persistent connection using XMPP
	- After iniitial request devices gets registration ID
	- GCM server acts as a bridge
	- Good when spotty internet connection
	- Only works small amounts of data

* what are servelets ?


```java
protected void doPost(HttpServeletRequest req, HttpServletResponse res){
String name = req.getParameter("name");
String url = req.getParameter("url");

}
```





