package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.mock.StudentDummy;
import ro.ase.cts.mock.StudentStub;

public class GrupaTestWithMocks {
	Grupa grupa;
	
	@Test
	public void testAdaugaStudent() {
		Grupa grupa = new Grupa(1086);
		StudentDummy studentDummy = new StudentDummy();
		grupa.adaugaStudent(studentDummy);
		assertEquals(1,  grupa.getStudenti().size());
	}
	
	@Test
	public void adaugaStudentBoundarySup() {
		Grupa grupa = new Grupa(1086);
		for(int i=0; i<35; i++)
		{
			StudentDummy studentDummy = new StudentDummy();
			grupa.adaugaStudent(studentDummy);
		}
		assertEquals(35, grupa.getStudenti().size());
	}
	
	@Before
	public void creareGrupa() {
		this.grupa = new Grupa(1086);
		for(int i=0; i<35; i++)
		{
			StudentDummy studentDummy = new StudentDummy();
			grupa.adaugaStudent(studentDummy);
		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void adaugaStudentExceptie() {
			StudentDummy studentDummy = new StudentDummy();
			grupa.adaugaStudent(studentDummy);
	}
	
	
	@Test
	public void testGetPromovabilitate() {
		Grupa grupa = new Grupa(1088);
		StudentStub studentStub = new StudentStub();
		grupa.adaugaStudent(studentStub);
		assertEquals(0, grupa.getPromovabilitate(), 0.01);
	}

}
