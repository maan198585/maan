package NEWMaven.NewMaven;


import org.json.simple.JSONObject;
import org.testng.asserts.*;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import org.apache.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC003_GetRequest {
	@Test
	void googleMapTest() {
		//specify base URI
				RestAssured.baseURI ="http://map.googleapis.com";
				//Request Object
				RequestSpecification httprequest = RestAssured.given();
				//response object need to be created
				Response response = httprequest.request(Method.POST,",maps/search/restaurent+near+me/@34.0843967,-118.0537364,15z/data=!3m1!4b1");
				//map/search/restaurant/@37.2886499,-121.8742445,14z/data=!3m1!4b1
				//print response in console window
				String responseBody = response.getBody().asString();
				System.out.println("Response body is :" + responseBody);
				//print response body
				System.out.println(responseBody);
				//capture details of header from response
				String contentType =response.header("Content-Type");
				//capture content type from headers
				System.out.println("Content Type is :"+ contentType);
						//Assert
						//content encoding
						String contentEncoding =response.header("Content-Encoding");
				//capture content type from headers
				System.out.println("Content encoding Type is :" +contentEncoding);
				//Assert
				//display all headers in the response
				Headers allHeaders =response.headers();
				
				for(io.restassured.http.Header header: allHeaders) {
					System.out.println(header.getName()+"    ----->" + header.getValue());
				}
				
						
	}

}
