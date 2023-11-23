package com.ron;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ron.model.Customer;
import com.ron.model.Employee;
import com.ron.model.Student;

public class App 
{
    public static void main( String[] args )
    {
    	try {
    	//create object mapper
    	ObjectMapper mapper = new ObjectMapper();
    	
    	//using the object read data from json file and convert to pojo
    	
			Customer customer =  mapper.readValue(new File("data/sample-lite.json"), Customer.class);
			System.out.println(customer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    	try {
    	//create object mapper
    	ObjectMapper mapper = new ObjectMapper();
    	
    	//using the object read data from json file and convert to pojo
    	
			Employee employee =  mapper.readValue(new File("data/employee.json"), Employee.class);
			System.out.println(employee);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	try {
    	//create object mapper
    	ObjectMapper mapper = new ObjectMapper();
    	
    	//using the object read data from json file and convert to pojo
    	
			Student student =  mapper.readValue(new File("data/student.json"), Student.class);
			System.out.println(student);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    } 
}
