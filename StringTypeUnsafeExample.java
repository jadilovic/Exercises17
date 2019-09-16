package Primjeri;

public class StringTypeUnsafeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringCircularBuffer buffer = new StringCircularBuffer(10);
		buffer.offer("ab");
		buffer.offer("cd");
		buffer.offer("ef");
		//buffer.offer(5);
		
		String alpha = concatenate(buffer);
		System.out.println(alpha);
		}

	private static String concatenate(StringCircularBuffer buffer) {
		StringBuilder result = new StringBuilder();
		String conn;
		while((conn = (String) buffer.poll()) != null){
			result.append(conn);
		}
		return result.toString();
	}

}
