package com.pojo.api;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ArrayInsideObjectExecution {
	@Test
	public void main() {
		ArrayInsideObject1 aio = new ArrayInsideObject1();
		aio.setName("abhijit");
		aio.setAge(23);
		aio.setId(2);
		
		ArrayInsideObject2 aio2 = new ArrayInsideObject2();
		aio2.setLocation1("Kolkata");
		aio2.setLocation2("Hyderabad");
		aio2.setLocation3("Bengalore");
		
		ArrayInsideObject2 aio3 = new ArrayInsideObject2();
		aio3.setLocation1("pune");
		aio3.setLocation2("mumbai");
		aio3.setLocation3("delhi");
		
		List<ArrayInsideObject2> l = new ArrayList<ArrayInsideObject2>();
		l.add(aio2);
		l.add(aio3);
		
		aio.setCity(l);
		
		RestAssured.given()
		.log().all()
		.contentType("Application/json")
		.body(aio)
		.when()
		.get();
	}

}
