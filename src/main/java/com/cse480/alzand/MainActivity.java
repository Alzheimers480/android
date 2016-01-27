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
		String urlParameters = "USERNAME=switch201&PASSWORD=passwor";
		URL website = new URL("http://www.secs.oakland.edu/~scnolton/auth.php");
		httpClient = (HttpURLConnection) website.openConnection();

		httpClient.setDoOutput(true);
		httpClient.setRequestProperty("Accept-Charset", "UTF-8");
		httpClient.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
		try {
		    OutputStream output = httpClient.getOutputStream();
			output.write(urlParameters.getBytes("UTF-8"));
		    }
		catch(Exception ex){}
		
		InputStream response = httpClient.getInputStream();
		//converts InputStream -> String
		String inputStreamString = new Scanner(response,"UTF-8").useDelimiter("\\A").next();
		TextView outputTextView = (TextView)findViewById(R.id.myoutput);
		outputTextView.setText(inputStreamString);
	    }
	catch(Exception ex){}
	
    }
}

//byte[] postData = urlParameters.getBytes( StandardCharsets.UTF_8 );
		//int postDataLength = postData.length;
