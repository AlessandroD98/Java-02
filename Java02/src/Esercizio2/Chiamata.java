package Esercizio2;



public class Chiamata {

	
	
	 long numchiamato;
	 double timecall;
	
	Chiamata(long numchiamato, double timecall) {
		this.numchiamato = numchiamato;
		this.timecall = timecall;
	}
	
	Chiamata() {
		System.out.println("Inserisci numero");
		this.numchiamato = Main.scanner.nextLong();
	 	System.out.println("Inserisci tempo");
		this.timecall = Main.scanner.nextDouble();
	}
	
	
}
