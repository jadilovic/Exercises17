package Primjeri;

import java.util.Comparator;

public class ReverseComparator<Type> implements Comparator<Type>{
	
	private final Comparator<Type> delegateComparator;
	
	public ReverseComparator(Comparator<Type> delegateComparator){
		this.delegateComparator = delegateComparator;
	}
	
	public int compare(final Type left, Type right) {
		// TODO Auto-generated method stub
		return -1 * delegateComparator.compare(left, right);
	}

}
