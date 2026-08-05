package com.qsp.array;

public class ArrayToMatrix {
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5,6,7,8,9,3,4,5};
		int rows = 7;
		int cols = 5;
		int idx = 0;
		
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=cols; j++) {
				int temp = idx%arr.length;
				System.out.print(arr[temp]);
				idx++;
			}
			System.out.println();
		}
	}
//	static void ToMatrix(int)
}

