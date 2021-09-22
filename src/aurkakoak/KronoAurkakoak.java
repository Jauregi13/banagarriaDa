package aurkakoak;

//import java.util.Arrays;
//import java.util.Collections;



public class KronoAurkakoak {
	
	public static void main(String[] args) { 	
		
		Aurkakoak aurk = new Aurkakoak();
		int[] a;
		Stopwatch timer;		
		
		a = ArrayCreator.createArrayNoRepOrdered(20);
		for(int i=0; i<a.length;i++) System.out.print(a[i]+" ");
		System.out.println("\nEmaitza: ");
		System.out.println(aurk.zenbatAurkako1(a));
	
		int N=250;
		while(true) {
			a= ArrayCreator.createArrayNoRepOrdered(N); //Gorantz ordenatutako N elementuko array bat sortzen du
			timer = new Stopwatch(); //Kronometroa martxan jartzen du
			aurk.zenbatAurkako1(a); //zenbatAurkako metodoaren bertsio bati dei egiten dio
			System.out.println(N+":"+timer.elapsedTime());	//Igarotako denbora inprimatzen du	
			N=N*2; //Arrayaren tamaina bikoiztu egiten du
		}
		
		
		
		
	}
    


}
