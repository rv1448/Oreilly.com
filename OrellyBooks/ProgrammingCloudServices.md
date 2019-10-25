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
	- Every request from browser is routed to one of the servlets in the web container
	- A servelet is a java object 
	- Servlet has methods for Doget DoPost
	- router decides which servelets serve which request using WEB.xml

* Routing and web.xml
	- a request with path and then servlet
	- first part is used declare servlet name and servlet class
	- second part is routing - servlet needs to be loaded for the path
``` xml	
<servlet>
	<servlet-name>video</servlet-name>
	<servlet-name>org.company.VideoServlet</servlet-name>
</servlet>

<servlet-mapping>
	<servlet-name>video</servlet-name>
	<url-pattern>/video</url=pattern>
<servlet-mapping>
```

``` java
public class VideoServlet extends HttpServlet{

	private List<video> = ArrayList<Video>();
	@Override
	protected @void doGet(HttpServletRequest req, HttpServletResponse resp){
	resp.setCOntentType("text/plain");	
	PrinterWriter SendtoClient = resp.getWriter();
	for(Video v: this.videos){
		sendToClient.write(v.getName()+""+v.getUrl()+"\n")
	}
		
	}

	protected void doPost(HttpServeletRequest req, HttpServletResponse res){
	String name = req.getParameter("name");
	String url = req.getParameter("url");
	String durationstr = req.getParameter("duration");
	
	resp.setContentType("text/plain");
	/****
	* Parse the parameters
	*****/
	if(pararmeters are not set ){
	resp.sendError(400);
	resp.getWriter().write("missing [name,duration,url]");
	}
	else {
	video v = new Video(name,url,duration);
	videos.add(v);
	resp.getWriter().write("video added");
	}
	}
}
```

* Java Annotations
	- Method to store a video which is protected method

* HTTP Body to  Data Marshelling
	- Its a way of extracting information from incoming request and building an object
	- Servlet looking at the request and taking key-value pair to build an object
	- Convert key value pair into JSON/XML before sending it back client
	- Data mapping - Building objects from the data

* The Sprig Dispatcher Servlet
	- Request to normal servlet involves extract params from request, validation, construct objs with params and then do work.
	- Instead spring gives dispatcher servlets
	- less data marshelling to extract parameters
	- Dispatcher servlet; It allows to registers one or more controllers
	- Controller can have simple methods update balance
	- Routing from Dispatcher servlet to the controller can be done using either XML or Java annotations
	- before invoking the method it extract the parameter value for the method it needs to execute
	- Automatic data marshelling
* Intro to spring controller
	- Are simple objects

* Spring controller Walk Through
	- Servlet container
	- Java Object @controller
``` java
@controller
public class VideoSvc implements VideoSvcApi{
	private List<Video> videos = new ArrayList<Video>();
	
	@RequestMapping(value=VIDEO_SVC_PATH, method=RequestMethod.POST)
	public @RequestBody boolean addVideo(RequestBody video v){
		return videos.add(v)
		}
}

@configuration
expressing configuration data in a class for
@EnableWebMvc
Dispatcher servlet
@Componentscan
@EnableAutoConfiguration


```
	

* Request param
	- @RequestMapping to have dispatcher servlet 
	- @RequestParam that can be attached individual parameters

* Request path
	- /search/a path itself 
	- @requestmapping("/search/{str}")
	- HTTP message converter will take request params and using
	@requestbody annotation initiate an object

* Handling multipart data
	- videoservicecontroller
	- new method returns boolean upload video
	- raw data marked as @RequestParam can handle multipart file uplad
	the type of the data is marked as multipartfile
	- Stream it from client to disk and memory is skipped
	- get inputstream from the file defined in the method signature
* Generating responses
	-@Responsebody
* JSON object marshelling
	- Spring open source library to convert json to object and viceversa

* Spring Boot architechture
	- we create series of controller objects that have various methods invoked webcontainer 
	- so we create webcontainer with dispatcher servlet that spring provides to route request to respective controller
	- Custom Setup
		-web container needs to have routing information web.xml
		-dispatcher servlet uses annotations to route request to various containers
		-web container needs to be setup usally tomcat
		-Spring boot can be configured appropriately using application.java
			- Define controllers autodiscovery
			- this application as main method and initiate spring boot application using springboot.run(application.java)
		- Setup the container embedded, discover controllers, dispatcher servlet, 



