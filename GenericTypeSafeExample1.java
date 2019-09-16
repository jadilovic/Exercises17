package Primjeri;

public class GenericTypeSafeExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericCircularBuffer<String> buffer = new GenericCircularBuffer<String>(10);
		buffer.offer("ab");
		buffer.offer("cd");
		buffer.offer("ef");
		// buffer.offer(5);
		
		String alpha = concatenate(buffer);
		System.out.println(alpha);
		}

	private static String concatenate(GenericCircularBuffer<String> buffer) {
		StringBuilder result = new StringBuilder();
		String conn;
		while((conn = buffer.poll()) != null){
			result.append(conn);
		}
		return result.toString();
	}

}
