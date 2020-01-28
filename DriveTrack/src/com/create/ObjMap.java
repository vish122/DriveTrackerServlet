package com.create;


import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjMap {
	
	private static final ObjectMapper mapper = new ObjectMapper();
	
public static Object getObjectFromJSON(String jsonString, Class<Createdrive> reg) {
		
		Object readValue = null;
		

		try 
		{
			
			readValue = mapper.readValue(jsonString, reg);
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		return readValue;

	}

	public static Object getJSONFromObject(Object object) {
		String jsondata = null;

		try
		{
			jsondata = mapper.writeValueAsString(object);
			System.out.println(jsondata);
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}

		return jsondata;

	}

}

	


