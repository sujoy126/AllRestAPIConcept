package com.api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PatchClass {
	@Test
	public void patchData() {
		RestAssured.given()
		.contentType("application/json")
		.baseUri("https://reqres.in/api/users/2")
		.body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}")
		.when().patch()
		.then()
		.log().all();
	}

}
