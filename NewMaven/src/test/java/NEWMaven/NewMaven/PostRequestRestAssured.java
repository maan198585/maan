package NEWMaven.NewMaven;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequestRestAssured {
	@Test
	void RegistrationSucessful() {
		//specify base URI
		RestAssured.baseURI ="http://restapi.demoqa.com/customer";
		RequestSpecification httprequest = RestAssured.given();
		//these are all request payload sendinf along with post request 
		JSONObject requestParams = new JSONObject();
		
		requestParams.put("FirstName", "Karamjit2223");
		requestParams.put("LastName", "Maan1213");
		requestParams.put("UserName", "Agama2221442");
		requestParams.put("Password", "Agama13323");
		requestParams.put("Email", "Karamjit31@gmail.com");
		httprequest.header("content- Type","application/json");
		httprequest.body(requestParams.toJSONString());
		
		//now send the request
		Response response = httprequest.request(Method.POST,"/register");
		
		//print response in console window
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is :" + responseBody);
		//how to capture the status code? for post the sucess id 201
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		AssertJUnit.assertEquals(statusCode, 201);
		
}
}
