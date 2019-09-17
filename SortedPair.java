package Primjeri;

public class SortedPair<T extends Comparable<T>> {

	private final T first;
	private final T second;
	
	public SortedPair(T first, T second) {
		
		if(first.compareTo(second) < 0){
			this.first = first;
			this.second = second;
		}
		else {
			this.first = second;
			this.second = first;
		}
	}

	public T getFirst() {
		// TODO Auto-generated method stub
		return first;
	}

	public T getSecond() {
		// TODO Auto-generated method stub
		return second;
	}

}
