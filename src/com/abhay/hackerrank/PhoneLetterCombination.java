package com.abhay.hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneLetterCombination {


	public static void main(String[] args) throws FileNotFoundException {

		Scanner scanner = new Scanner(System.in);
		String abc = scanner.nextLine();
		letterCombinations(abc);
		scanner.close();
	}
	public static ArrayList<String> letterCombinations(String digits) {
		ArrayList<String> res = new ArrayList<String>();
		ArrayList<String> preres = new ArrayList<String>();
		res.add("");

		for(int i=0;i<digits.length();i++){
			for(String str: res){
				String letters = map.get(digits.charAt(i));
				for(int j=0;j<letters.length();j++)
					preres.add(str+letters.charAt(j));

				res = preres;
				preres = new ArrayList<String>();
			}      
			
		}
		System.out.println(res);
		return res;
	}

	static final HashMap<Character,String> map = new HashMap<Character,String>(){{
		put('2',"abc");
		put('3',"def");
		put('4',"ghi");
		put('5',"jkl");
		put('6',"mno");
		put('7',"pqrs");
		put('8',"tuv");
		put('9',"wxyz");
	}} ;
}

