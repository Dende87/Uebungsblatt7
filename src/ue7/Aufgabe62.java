package ue7;

public class Aufgabe62 {
	
	public static void main(String[] a){
		
		int[][] matrix = {{1,2,3},{1,2,3},{1,2,3,4,2}};
		anzahlElemente(matrix);
	}

	private static void anzahlElemente(int[][] matrix) {

		int counter = 0;
		for(int[] anzahl: matrix){
			
			for(@SuppressWarnings("unused") int i: anzahl){
				counter++;
			}
			
		}
		System.out.print(counter);
		
	}

}
