package api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;

public class HotelApiTest extends ApiBase{

	public String getSampleHotelName() {
		
		setup();
		Response response = given().when().get("/posts");
		
		response.then().statusCode(200);
		
		String hotelName = response.jsonPath().getString("[0].title");
		
		System.out.println("API Hotel Name: " + hotelName);
		
		System.out.println("Thread ID: " + Thread.currentThread().getId());
		
		return hotelName;
		
		
	}
}
