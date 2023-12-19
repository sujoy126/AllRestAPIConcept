package com.api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ABCD {
	@Test
	public void postData() {
		RestAssured.given()
		.baseUri("https://reqres.in/api/")
		.basePath("users")
		.contentType("application/json")
		.body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\",\r\n"
				+ "    \"id\": \"996\",\r\n"
				+ "    \"createdAt\": \"2023-10-21T10:20:02.745Z\"\r\n"
				+ "}")
		
		.when().post()
		.then()
		.statusCode(201)
		.log().all();
		
	}

}
