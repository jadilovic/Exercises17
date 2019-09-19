package Primjeri;

import java.util.AbstractList;

public class CustomArrayGeneric<T> extends AbstractList<T>{

	private T[] values;
	
	public CustomArrayGeneric(){
		values = (T[]) new Object[0];
	}
	@Override
	public T get(final int index) {
		return values[index];
	}
	
	public boolean add(final T o){
		T[] newValues = (T[]) new Object[size() + 1];
		for(int i = 0; i < size(); i++){
			newValues[i] = values[i];
		}
		newValues[size()] = o;
		values = newValues;
		return true;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return values.length;
	}
}
