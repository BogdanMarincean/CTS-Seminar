package ro.ase.cts.program;

import java.util.ArrayList;
import java.util.List;

import ro.ase.cts.clase.Reteta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> denumireSolutii = new ArrayList<>();
		denumireSolutii.add("apa");
		List<Integer> cantitati = new ArrayList<>();
		cantitati.add(10);
		Reteta reteta1 = new Reteta(denumireSolutii, cantitati);
		
		Reteta reteta2 = (Reteta) reteta1.copiaza();
		
		System.out.println(reteta1.toString());
		System.out.println(reteta2.toString());

	}

}
