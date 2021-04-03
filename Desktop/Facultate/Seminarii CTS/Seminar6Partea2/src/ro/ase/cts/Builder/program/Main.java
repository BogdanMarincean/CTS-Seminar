package ro.ase.cts.Builder.program;

import ro.ase.cts.Builder.classes.BuilderRezervare;
import ro.ase.cts.Builder.classes.BuilderRezervareV2;
import ro.ase.cts.Builder.classes.Rezervare;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare=new Rezervare(1,true,true,false,true,"dance");
		System.out.println(rezervare.toString());
		
		BuilderRezervare builder=new BuilderRezervare().setCodRezervare(2).setAreBauturaRacoritoareInclusa(true).setAreMancareInclusa(false).setAreMuzicaAmbientalaPersonalizata(true).setAreScaunErgonomic(false).setGenMuzical("dance");
		Rezervare rezervare1=builder.build();
		System.out.println(rezervare1.toString());
		
		Rezervare rezervare2=new BuilderRezervare().setCodRezervare(2).setAreBauturaRacoritoareInclusa(true).build();
		System.out.println(rezervare2.toString());
		
		Rezervare rezervare3=builder.setCodRezervare(4).build();
		System.out.println(rezervare3.toString());
		
		BuilderRezervareV2 builderV2= new BuilderRezervareV2().setAreMancareInclusa(true).setAreScaunErgonomic(true).setAreBauturaRacoritoareInclusa(true);
		Rezervare rez1 = builderV2.setCodRezervare(10).build();
		Rezervare rez2 = builderV2.setCodRezervare(11).build();
		System.out.println(rez1);
		System.out.println(rez2);
	}

}
