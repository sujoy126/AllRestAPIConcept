package com.pojo.api;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class EcecutionMultipeObject {
	@Test
	public void m2() {
		MultipleObjectInsideArray moi1 = new MultipleObjectInsideArray();
		moi1.setAge(22);
		moi1.setId(2);
		moi1.setName("Anil");
		
		MultipleObjectInsideArray moi2 = new MultipleObjectInsideArray();
		moi2.setAge(24);
		moi2.setName("Abhilash");
		moi2.setId(3);
		
		List<Object> l = new ArrayList<Object>();
		l.add(moi2);
		l.add(moi1);
		
		RestAssured.given()
		.log().all()
		.contentType("Application/json")
		.body(l)
		.when()
		.get();
	}
	

}
