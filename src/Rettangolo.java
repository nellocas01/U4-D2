
public class Rettangolo {

	//attributi di istanza
	 int altezza;
	 int larghezza;
	
	//costruttori
	public Rettangolo(int altezza, int larghezza) {
		this.altezza = altezza;
		this.larghezza = larghezza;
		
	}
	
	//metodi di istanza
	 public int perimetro() {
		return (altezza + larghezza)*2;
	}
	 
	 public int area() {
		 return (altezza * larghezza);
		}
	 
	 
	 public static void stampaRettangolo(Rettangolo rettangolo) {
		 System.out.println("il perimetro è: " + rettangolo.perimetro());
		 System.out.println("l'area è: " + rettangolo.area());
	 }
	 

    public static void stampaDueRettangoli(Rettangolo firstR, Rettangolo secondR) {

        System.out.println("Il perimetro del rettangolo firstR è: " + firstR.perimetro());
        System.out.println("L'area del rettangolo firstR è: " + firstR.area());

        System.out.println("Il perimetro del rettangolo secondR è: " + secondR.perimetro());
        System.out.println("L'area del rettangolo secondR è: " + secondR.area());

        System.out.println("La somma dei perimetri di firstR e secondR è: " + firstR.perimetro()+secondR.perimetro());
        System.out.println("La somma delle aree di firstR e secondR è: " + firstR.area()+secondR.area());
    }

}
