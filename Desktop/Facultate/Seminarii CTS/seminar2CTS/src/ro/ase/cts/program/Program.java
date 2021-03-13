package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Proiect;
import ro.ase.cts.clase.readers.AngajatiReader;
import ro.ase.cts.clase.readers.EleviReader;
import ro.ase.cts.clase.readers.StudentiReader;
import ro.ase.cts.clase.readers.Readable;

public class Program {
	
	public static List<Aplicant> citesteAplicanti(Readable reader) throws FileNotFoundException {
		return reader.readAplicant();
	}

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		Proiect proiect = new Proiect(80);
		try {
			listaAplicanti = citesteAplicanti(new EleviReader("elevi.txt"));
			for(Aplicant aplicant:listaAplicanti) {
				System.out.println(aplicant.toString());
				System.out.println(aplicant.getFinantare());
				aplicant.displayStateInProject(proiect);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
