package Esercizio2;

public class Sim {

	 long num;
	 double credito = 0;
	 Chiamata[] chiamate = new Chiamata[5];
	
	Sim(long num){
		 
		this.num = num;
		this.credito = 0;
		this.chiamate = new Chiamata[5];
	}
	
	public static void Chiama() {
		 Chiamata c = new Chiamata();
	}
	
	public static Chiamata[] AggiungiARegisto () {
		
		return
	}
	
	
	public String toString() {
		String stringa = this.num + "\n" + this.credito + "\n" + this.chiamate;
		return stringa;
	}
}
	
