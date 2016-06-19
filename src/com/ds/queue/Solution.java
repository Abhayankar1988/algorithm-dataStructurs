package com.ds.queue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws IOException {/*

		File sourceFile = new File("C:/Users/abchaubey/Desktop/CheckMyBenefits/Signature of S J  10 02 16");
		File destination =  new File("C:/Users/abchaubey/Desktop/CheckMyBenefits/outout");

		copyDirectory(sourceFile, destination);
		File dir = new File(".");
		BufferedReader in = null;
		BufferedWriter out = null;


		String source;
		try {
			source = "C:/Users/abchaubey/Desktop/CheckMyBenefits/ICI&SSN.txt";
			String dest = "C:/Users/abchaubey/Desktop/CheckMyBenefits/new.doc";

			File fin = new File(source);
			FileInputStream fis = new FileInputStream(fin);
			in = new BufferedReader(new InputStreamReader(fis));

			FileWriter fstream = new FileWriter(dest, true);
			out = new BufferedWriter(fstream);

			String aLine = null;
			while ((aLine = in.readLine()) != null) {
				//Process each line and add output to Dest.txt file
				out.write(aLine);
				out.newLine();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally{
			in.close();

			// close buffer writer
			out.close();

		}

		// do not forget to close the buffer reader

	 */

		/*Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();
        boolean flag = false;
		for(int i=0;i<number;i++){
			int count =1;
			int divisor =0;
			int uglyNumber = scan.nextInt();
			while(count<uglyNumber){
				if(isUgly(++divisor)){
					++count;
					System.out.println(divisor);
				}
			}

			System.out.println(divisor);
		}
		 *
		 */


		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
	
		for(int i=0; i<number; i++){

			StringBuilder s1 = new StringBuilder(scan.next());
			StringBuilder s2 = new StringBuilder(scan.next());

			
			StringBuilder s3 = new StringBuilder();
			for(int j=0; j<s2.length(); j++){
				for(int k=0; k<s1.length(); k++){
					if(s1.charAt(k)==s2.charAt(j)){
						 System.out.println(s1.charAt(k));
					}
				}	
			}

			System.out.println(s1);

		}

	}



	private static boolean isUgly(int i) {

		int number = maxDivide(i,2);
		number = maxDivide(i,3);
		number = maxDivide(i,5);

		if(number==1){
			return true;
		}else{
			return false;	 
		}

	}



	private static int maxDivide(int i, int j) {
		while(i%j==0){
			i= i/j;
		}
		return i;
	}



	public static void copyDirectory(File sourceLocation , File targetLocation)
			throws IOException {

		if (sourceLocation.isDirectory()) {
			if (!targetLocation.exists()) {
				targetLocation.mkdir();
			}

			String file = "";
			String[] children = sourceLocation.list();
			for (int i=0; i<children.length; i++) {
				/*if(children[i].lastIndexOf(".") != -1 && children[i].lastIndexOf(".") != 0){
					file = children[i].substring(children[i].lastIndexOf(".")+1);
				}*/


				file = children[i].substring(children[i].lastIndexOf("."));
				if(file.equals(".LP2")){
					file = children[i].substring(0, children[i].lastIndexOf(".")+1) + "doc";
					copyDirectory(new File(sourceLocation, children[i]),
							new File(targetLocation, file));
				}else{
					copyDirectory(new File(sourceLocation, children[i]),
							new File(targetLocation, children[i]));
				}
			}


		} else {

			InputStream in = new FileInputStream(sourceLocation);
			OutputStream out = new FileOutputStream(targetLocation);

			// Copy the bits from instream to outstream
			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			in.close();
			out.close();
		}
	}

}
