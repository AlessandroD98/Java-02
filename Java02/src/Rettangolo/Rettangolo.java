package Rettangolo;

public class Rettangolo {
 
	private int heigth;
	private int width;
	
	public Rettangolo (int h, int b) {	
		 this.heigth = h;
		 this.width = b;
	}
	
	public static void RettangoloInfo(Rettangolo r1, Rettangolo r2) {
		System.out.println( "L Altezza e la base del rettangolo sono:" + " h" + r1.heigth + " b" + r1.width);
	 	System.out.println( "Il perimetro è:" + " " + getPerimetro(r1));
		System.out.println( "L' area è" + " " + getArea(r1));
		System.out.println( "L Altezza e la base del rettangolo sono:" + " h" + r2.heigth + " b" + r2.width);
		System.out.println( "Il perimetro è:" + " " + getPerimetro(r2));
		System.out.println( "L' area è" + " " + getArea(r2));
	}
	
	public static int getPerimetro(Rettangolo r) {
		return r.heigth*2 + r.width*2;
		}
	
	public static int getArea(Rettangolo r) {
		return r.heigth * r.width;
	}
	
	public static void AreaAndPerimentroSum(Rettangolo r1, Rettangolo r2) {
		System.out.println("La somma dei perimetri è:" + " " + (getPerimetro(r1) + getPerimetro(r2)));
		System.out.println("La somma delle aree è:" + " " + (getArea(r1) + getArea(r2)));
	}
	
}
