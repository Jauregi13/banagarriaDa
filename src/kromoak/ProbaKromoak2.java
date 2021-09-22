package kromoak;

import java.io.IOException;

public class ProbaKromoak2 {

	public static void main(String[] args) throws IOException {
		Kromoak2 k;
		String fitxIzena;
		
		for(int i=0; i<=4; i++) {
			System.out.println("Proba #"+i+":");
			fitxIzena = "fitxKromoak/kromoak"+i+".txt";
			k = new Kromoak2();
			k.irakurriFitxategitik(fitxIzena);
			System.out.println("Datuak kargatu dira");
			k.zenbatInorkEz();
	
			
			k.zenbatAgerpen(0);
			k.zenbatAgerpen(5);
			k.zenbatAgerpen(10);
			
		}

		

	}

}
