package Primjeri;

import java.util.Arrays;

public class ListingPersons2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person("aki", 40);
		Person p2 = new Person("cuni", 30);
		Person p3 = new Person("ali", 20);
		Person p4 = new Person("adian", 10);
		
		Person[] persons = {p1, p2, p3, p4};
		System.out.println(persons.toString());
		System.out.println(Arrays.toString(persons));
		Person p5 = new Person("alina", 5);
		
		persons = addNew(persons, p5);
		
		System.out.println(Arrays.toString(persons));
	}

	private static Person[] addNew(Person[] list, final Person p5) {
		Person[] newPersons = Arrays.copyOf(list, list.length + 1);
		newPersons[list.length] = p5;
		return newPersons;
	}

}
