package Primjeri;

public class Partner extends Person{

	public Partner(final String name, final int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString(){
		return "Partner " + getName() + ", " + getAge();
	}
}
