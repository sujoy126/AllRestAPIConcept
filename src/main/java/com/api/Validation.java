package com.api;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Validation {
	@Test
	public void valid_Status_Time() {
		RestAssured.given()
		.when().get("https://restful-booker.herokuapp.com/booking")
		.then()
		.statusCode(200)
		.time(Matchers.lessThan(3000l))
		.contentType("application/json")
		.log().all();
	}

}
