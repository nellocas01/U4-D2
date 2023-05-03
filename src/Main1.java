
public class Main1 {

	public static void main(String[] args) {
		//creare istanze di rettangolo
		
		Rettangolo firstR = new Rettangolo(20, 50);
		Rettangolo secondR = new Rettangolo(15, 30);
		
	    Rettangolo.stampaRettangolo(firstR);
        Rettangolo.stampaRettangolo(secondR);

        Rettangolo.stampaDueRettangoli(firstR, secondR);
	  
	}

}
