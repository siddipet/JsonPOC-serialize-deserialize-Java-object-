package com.sreenutech.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sreenutech.Customer;

public class JsonDeserialize {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper mapper=new ObjectMapper();
		Customer jsonData = mapper.readValue(new File("E:\\CODH-Project-Code\\JsonPOC\\src\\main\\resources\\customer.json"), Customer.class);
		
		System.out.println("JSON data is:"+jsonData);

	}

}
