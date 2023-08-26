package com.brinda.javasamples;

import java.util.Objects;

public class ArrayExample4 {

	public static void main(String[] args) {
		
		Object a[]=new Objects[5];
		

		a[1]=20.5;//double
		a[2]="welcome";//string
		a[4]='g';//char
		a[5]=true;//boolean
		
		for(Object i:a) {
			System.out.println(i);
		}
				
	}

}
