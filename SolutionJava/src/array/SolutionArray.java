package array;

public class SolutionArray {

	public static void main(String[] args) {
		copyArray();
	}
	
	private static void oneIntArray() {
		int[] array = new int[10];
		for (int i: array) {
			System.out.print("," + i);
		}
	}
	
	private static void twoIntArray() {
		int[][] array1 = new int[10][];
		int[][] array2 = new int[10][10];
		int array2_1[][] = new int[10][];
		int[] array2_2[] = new int[10][];
		int[][][] array3 = new int[20][][];
		for (int[] i : array2) {
			for (int j: i) {
				System.out.println(j);
			}
		}
	}
	
	private static void twoIntArray2() {
		int[][] array = {{1,2,3},{3,4,5},{1,2,1,5}};//it is workable in  
		for (int[] i : array) {
			for (int j: i) {
				System.out.println(j);
			}
		}
	}
	
	private static void copyArray() {
		int[] array = {5,4,3,2,1};
		System.arraycopy(array, 0, array, 1, 4);
		System.out.print("{" + array[0]);
		for (int i = 1; i < array.length; i++) {
			System.out.print("," + array[i]);
		}
		System.out.print("}");
	}
}
