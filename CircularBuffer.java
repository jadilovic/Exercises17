package Primjeri;

public class CircularBuffer {
	
	private Object[] buffer;
	private int readCursor;
	private int writeCursor;

	public CircularBuffer(int length) {
		buffer = new Object[length];
	}

	public boolean offer(Object value) {
		if(buffer[writeCursor] != null){
			return false;
		}
		
		buffer[writeCursor] = value;
		writeCursor = next(writeCursor);
		return true;
	}

	private int next(int index) {
		return (index + 1) % buffer.length;
	}

	public Object poll() {
		final Object value = buffer[readCursor];
		if(value != null){
			buffer[readCursor] = null;
			readCursor = next(readCursor);
		}
		return value;
	}

}
