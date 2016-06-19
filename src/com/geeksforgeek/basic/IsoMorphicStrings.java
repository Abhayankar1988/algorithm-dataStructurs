package com.geeksforgeek.basic;

public class IsoMorphicStrings {

	public static void main(String[] args) {
		
		String s1 = "aab";
		
		String s2 = "xy";
		
		System.out.println(isIsomorphic(s1,s2));

	}

	private static boolean isIsomorphic(String s1, String s2) {
		
		if(s1.length()!=s2.length()){
			return false;
		}
		
		if((s1.length()== 1) && (s2.length()==1)){
			return true;
		}
		
		int m = s1.charAt(0);
		int n = s2.charAt(0);
		
		boolean flag = false;
		
		for(int i=0; i<s1.length(); i++){
			if(Math.abs(m-s1.charAt(i)) == Math.abs(n-s2.charAt(i))){
				flag = true;
			}else{
				flag = false;
				break;
			}
		}
		if(flag){
			return true;
		}else{
			return false;	
		}
		
		
		
	}

}
