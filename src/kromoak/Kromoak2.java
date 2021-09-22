package kromoak;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Kromoak2 {
	final static int LAGUNKOP = 7;
	final static int KROMOKOP = 20;
	private ArrayList<Integer> kromoak[];
	
	public Kromoak2() {
		this.kromoak = new ArrayList[LAGUNKOP]; // Kromoen lista hutsa lagun bakoitzak
		for(int i=0;i<LAGUNKOP;i++) kromoak[i]=new ArrayList<Integer>();	
	}
	
	public void irakurriFitxategitik(String fitxIzena) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fitxIzena));
		String split[];
		
		String lerroa = br.readLine();

		int lagunId = 0;
		while ((lerroa != null) && (lagunId < LAGUNKOP)) {
			split = lerroa.split("\\s+");// Lerroa osagaitan banatu
			for(int i=0; i<split.length; i++) {
				int kromoZbkia = Integer.parseInt(split[i]);
				kromoak[lagunId].add(kromoZbkia);
			}
			lerroa = br.readLine();
			lagunId++;
		}
		br.close();
		
	}
	
	
	public void zenbatInorkEz() {
	   	// OSATU ZATI HAU

    	
    	
    	
    	
    	
		
		
 		System.out.println();
		System.out.println("Inork ez dauzkan kromoen kopurua: " + kont);
	}
	

	public void zenbatAgerpen(int kromoZbkia) {
	   	// OSATU ZATI HAU

    	
    	
    	
    	
    	
		
		System.out.println("\t" + kromoZbkia + " kromoa " + kont + " aldiz agertzen da");
	}



}
