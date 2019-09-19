package Primjeri;

public class BoundedGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer intg = new Integer(5);
		Double doub = new Double(25);
		
		inspect(intg);
		inspect(doub);
		//inspect("text");
	}

	private static <Type extends Number> void inspect(Type t) {
		System.out.println("Type: " + t.getClass().getName());
	}

}
