package com.ron;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.ron.model.Product;


public class App 
{
    public static void main( String[] args )
    {
    	try {

    	//create object mapper
    	ObjectMapper mapper = new ObjectMapper();	
    	
    	Product product = new Product();
    	product = getObjectData(product);
    	
    	String jsonData = mapper.writeValueAsString(product);
    	
    	System.out.println("Java Data---");
    	System.out.println(product);
    	System.out.println("JSON Data---");
    	System.out.println(jsonData);
    	System.out.println("Writting to student.json file");
    	mapper.writeValue(new File("product.json"), product);
    	System.out.println("Done..");
    	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    } 
    
    public static Product getObjectData(Product product)
    {
    	product.setId(10);
    	product.setPname("Fossil");
    	product.setPrice(9999.0);
    	product.setType(new String[] {"chrono","simpleDial","automatic"});
		return product;
    	
    }
}
