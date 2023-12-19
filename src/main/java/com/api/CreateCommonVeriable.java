package com.api;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class CreateCommonVeriable {
	RequestSpecification rqs = RestAssured.given()
            .log().all()
            .contentType("application/json");
ResponseSpecification rps = RestAssured.expect()
             .statusCode(200)
             .time(Matchers.lessThan(3000l))
              .log().all();
	
	
	@Test
	public void m1() {

		
		RestAssured.given().spec(rqs)
		.when()
		.get("https://restful-booker.herokuapp.com/booking")
		.then().spec(rps);
		
	}
	@Test
	public void m2() {
		RestAssured.given().spec(rqs)
		.when()
		.get("https://restful-booker.herokuapp.com/booking/1")
		.then().spec(rps);
		
		
	}

}
