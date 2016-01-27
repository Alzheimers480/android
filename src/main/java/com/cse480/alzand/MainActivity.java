package com.cse480.alzand;

import android.app.Activity;
import android.os.Bundle;
//import org.apache.http.client.*;
//import org.apache.http.*;
import java.net.*;
import android.widget.*;
import java.io.*;
import java.util.*;

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
		InputStream response = httpClient.getInputStream();
		String inputStreamString = new Scanner(response,"UTF-8").useDelimiter("\\A").next();
		TextView outputTextView = (TextView)findViewById(R.id.myoutput);
		outputTextView.setText(inputStreamString);
	    }
	catch(Exception ex)
	    {
	    }
	
    }
}
