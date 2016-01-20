package test.com.webservices;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.DefaultHttpClient;
import org.junit.Before;
import org.junit.Test;


/*This Test requires the Mock webservice to run at port 8089 in soap ui , the service url is as 
http://localhost:8089/maps/api/geocode/json
Need to start the mock service in soap ui to pass the test
*/
public class WebServiceTest1 {

	HttpClient client ;
	String uri = "";
	@Before
	public void setUp(){
		 uri = "http://localhost:8089/maps/api/geocode/json";
		client = new DefaultHttpClient();
			
	}
	
		@Test
		public void testService(){
			try {
				HttpGet request = new HttpGet(uri);
				HttpResponse response = client.execute(request);
				
				BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
				String line = "";
				System.out.println("Printing Response here: ");
				while((line = br.readLine())!=null){
					System.out.println(line);
				}

	}catch(IOException ioe){
		ioe.getStackTrace();
	}

		}
			
		
			//creating response 
			
	}

