package com.api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteClass {
	@Test
	public void deleteData() {
		RestAssured.given()
		.contentType("application/json")
		.baseUri("https://reqres.in/api/users/2")
		.body("{\"data\":{\"id\":2,\"email\":\"janet.weaver@reqres.in\",\"first_name\":\"Janet\",\"last_name\":\"Weaver\",\"avatar\":\"https://reqres.in/img/faces/2-image.jpg\"},\"support\":{\"url\":\"https://reqres.in/#support-heading\",\"text\":\"To keep ReqRes free, contributions towards server costs are appreciated!\"}}")
		.when().delete()
		.then()
		.log().all();
	}

}
