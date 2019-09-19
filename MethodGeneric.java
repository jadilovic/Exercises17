package Primjeri;

public class MethodGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer inti = new Integer(5);
		String stri = new String("what");
		BoxGeneric bg = new BoxGeneric();
		bg.set(6);
		
		printObject(bg.get());
		printObject(inti);
		printObject(stri);
	}

	private static <T> void printObject(T object) {
		// TODO Auto-generated method stub
		System.out.println(object.toString());
	}

}
