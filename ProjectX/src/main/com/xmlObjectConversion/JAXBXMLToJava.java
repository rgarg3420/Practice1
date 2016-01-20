package main.com.xmlObjectConversion;

import java.io.Console;
import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.Result;

public class JAXBXMLToJava {

	
public static void main(String s[]){
	
	

	   Country countryIndia=new Country(); 
       countryIndia.setCountryName("India");
	   countryIndia.setCountryPopulation(5000000);

	 

	   // Creating listOfStates
	
	   ArrayList<State> stateList=new ArrayList<State>();
	   State mpState=new State("Madhya Pradesh",1000000);
	   stateList.add(mpState);
	   State maharastraState=new State("Maharastra",2000000);
	   stateList.add(maharastraState);
	   countryIndia.setListOfStates(stateList);
	
	try {
		JAXBContext context =  JAXBContext.newInstance(Country.class);
		
		// create JAXB context and initializing Marshaller
		Marshaller marsheller =    context.createMarshaller(); 
		
		// for getting nice formatted output
		marsheller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		
		//Specify the location of file
		File xmlFile = new File("country.xml");
		
		// Writing to XML file
		marsheller.marshal(countryIndia,xmlFile);
		
		
		
	} catch (JAXBException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
}
