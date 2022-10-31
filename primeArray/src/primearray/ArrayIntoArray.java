package primearray;

public class ArrayIntoArray {
	
	public int[] addElementIntoArray(int[] arr, int x) {
		int[] tempArray = new int[arr.length + 1];
		
		for (int i = 0; i < arr.length; i++) {
			tempArray[i] = arr[i];
		}
		tempArray[tempArray.length - 1] = x;
		return tempArray;
	}
}
