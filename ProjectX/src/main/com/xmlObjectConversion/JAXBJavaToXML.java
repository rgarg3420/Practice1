package main.com.xmlObjectConversion;

import java.io.File;
import java.rmi.UnmarshalException;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JAXBJavaToXML {

	public static void main(String[] args) {
		try{
		
		JAXBContext context = JAXBContext.newInstance(Country.class);
		
		Unmarshaller unmarsheller = context.createUnmarshaller();
		
		File xmlFile =  new File("country.xml");
		
		Country country = (Country) unmarsheller.unmarshal(xmlFile); 
		
		String countryName = country.getCountryName();
		
		System.out.println(countryName);
		
		ArrayList<State> listOfStates=country.getListOfStates();

	
		for(State state: listOfStates){
			System.out.println("State: "+ state.getStateName()+" Population: "+state.getStatePopulation());
		}
		
		}catch(JAXBException je){
			
		}
	}

}
