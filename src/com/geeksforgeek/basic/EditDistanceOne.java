package com.geeksforgeek.basic;

public class EditDistanceOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "gfg";
		String s2 = "gyt";

		int i=0;
		int j=0;
		int m = s1.length();
		int n= s2.length();
		int count =0;

		if(Math.abs(m-n)>1){
			System.out.println("No");
		}else{
			while(i<m && j<n){	
				if(s1.charAt(i) == s2.charAt(j)){

				}else{
					count++;
				}

				i++;
				j++;
			}

			if(i<m || j<n){
				count++;
			}

			if(count==1){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}

		}



	}

}
