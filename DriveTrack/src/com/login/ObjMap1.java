package com.login;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjMap1 {
	
	private static final ObjectMapper mapper = new ObjectMapper();
	
	public static Object getObjectFromJSON(String JsonString, Class<LoginBean> login) throws JsonParseException, JsonMappingException, IOException
	{
		Object readValue = mapper.readValue(JsonString, login);
			System.out.println("readValue"+readValue);
		return readValue;
	}
	
	
	
	public static Object getJSONFromObject(Object object) throws JsonProcessingException 
	{
		String jsondata = mapper.writeValueAsString(object);
			System.out.println("jsondata="+jsondata);

		return jsondata;
	}
}
