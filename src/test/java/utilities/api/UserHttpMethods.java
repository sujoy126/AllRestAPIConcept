package utilities.api;

import body.api.UserModule;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import routes.api.EndPoints;

public class UserHttpMethods {
	
	// To create user module
	
	public void createUser(UserModule um) {
		Response res = RestAssured.given()
		.contentType("Application/json")
		.accept("Application/json")
		.body(um)
		.when()
		.get(EndPoints.userCreate);
		 
	}
	

}
