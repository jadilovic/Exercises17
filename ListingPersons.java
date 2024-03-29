package Primjeri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListingPersons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person("aki", 40);
		Person p2 = new Person("cuni", 30);
		Person p3 = new Person("ali", 20);
		Person p4 = new Person("adian", 10);
		
		List<Person> persons = new ArrayList<>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		
		System.out.println(persons.toString());
		
		persons.add(new Person("alina", 5));
		
		System.out.println(persons.toString());
		
		for(Person p: persons)
			System.out.println(p);
	}

	private static Person[] addNew(Person[] list, final Person p5) {
		Person[] newPersons = Arrays.copyOf(list, list.length + 1);
		newPersons[list.length] = p5;
		return newPersons;
	}

}
