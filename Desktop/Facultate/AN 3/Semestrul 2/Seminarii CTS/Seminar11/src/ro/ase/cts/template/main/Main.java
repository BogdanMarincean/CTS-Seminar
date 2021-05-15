package ro.ase.cts.template.main;

import ro.ase.cts.template.clase.SpectatorNormal;
import ro.ase.cts.template.clase.SpectatorVIP;

public class Main {

	public static void main(String[] args) {
		SpectatorNormal spectatorNormal = new SpectatorNormal("Ionel");
		SpectatorVIP spectatorVIP = new SpectatorVIP("Mirela", 1);
		
		spectatorNormal.intraPeStadion();
		System.out.println("---------------");
		spectatorVIP.intraPeStadion();
	}

}
