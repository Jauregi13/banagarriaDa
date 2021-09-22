package kromoak;

import java.io.IOException;

public class ProbaKromoak1 {

	public static void main(String[] args) throws IOException {
		Kromoak1 k;
		String fitxIzena;
		
		for(int i=0; i<=4; i++) {
			System.out.println("\nProba #"+i+":");
			fitxIzena = "fitxKromoak/kromoak"+i+".txt";
			k = new Kromoak1();
			k.irakurriFitxategitik(fitxIzena);
			k.zenbatInorkEz();
			k.zenbatAgerpen(0);
			k.zenbatAgerpen(5);
			k.zenbatAgerpen(10);
		}

		

	}

}
