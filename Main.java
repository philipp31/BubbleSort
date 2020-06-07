
public class Main{
	
	public static void main(String args[]){
		Rechteck[] array = new Rechteck[5];
		array[0] = new Rechteck(4.0 , 3.0);
		array[1] = new Rechteck(2.0 , 2.0);
		array[2] = new Rechteck(5.0 , 10.0);
		array[3] = new Rechteck(1.0, 1.0);
		array[4] = new Rechteck(1.5, 3.0);
		
		bubbleSort(array);
		
		for(int i = 0; i < 5; i++) {
		System.out.println("Flaeche von array [" + i + "] : " + array[i].area);
		}
	
	}
	
	
	// Bubble Sort als Sortieralgorithmus für das Array
	public static void bubbleSort(Rechteck[] elements) {
		boolean sorted;
		do {
			sorted = true;
			for( int i = 0; i < elements.length-1; i++) {
				if(elements[i].compareTo(elements[i+1]) > 0 ) {	// die Elemente mit großen flächen werden nach oben sortiert ins array!
					Rechteck tmp = elements[i];
					elements[i] = elements[i+1];
					elements[i+1] = tmp;
					sorted = false;
				}
			}
		} while (!sorted);
	}
}
	