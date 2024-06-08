package com.api;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class FetchDataOneByOne {
	/**
	 * [
  {
    "firstname": "mukesh",
    "lastmane": "kumar",
    "age": "23",
    "adress": [
      {
        "city": "kolkata",
        "state": "india"
      },
      {
        "city": "patna",
        "state" :"bihar"
      }
      ]
  },
  {
    "firstname": "rahul",
    "lastmane": "yadav",
    "age": "23",
    "adress": [
      {
        "city": "bengalore",
        "state": "karnata"
      },
      {
        "city": "tawang",
        "state" :"arunachal"
      }
      ]
  },
  {
    "firstname": "jaspreet",
    "lastmane": "bumra",
    "age": "31",
    "adress": [
      {
        "city": "mumbai",
        "state": "karnataka"
      },
      {
        "city": "hyd",
        "state" :"telengana"
      }
      ]
  }
  ]
	 */
	@Test
	public void m3() {
		String s = "[\r\n"
				+ "  {\r\n"
				+ "    \"firstname\": \"mukesh\",\r\n"
				+ "    \"lastmane\": \"kumar\",\r\n"
				+ "    \"age\": \"23\",\r\n"
				+ "    \"adress\": [\r\n"
				+ "      {\r\n"
				+ "        \"city\": \"kolkata\",\r\n"
				+ "        \"state\": \"india\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"city\": \"patna\",\r\n"
				+ "        \"state\" :\"bihar\"\r\n"
				+ "      }\r\n"
				+ "      ]\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "    \"firstname\": \"rahul\",\r\n"
				+ "    \"lastmane\": \"yadav\",\r\n"
				+ "    \"age\": \"23\",\r\n"
				+ "    \"adress\": [\r\n"
				+ "      {\r\n"
				+ "        \"city\": \"bengalore\",\r\n"
				+ "        \"state\": \"karnata\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"city\": \"tawang\",\r\n"
				+ "        \"state\" :\"arunachal\"\r\n"
				+ "      }\r\n"
				+ "      ]\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "    \"firstname\": \"jaspreet\",\r\n"
				+ "    \"lastmane\": \"bumra\",\r\n"
				+ "    \"age\": \"31\",\r\n"
				+ "    \"adress\": [\r\n"
				+ "      {\r\n"
				+ "        \"city\": \"mumbai\",\r\n"
				+ "        \"state\": \"karnataka\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"city\": \"hyd\",\r\n"
				+ "        \"state\" :\"telengana\"\r\n"
				+ "      }\r\n"
				+ "      ]\r\n"
				+ "  }\r\n"
				+ "  ]";
		
		
		JsonPath js = new JsonPath(s);
		
		List<String> l = js.getList("firstname");
		for(String o : l) {
			System.out.println(o);
		}
		
		for(int i=0; i<l.size(); i++) {
			List<Object> l2 = js.getList("adress["+i+"].city");
			for(Object sp : l2) {
				System.out.println(sp.toString());
			}
		
		}	
		
		
	}

}
