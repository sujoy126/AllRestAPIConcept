package com.api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class ValidationOfBody {
	/***
	 * {
         "id":10,
         "class": "six"
       }
	 */
	
	@Test
	public void m1() {
		String str = "{\r\n"
				+ "  \"id\":10,\r\n"
				+ "  \"class\": \"six\"\r\n"
				+ "}";
		
		JsonPath jp = new JsonPath(str);
		
		int i = jp.get("id");
		String st = jp.get("class");
		System.out.println(st);
		System.out.println(i);	
		
	}
	
	
	
	
	
	
	
	

}
