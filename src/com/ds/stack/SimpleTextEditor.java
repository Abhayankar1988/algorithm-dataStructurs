package com.ds.stack;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * @author abchaubey
 * 
 * 
 * In this problem, your task is to implement a simple text editor. Initially, a file contains an empty string S. 
 * 	Your task is to perform Q operations consisting of the following 4 types:

		append(W) - Appends the string W at the end of S.
		erase(k) - Erase the last k character of S.
		get(k) - Returns the kth character of S.
		undo() - Undo the last not previously undone operation of type 1 or 2, so it reverts S to the state before that operation.
 *
 */
public class SimpleTextEditor {



	public static void main(String[] args) {

		
		 	Stack<String> stack = new Stack<String>(10000);
	        StringBuilder sb = new StringBuilder("");

	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();

	       for(int i =0; i<n; i++){
	            String s = sc.next();
	            /*String[] word = s.split(" ");*/

	            int oper = Integer.parseInt(s);

	            if (oper == 1) {
	                String temp = sc.next();
	                sb.append(temp);
	                String tempStack = sb.toString();
	                stack.push(tempStack);
	            } else if (oper == 2) {
	                int temp = Integer.parseInt(sc.next());
	                sb.delete(sb.length() - temp, sb.length());
	                String tempStack = sb.toString();
	                stack.push(tempStack);
	            } else if (oper == 3) {
	                int temp = Integer.parseInt(sc.next());
	                System.out.println(sb.charAt(temp - 1));
	            } else if (oper == 4) {
	                stack.pop();
	                if(stack.isEmpty()){
	                	 sb = new StringBuilder("");
	                }else{
	                	 sb = new StringBuilder(stack.peek());
	                }
	               
	            } else {
	                throw new InputMismatchException();
	            }
	        }
	
	
	}

/*	static int hisVal = 0;
	private static void undo(List<String> list, final CharStack stack) {

		boolean flag = false;

		for(int i = list.size() - 1; i >= 0; i--){
			String[] arrayString = list.get(i).split(",");
			if(arrayString[0].trim().equals("1")){		
				if(flag){
					appendUndo(arrayString[1], stack, hisVal);
				}else{
					erase(arrayString[1].length()-1, stack);
				}
			}else if(arrayString[0].trim().equals("2")){
				hisVal = Integer.parseInt(arrayString[1]);
				flag = true;
				continue;

			}

			list.remove(i);
			i = list.size() -i;
			break;
		}

	}



	private static void appendUndo(String nextString, CharStack stack, int hisVal) {
		nextString = nextString.trim();

		for(int j=0; j<hisVal; j++){
			stack.push(nextString.charAt(j));
		}


	}

	private  static void get(int position, final CharStack stack) {

		System.out.println((char)stack.getVal(position));

	}

	private static void erase(int nextInt, final CharStack stack) {

		for(int j=0; j<nextInt; j++){
			stack.pop();
		}


	}

	private static  void append( String nextInt, final CharStack stack) {

		nextInt = nextInt.trim();
		for(int j=0; j<nextInt.toCharArray().length; j++){
			stack.push(nextInt.charAt(j));
		}


	}
	
	*
	*
	*
		CharStack stack = new CharStack(1000000);

		Scanner scan = new Scanner(System.in);

		List<String> list = new ArrayList<String>();

		int operation = scan.nextInt();

		for(int i=0; i<operation; i++){

			int step = scan.nextInt();
			String word = "";
			if(step == 1){
				word= scan.nextLine();
				append(word, stack);
				list.add(String.valueOf(step) + " ," + word);
			}else if(step == 2){
				int optn= scan.nextInt();
				erase(optn, stack);
				list.add(String.valueOf(step) + " ," + String.valueOf(optn));
			}else if(step == 3){
				get(scan.nextInt(), stack);
			}else if(step == 4){
				undo(list,stack);
			}


		}

	*/
	
	
}
