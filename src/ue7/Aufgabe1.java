package ue7;

public class Aufgabe1 {

	public static void main(String[] a) {

		int anzahl = IO.readInt("Anzahl der Sänger angeben (> 0): ");
		int[] anzahlSaenger = new int[anzahl];
		
		for(int i = 0;i < anzahlSaenger.length; i++){
			
			int anrufe = IO.readInt("Anrufe für Sänger " + (i+1) + " (>= 0): ");
			anzahlSaenger[i] = anrufe;
			
		}
		
		IO.println("Abstimmungsergebnis");
		
		for(int zahl : anzahlSaenger){
			
			for(int i = 0;i < zahl/2;i++){
				IO.print("*");
			}
			IO.println(" " + zahl);
		}
		
	}

}
