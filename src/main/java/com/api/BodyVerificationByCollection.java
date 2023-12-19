package com.api;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;



public class BodyVerificationByCollection {
	/**
	 * ["10",
        "20",
        "30",
        "40",
        "50"
       ]
	 */

	@Test
	public void mt() {
		String s = "[\"10\",\r\n"
				+ "\"20\",\r\n"
				+ "\"30\",\r\n"
				+ "\"40\",\r\n"
				+ "\"50\"\r\n"
				+ "]";
		
		JsonPath js = new JsonPath(s);
		List<Object> l = js.getList("$");
		System.out.println(l.size());
		
		Object j = js.get("[4]");
		Assert.assertEquals(j, "50");
		System.out.println(j);
		
	}
	
}
