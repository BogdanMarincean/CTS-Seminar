package test;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Student;

public class StudentTests {

	@Test
	public void testConstructorWorksCorectlyForName() {
		String nume = "Gigel";
		Student student = new Student(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testSetNume() {
		String nume = "Popescu";
		Student student = new Student();
		student.setNume(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testConstructorWorkCorectly() {
		Student student = new Student();
		assertNotNull("Lista de note nu a fost initializata", student.getNote());
		assertNotNull("Numele nu a fost initializat", student.getNume());
	}
	
	@Test
	public void testAdaugaNota() {
		Student student = new Student();
		int nota = 10;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testGetNota() {
		Student student = new Student();
		student.adaugaNota(5);
		student.adaugaNota(7);
		student.adaugaNota(9);
		student.adaugaNota(4);
		assertEquals(9, student.getNota(2));
	}
	
	@Test
	public void testAdaugaOSinguraNota() {
		Student student = new Student();
		int nota = 10;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	public void testAdaugaNotaIncorecta() {
		Student student = new Student();
		//1
		try {
			//2
			student.adaugaNota(-1);
			//3 - nu ajunge aici
			fail("Nu trebuia sa ajunga aici. Metoda nu arunca exceptie");
		}
		catch (IllegalArgumentException ex) {
			//4
		}
		catch (Exception e) {
			//5 - nu ajunge aici
			fail("Metoda nu arunca o exceptie de tipul IllegalArgument");
		}
		//6
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAdaugaNotaIncorectaJUnit4() {
		Student student = new Student();
		student.adaugaNota(-1);
	}
	
	@Test
	public void testStudentulAreRestanta()
	{
		Student student = new Student();
		student.adaugaNota(7);
		boolean rezultat = student.areRestante();
		assertFalse(rezultat);
	}
	
	@Test
	public void testCalculeazaMedieCorecta()
	{
		Student student = new Student();
		student.adaugaNota(10);
		student.adaugaNota(9);
		//assertEquals(9.5, student.calculeazaMedie()); - deprecated
		assertEquals(9.5, student.calculeazaMedie(), 0.0001);
	}
}
