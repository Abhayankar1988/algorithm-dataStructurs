package com.abhay.hackerrank;

import java.util.Properties;

public class IntersectionOfArrays {

	public static void main(String[] args) {
		
		int firstArray[] = {1,2,3,4,5,6,7};
		
		int secondArray[] = {1,2,3,4};
		
		int resultArray[] = new int[secondArray.length];
		
		for(int i=0 ,k=0; i<firstArray.length; i++){
			for(int j=0; j<secondArray.length; j++){
				if(firstArray[i]==secondArray[j]){
					resultArray[k++] = firstArray[i];
				}
			}
		}
		
		for(int a : resultArray){
			System.out.print(a + " ");
		}
		
		try{
			Float f = new Float("3.0");
			int x = f.intValue();
			byte b = f.byteValue();
			double d = f.doubleValue();
			System.out.println(x+ b + d);
		}
		
		catch(NumberFormatException ex){
			System.out.println("bad number");
		}
		

	}

}
