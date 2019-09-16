package Primjeri;

public class GenericCircularBuffer<Type> {
	
	private Type[] buffer;
	private int readCursor;
	private int writeCursor;

	public GenericCircularBuffer(int length) {
		buffer = (Type[]) new Object[length];
	}

	public boolean offer(Type value) {
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

	public Type poll() {
		final Type value = buffer[readCursor];
		if(value != null){
			buffer[readCursor] = null;
			readCursor = next(readCursor);
		}
		return value;
	}

}
