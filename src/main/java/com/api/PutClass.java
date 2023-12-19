package com.api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PutClass {
	@Test
	public void putData() {
		RestAssured.given()
		.baseUri("https://reqres.in/api/users/2")
		.body("\"{\\r\\n\"\r\n"
				+ "				+ \"    \\\"name\\\": \\\"morpheus\\\",\\r\\n\"\r\n"
				+ "				+ \"    \\\"job\\\": \\\"zion resident\\\",\\r\\n\"\r\n"
				+ "				+ \"    \\\"updatedAt\\\": \\\"2023-10-22T13:44:49.786Z\\\"\\r\\n\"\r\n"
				+ "				+ \"}\"")
		.when().put()
		.then()
		.log().all();
	}
	

}
