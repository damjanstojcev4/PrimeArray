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
		public int[] addElementInOrder(int[] arr, int x) {
		int[] tempArray = new int[arr.length + 1];
		int index = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= x) {
				index = i;
				break;
			}
		}
		
		for (int i = 0; i < index; i++) {
			tempArray[i] = arr[i];
		}
		
		tempArray[index] = x;
		
		for (int i = index; i < arr.length; i++) {
			tempArray[i + 1] = arr[i];
		}
		
		return tempArray;
	}
}
