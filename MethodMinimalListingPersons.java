package Primjeri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MethodMinimalListingPersons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person("aki", 40);
		Person p2 = new Person("cuni", 20);
		Person p3 = new Person("ali", 30);
		Person p4 = new Person("adian", 25);
		
		List<Person> persons = new ArrayList<>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		
		System.out.println(persons.toString());
		
		persons.add(new Person("alina", 5));
		
		System.out.println(persons.toString());
		
		Collections.sort(persons, new AgeComparator());
		
		System.out.println(persons.toString());
		
		Collections.sort(persons, new ReverseComparator<>(new AgeComparator()));
		
		System.out.println(persons.toString());
		
		for(Person p: persons)
			System.out.println(p);
		
		final Person youngestPerson = (Person) min(persons, new AgeComparator());
		System.out.println("Youngest person is: " + youngestPerson.toString());
	}

	private static Object min(List values, Comparator comparator) {
		
		if(values.isEmpty()){
			throw new IllegalArgumentException("There is no data in the list");
		}
		
		Object lowestElement = values.get(0);
		
		for(int i = 1; i < values.size(); i++){
			Object element = values.get(i);
			if(comparator.compare(element, lowestElement) < 0){
				lowestElement = element;
			}
		}
		return lowestElement;
	}

	private static Person[] addNew(Person[] list, final Person p5) {
		Person[] newPersons = Arrays.copyOf(list, list.length + 1);
		newPersons[list.length] = p5;
		return newPersons;
	}

}
