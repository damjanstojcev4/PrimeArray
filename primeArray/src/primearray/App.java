package primearray;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		int[] array = {4, 6, 9, -12};
		
		ArrayIntoArray eaa = new ArrayIntoArray();
		
		System.out.println(Arrays.toString(eaa.addElementIntoArray(array, 505)));
	}

}
