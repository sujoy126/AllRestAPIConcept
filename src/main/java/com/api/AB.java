package com.api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class AB {
	@Test
	public void getData() {
	// Request Section
		RequestSpecification res = RestAssured.given();
		res.contentType("application/json");
		res.baseUri("https://reqres.in/api/users?page=2");
		
	// Response Section
		Response rs = res.when().get();
		
	//validation section
		ValidatableResponse vr = rs.then();
		
	// It will print all Header	
		vr.log().headers();
	
	// it will print all body
		vr.log().body();
		
	// it will print 
		vr.log().all();
		
	}

}
