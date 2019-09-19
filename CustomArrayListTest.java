package Primjeri;

import java.util.List;

public class CustomArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List customList = new CustomArrayList();
		customList.add(1);
		customList.add(2);
		customList.add(3);
		
		for(int i = 0; i < customList.size(); i++){
			System.out.println(customList.get(i));
		}
	}

}
