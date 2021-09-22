package kromoak;

import java.io.*;

public class Kromoak1 {
	final static int LAGUNKOP = 7;
	final static int KROMOKOP = 20;
	private int[][] kromoak;
	// Taula bat, non errenkada bakoitzak lagun baten kromoen bilduma adierazten duen
	// Errenkadetako indizeak kromo-zenbakiak dira eta balioak kromoen kopuruak

	public Kromoak1() {
		this.kromoak = new int[LAGUNKOP][KROMOKOP]; // Matrizea sortu eta hasieratu zero balioarekin
	}

	
	public void irakurriFitxategitik(String fitxIzena) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fitxIzena));
		String split[];

		// Lagun bakoitzaren kromoak irakurri
		// Lerro bakoitza lagun bati dagokio, zero lagunetik hasita
		String lerroa = br.readLine();

		int lagunId = 0;
		while ((lerroa != null) && (lagunId < LAGUNKOP)) {
			split = lerroa.split("\\s+");// Lerroa osagaitan banatu
			for (int i = 0; i < split.length; i++) { 
				int kromoZbkia = Integer.parseInt(split[i]);
				kromoak[lagunId][kromoZbkia]++;
			}
			lerroa = br.readLine();
			lagunId++;
		}	
		br.close();
	}

	
	public void zenbatInorkEz() {
	   	// OSATU ZATI HAU

    	
    	
    	
    	
    	
		
		
		System.out.println();
		System.out.println("Inork ez dauzkan kromoen kopurua: " + zenbat);
	}

	public void zenbatAgerpen(int kromoZbkia) {
	   	// OSATU ZATI HAU

    	
    	
    	
    	
    	
		
		
		System.out.println("\t" + kromoZbkia + " kromoa " + kont + " aldiz agertzen da");
	}

}
