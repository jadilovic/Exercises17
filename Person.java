package Primjeri;

import java.util.Objects;

public final class Person {

	private final String name;
	private final int age;
	
	public Person(String name, int age){
		
		Objects.requireNonNull(name);
		
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object o){
		if(o == null || getClass() != o.getClass())
			return false;
		Person person = (Person) o;
		return age == person.getAge() && name.equals(person.getName());
		}
	
	@Override
	public int hashCode(){
		int result = name.hashCode();
		result = 31 * result + age;
		return result;
	}
	
	@Override
	public String toString(){
		return "name=" + name + ", age=" + age + "; ";
	}
	/*
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
}
