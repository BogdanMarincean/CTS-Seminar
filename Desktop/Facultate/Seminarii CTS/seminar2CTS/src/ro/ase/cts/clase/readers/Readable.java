package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

public abstract class Readable {
	
	public String fileName;
	
	
	
	public Readable(String fileName) {
		this.fileName = fileName;
	}

	public abstract List<Aplicant> readAplicant() throws FileNotFoundException;
	
	public void readAplicant(Scanner scanner, Aplicant aplicant) {
		String nume = scanner.next();
		String prenume = scanner.next();
		int varsta = scanner.nextInt();
		int punctaj = scanner.nextInt();
		int nr = scanner.nextInt();
		String[] vect = new String[5];
		for (int i = 0; i < nr; i++)
			vect[i] = scanner.next();
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setPunctaj(punctaj);
		aplicant.setVarsta(varsta);
		aplicant.setDenumiriProiecte(vect, nr);
		
	}
}
