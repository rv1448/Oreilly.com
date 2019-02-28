package com.scala.primer;
import java.net.*;
import java.io.*;


public class Stream {

    public static void main(String[] args)  throws IOException{


        URL url = new URL("https://stream.meetup.com/2/rsvps");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                conn.getInputStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);



    }
}
