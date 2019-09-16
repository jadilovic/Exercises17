package Primjeri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapPersons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person("aki", 40);
		Person p2 = new Person("cuni", 30);
		Person p3 = new Person("ali", 20);
		Person p4 = new Person("adian", 10);
		
		Map<String, Person> persons = new HashMap<>();
		persons.put(p1.getName(), p1);
		persons.put(p2.getName(), p2);
		persons.put(p3.getName(), p3);
		persons.put(p4.getName(), p4);
		
		System.out.println(persons.toString());
		
		persons.put("alina", new Person("alina", 5));
		
		System.out.println(persons.toString());
		
		for(String p: persons.keySet())
			System.out.println(p);
		
		for(Map.Entry<String, Person> p: persons.entrySet()){
			System.out.println(p.getKey());
			System.out.println(p.getValue());
		}
	}

	private static Person[] addNew(Person[] list, final Person p5) {
		Person[] newPersons = Arrays.copyOf(list, list.length + 1);
		newPersons[list.length] = p5;
		return newPersons;
	}

}
