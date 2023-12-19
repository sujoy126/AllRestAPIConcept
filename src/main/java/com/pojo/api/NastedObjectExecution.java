package com.pojo.api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class NastedObjectExecution {
	@Test
	public void mm() {
		NestedObject1 ns1 = new NestedObject1();
		ns1.setAge(23);
		ns1.setId(2);
		ns1.setName("ramesh");
		
		NestedObject2 ns2 = new NestedObject2();
		ns2.setAdress1("QSP");
		ns2.setAdress2("Panjagutta");
		ns2.setAdress3("Hyderabad");
		
		ns1.setAdress(ns2);
		
		RestAssured.given()
		.log().all()
		.contentType("Application/json")
		.body(ns1)
		.when()
		.get();
	}

}
