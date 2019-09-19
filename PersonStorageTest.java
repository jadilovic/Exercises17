package Primjeri;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class PersonStorageTest {

	private Partner don = new Partner("don mol", 77);
	private Partner mak = new Partner("mak all", 55);
	private Employee edo = new Employee("edo bob", 33);
	
	private File file;
	private PersonLoader loader;
	private PersonSaver saver;
	
	
	
	@Test
	public void savesAndLoadsPerson() throws Exception {
		
		Person person = new Person("mike mici", 22);
		saver.save(person);
		assertEquals(person, loader.load());
	}

}
