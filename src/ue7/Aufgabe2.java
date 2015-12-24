package ue7;

public class Aufgabe2 {

	public static void main(String[] args) {
		
		int[] histo = {3,1,2,2,4,1,0,3,4};

		histogram(histo);
		
	}
	
	 static void histogram(int[] i){
		
		for(int value: i){
			for(int j = 0; j<value; j++){
				IO.print("*");
			}
			IO.println();
		}
		
	}

}
