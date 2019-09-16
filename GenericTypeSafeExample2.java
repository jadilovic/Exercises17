package Primjeri;

public class GenericTypeSafeExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericCircularBuffer<Integer> buffer = new GenericCircularBuffer<Integer>(10);
		buffer.offer(1);
		buffer.offer(2);
		buffer.offer(3);
		buffer.offer(4);
		// buffer.offer("5");
		
		String alpha = concatenate(buffer);
		System.out.println(alpha);
		}

	private static String concatenate(GenericCircularBuffer<Integer> buffer) {
		StringBuilder result = new StringBuilder();
		Integer conn;
		while((conn = buffer.poll()) != null){
			result.append(conn);
		}
		String nums = result.toString();
		int num = Integer.parseInt(nums);
		return result.toString();
	}

}
