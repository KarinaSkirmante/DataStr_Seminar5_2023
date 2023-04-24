package service;

import java.util.HashMap;
import java.util.Hashtable;

import model.City;

public class MainService {

	public static void main(String[] args) {
		City city1 = new City("Ventspils", 120, "Latvia", 1230.23f, 32456);
		City city2 = new City("Rīga", 2020, "Latvia", 100230.23f, 1000456);
		City city3 = new City("Kuldīga", 50, "Latvia", 1023.23f, 23456);
		City city4 = new City("Talsi", 60, "Latvia", 798.23f, 12345);
		
		HashMap<String, City> myHashMap = new HashMap<>();
		myHashMap.put(city1.getTitle(), city1);
		myHashMap.put(city2.getTitle(), city2);
		myHashMap.put(city3.getTitle(), city3);
		myHashMap.put(city4.getTitle(), city4);
		
		if(myHashMap.containsKey("Ventspils"))
			System.out.println(myHashMap.get("Ventspils"));
		
		myHashMap.put(null, null);
		
	
		myHashMap.put("Liepāja", new City("Liepāja", 1200, "Latvia", 1234.45f, 123456));
		
		System.out.println(myHashMap.entrySet());
		
		Hashtable<String, City> myHashTable = new Hashtable<>();
		
		//myHashTable.put("Ventspils", null);
		
	}

}
