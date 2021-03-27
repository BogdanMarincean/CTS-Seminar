package ro.ase.cts.factory.clase;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory = new Factory();
		
		PersonalMedical medic1 = factory.create(TipPersonal.MEDIC, "Ionescu", 5000);
		PersonalMedical asistent1 = factory.create(TipPersonal.ASISTENT, "Popescu", 3000);
		
		System.out.println(medic1);
		System.out.println(asistent1);
	}

}
