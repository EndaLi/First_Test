package com.itheima;

public class Test1 {

	public static void main(String[] args) {
		
		int[] arr = {2,1,9,3,5};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i -1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
