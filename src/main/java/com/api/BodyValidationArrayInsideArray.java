package com.api;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class BodyValidationArrayInsideArray {
	/**
	 * [
 ["10",
"20",
"30",
"40",
"50"
 ],
 ["60",
"70",
"80",
"90",
"100"
   ]
]
	 */
	
	@Test
	public void mb() {
		
		String s = "[\r\n"
				+ " [\"10\",\r\n"
				+ "\"20\",\r\n"
				+ "\"30\",\r\n"
				+ "\"40\",\r\n"
				+ "\"50\"\r\n"
				+ " ],\r\n"
				+ " [\"60\",\r\n"
				+ "\"70\",\r\n"
				+ "\"80\",\r\n"
				+ "\"90\",\r\n"
				+ "\"100\"\r\n"
				+ "   ]\r\n"
				+ "]";
		
		JsonPath js = new JsonPath(s);
		List<Object> l = js.getList("$");
		System.out.println(l.size());
		
		Object obj = js.get("[1][4]");
		Assert.assertEquals(obj, "100");
		System.out.println(obj);
		
		List<Object> l2 = (List<Object>) js.getList("$").get(0);
		System.out.println(l2.size());
		
		
		
		
	}

}
