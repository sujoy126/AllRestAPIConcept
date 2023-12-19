package com.api;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class MultipleHeaderRequest {
	@Test
	public void m1() {
		
		Map<String,String> mp = new HashMap<String, String>();
		mp.put("k1", "v1");
		mp.put("k2", "v2");
		mp.put("k3", "v3");
		mp.put("k4", "v4");
		
	 RestAssured.given()
	 .log().all()
	 .headers(mp)
	 .when()
	 .get();
	 
		
		
		
		
		
	}
	 

}
