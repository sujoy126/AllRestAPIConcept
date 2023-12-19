package com.api;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ValidationString {
	@Test
	public void validate() {
		String s = RestAssured.given()
		.when().get("https://restful-booker.herokuapp.com/booking")
		.then()
		.statusCode(200)
		.time(Matchers.greaterThan(2000l))
		.contentType("application/json")
	//	.extract().asString();
		.extract().asPrettyString();
		
		System.out.println(s);
	}

}
