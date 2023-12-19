package com.pojo.api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ExecutionPojoClass {
	@Test
	public void m1() {
		Pojoclass pc = new Pojoclass();
		pc.setAge(23);
		pc.setId(94);
		pc.setName("subho");
		
		RestAssured.given()
		.log().all()
		.contentType("Application/json")
		.body(pc)
		.when()
		.get();
	}

}
