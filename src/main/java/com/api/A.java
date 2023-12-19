package com.api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class A {
	@Test
	public void getData() {
		RequestSpecification rs = RestAssured.given();
		
	//	rs.log().all();
		rs.contentType("application/json");
		rs.baseUri("http://localhost:3000/posts");
		
		Response rp = rs.when().get();
		System.out.println(rp);
		rp.then().log().all();
	}

}
