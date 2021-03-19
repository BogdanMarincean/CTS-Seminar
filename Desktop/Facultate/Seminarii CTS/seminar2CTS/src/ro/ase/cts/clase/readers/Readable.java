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
		int nrDenumiri = scanner.nextInt();
		String[] denumiriProiecte = new String[5];
		for (int i = 0; i < nrDenumiri; i++)
			denumiriProiecte[i] = scanner.next();
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setPunctaj(punctaj);
		aplicant.setVarsta(varsta);
		aplicant.setDenumiriProiecte(denumiriProiecte, nrDenumiri);
		
	}
}
