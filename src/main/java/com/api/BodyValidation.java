package com.api;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class BodyValidation {
	/***
	 * {
  "Name": "Abhishek sir",
  "Trainer":"Automation Testing",
  "Adress": {
    "city": "hyd",
    "pin code": 500003,
    "state": "Telengana"
  },
  "sal": "20 lpa"
}
	 */
	@Test
	public void m1() {

		String str = "{\r\n"
				+ "  \"Name\": \"Abhishek sir\",\r\n"
				+ "  \"Trainer\":\"Automation Testing\",\r\n"
				+ "  \"Adress\": {\r\n"
				+ "    \"city\": \"hyd\",\r\n"
				+ "    \"pin code\": 500003,\r\n"
				+ "    \"state\": \"Telengana\"\r\n"
				+ "  },\r\n"
				+ "  \"sal\": \"20 lpa\"\r\n"
				+ "}";
		
		JsonPath js = new JsonPath(str);
		
		Object obj = js.get("Trainer");
		System.out.println(obj.toString());	
		Assert.assertEquals(obj, "Automation Testing");
		
		 String sp = js.getString("Adress.state");
		 Assert.assertEquals(sp, "Telengana");
		 System.out.println(sp);
	}
	
	
	
	

}
