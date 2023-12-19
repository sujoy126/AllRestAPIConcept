package com.api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ABC {
	
	  @Test 
	  public void getDt() {
	  
	  RestAssured.given() 
	  .baseUri("https://reqres.in/api/users?page=2")
	  .contentType("p/json")
	  .when().get()
	  .then() 
	  .log().all(); 
	  }
	 

}
