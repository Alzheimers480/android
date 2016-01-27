package com.cse480.alzand;

import android.app.Activity;
import android.os.Bundle;
//import org.apache.http.client.*;
//import org.apache.http.*;
import java.net.*;

public class MainActivity extends Activity
{
    //private HttpClient httpclient;
    private HttpURLConnection httpClient;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
	try
	    {
		URL url = new URL("http://www.google.com/");
		URL website = new URL("http://www.google.com");
		httpClient = (HttpURLConnection) website.openConnection();
		httpClient.getResponseMessage();
	    }
	catch(Exception ex)
	    {
	    }
	
    }
}
