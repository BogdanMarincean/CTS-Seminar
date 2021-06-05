package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categories.TesteRight;
import ro.ase.cts.categories.TesteUrgente;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.mock.StudentFake;

public class GrupaTestWithFakes {

	@Test
	@Category({TesteRight.class, TesteUrgente.class})
	public void testGetPromovabilitate() {
		Grupa grupa = new Grupa(1086);
		for(int i=0; i<7; i++)
		{
			StudentFake studentFake = new StudentFake();
			studentFake.setValoareAreRestanta(false);
			grupa.adaugaStudent(studentFake);
		}
		for(int i=0; i<3; i++)
		{
			StudentFake studentFake = new StudentFake();
			studentFake.setValoareAreRestanta(true);
			grupa.adaugaStudent(studentFake);
		}
		
		assertEquals(0.7, grupa.getPromovabilitate(), 0.01);
	}

}
