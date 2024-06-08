package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class MultiopleBodyValidate {/**
	 * [
	  {
	    "id":"star",
	    "data":"boolean",
	    "sub":
	    [
	      {
	        "math": 98,   //   [0].sub[0].math
	        "phy":80
	      },
	      {
	        "camy": 78,
	        "eng": 68,    //[0].sub[1].eng
	        "bng": 88
	      }
	      ]
	  },
	  {
	    "id":"star",
	    "data":"boolean",
	    "sub":"java"
	  }
	]
		 */
	@Test
	public void m1() {

		String expectedResponce = "{\r\n"
				+ "  \"Name\": \"Abhishek sir\",\r\n"
				+ "  \"Trainer\":\"Automation Testing\",\r\n"
				+ "  \"Adress\": {\r\n"
				+ "    \"city\": \"hyd\",\r\n"
				+ "    \"pin code\": 500003,\r\n"
				+ "    \"state\": \"Telengana\"\r\n"
				+ "  },\r\n"
				+ "  \"sal\": \"20 lpa\"\r\n"
				+ "}";
		
		JsonPath js = new JsonPath(expectedResponce);
		
		RestAssured.given()
		.when()
		.then()
		.body(Matchers.equalTo("[\r\n"
				+ "	  {\r\n"
				+ "	    \"id\":\"star\",\r\n"
				+ "	    \"data\":\"boolean\",\r\n"
				+ "	    \"sub\":\r\n"
				+ "	    [\r\n"
				+ "	      {\r\n"
				+ "	        \"math\": 98,   //   [0].sub[0].math\r\n"
				+ "	        \"phy\":80\r\n"
				+ "	      },\r\n"
				+ "	      {\r\n"
				+ "	        \"camy\": 78,\r\n"
				+ "	        \"eng\": 68,    //[0].sub[1].eng\r\n"
				+ "	        \"bng\": 88\r\n"
				+ "	      }\r\n"
				+ "	      ]\r\n"
				+ "	  },\r\n"
				+ "	  {\r\n"
				+ "	    \"id\":\"star\",\r\n"
				+ "	    \"data\":\"boolean\",\r\n"
				+ "	    \"sub\":\"java\"\r\n"
				+ "	  }\r\n"
				+ "	]\r\n"
				+ "	"));
		
System.out.println("eqal");
        
                
        }
		 }

