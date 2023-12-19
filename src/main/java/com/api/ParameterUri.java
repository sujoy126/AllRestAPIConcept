package com.api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ParameterUri {
		@Test( priority = 1)
		public void getData() {
			RestAssured.given()
			.pathParam("endpoint",4 )
			.baseUri("https://reqres.in/api/users?page=")
			.basePath("{endpoint}")
			.when().get()
			.then()
			.log().all();
		}
		
	@Test()
	public void getdata1() {
		RestAssured.given()
		.when().get("https://reqres.in/api/users?page=2")
		.then()
		.log().all();
	}
}
