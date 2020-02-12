package NEWMaven.NewMaven;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TC001_GetRequest {
	
	@Test
	void getweatherDetails() {
		//specify base URI
		RestAssured.baseURI ="http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httprequest = RestAssured.given();
		//response object need to be created
		Response response = httprequest.request(Method.GET,"/Hyderabad");
		//print response in console window
		String responseBody = response.getBody().asString();
		System.out.println("Response body is :" + responseBody);
		//how to capture the status code?
		int statusCode =response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200);
		//status line
		String statusline = response.getStatusLine();
		System.out.println(statusline);
		//Assert
		Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
	}

}
