package zeinFalta;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProbaZeinFalta {

	public static void main(String[] args) throws FileNotFoundException {
		
		ZeinFalta zf = new ZeinFalta();
		Scanner sc = new Scanner(new File("fitxZeinFalta/zeinFalta.txt"));
		String lerroa;
		String[] zenbakiak;
		int[] arr;
		while(sc.hasNextLine()) {
			lerroa = sc.nextLine();			
			zenbakiak = lerroa.split("\\s+");
			arr = new int[zenbakiak.length];
			for(int i=0; i<zenbakiak.length; i++) {
				arr[i] = Integer.parseInt(zenbakiak[i]);
			}
			System.out.println("["+lerroa+"] arrayan falta den zenbakia: "+zf.zeinFalta1(arr));
		}
		sc.close();		

	}

}
