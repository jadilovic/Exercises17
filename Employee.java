package Primjeri;

public class Employee extends Person {

	public Employee(final String name, final int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString(){
		return "Employee " + getName() + ", " + getAge();
	}
}
