package NEWMaven.NewMaven;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC004_Get_ValidationJSONREsponse {
	@Test
	void getweatherDetails() {
		//specify base URI
		RestAssured.baseURI ="http://restapi.demoqa.com/utilities/weather/city";
		//RequestObject
		RequestSpecification httprequest = RestAssured.given();
		//response object need to be created
		Response response = httprequest.request(Method.GET,"/Fremont");
		//print response in console window
		String responseBody = response.getBody().asString();
		System.out.println("Response body is :" + responseBody);
		//print response body
		System.out.println(responseBody);
		//Capture details of header from response
		String contentType = response.header("Content-type");
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
