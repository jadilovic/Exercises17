package Primjeri;

public class BoundedGenerics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer inti = new Integer(6);
		Double dobi = new Double(36);
		
		inspect(inti);
		inspect(dobi);
		
	}

	private static <T extends Number> void inspect(T numberObject) {
		// TODO Auto-generated method stub
		System.out.println("Type number object: " + numberObject.getClass().getSimpleName());
	}

}
