package NEWMaven.NewMaven;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC005_ExtractEachValueNode {
	@Test
	void googleMapTest() {
		//specify base URI
				RestAssured.baseURI ="http://restapi.demoqa.com/utilities/weather/city";
				//Request Object
				RequestSpecification httprequest = RestAssured.given();
				//response object need to be created
				Response response = httprequest.request(Method.GET,"/Fremont");
				
				try {
					Thread.sleep(5000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				//Assert
				//Validate all the nodes
				JsonPath jsonpath =response.jsonPath();
				System.out.println(jsonpath.get("Temperature"));
				System.out.println(jsonpath.get("Humidity"));
				System.out.println(jsonpath.get("WeatherDescription"));
				System.out.println(jsonpath.get("WindSpeed"));
				System.out.println(jsonpath.get("WindDirectionDegree"));
				}
				}


