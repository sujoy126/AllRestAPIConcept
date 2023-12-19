package com.api;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class BodyVerification {
	/**
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
	
	String s = "[\r\n"
			+ "  {\r\n"
			+ "    \"id\":\"star\",\r\n"
			+ "    \"data\":\"boolean\",\r\n"
			+ "    \"sub\":\r\n"
			+ "    [\r\n"
			+ "      {\r\n"
			+ "        \"math\": 98,\r\n"
			+ "        \"phy\":80\r\n"
			+ "      },\r\n"
			+ "      {\r\n"
			+ "        \"camy\": 78,\r\n"
			+ "        \"eng\": 68,\r\n"
			+ "        \"bng\": 88\r\n"
			+ "      }\r\n"
			+ "      ]\r\n"
			+ "  },\r\n"
			+ "  {\r\n"
			+ "    \"id\":\"star\",\r\n"
			+ "    \"data\":\"boolean\",\r\n"
			+ "    \"sub\":\"java\"\r\n"
			+ "  }\r\n"
			+ "]";
	
	@Test
	public void m1() {
		
		JsonPath js = new JsonPath(s);
		
		Object obj = js.get("[1].id");
		System.out.println(obj);
		Assert.assertEquals(obj, "star");
		
		Object sp = js.getString("[0].sub[1].eng");
		System.out.println(sp);
		Assert.assertEquals(sp, "68");
		
		Object ss = js.get("[0].sub[0].math");
		System.out.println(ss);
		Assert.assertEquals(ss, "98");
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
