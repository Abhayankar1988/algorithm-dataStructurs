package com.abhay.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeItAnagram {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str1,str2;
	    int[] a = new int[26]; 
	    int[] b = new int[26]; 
	    int count = 0;
	    str1 = br.readLine();
	    str2 = br.readLine();        
	    for(int i=0; i<str1.length();i++)
	     {
	            char c = str1.charAt(i);
	            a[ c - 97 ]++;            
	        }
	    for(int i=0; i<str2.length();i++)
	        {
	            char c = str2.charAt(i);
	            b[ c - 97 ]++;            
	    }
	    for(int i=0; i<26;i++)
	        count += Math.abs(a[i] - b[i]);
	    System.out.println(count);
	}

}
