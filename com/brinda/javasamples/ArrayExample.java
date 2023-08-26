package com.brinda.javasamples;

public class ArrayExample {

	public static void main(String[] args) {
		
		int a[]=new int[5];//declaration of array with 5 elements
		
		//store element in array
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40; 
		a[4]=50;
		
		//read elements from an array using for loop
		/*for(int i=0;i<=4;i++) {
			System.out.println(a[i]);
		}*/
		
		
		//for ...each loop
		for(int i:a) {
			System.out.println(i);
		}

	}

}
