package Primjeri;

import java.util.AbstractList;

public class CustomArrayList extends AbstractList{

	private Object[] values;
	
	public CustomArrayList(){
		values = new Object[0];
	}
	@Override
	public Object get(final int index) {
		return values[index];
	}
	
	public boolean add(final Object o){
		Object[] newValues = new Object[size() + 1];
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
