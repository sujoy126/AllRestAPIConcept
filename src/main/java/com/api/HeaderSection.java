package com.api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class HeaderSection {
	@Test
	public void m1() {
		RestAssured.given()
		.log().all()
	    .header("star","world")
	    .contentType("Application/json")
	    .when()
	    .get()
	    ;
	}

}
