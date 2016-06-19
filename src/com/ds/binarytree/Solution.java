package com.ds.binarytree;


public class Solution {

	public static void main(String[] args) {

		/*Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		// TODO Auto-generated method stub
		 */		
		int arr[] = {2,2,2,2,1,2,-1,2,1,3};
		//String S = "11++";
		System.out.println(solution(arr));

	}

	public static  int solution(int A []) {

		/*int number = (int) Math.abs(Math.sqrt(A));

		while((Math.pow(++number, 2))>B){
			break;
		}

		return number;*/

		int temp_begin_val = 0;
		int end_temp_val = 0;
		int begin = 0;
		int end = 0;

		for(int k = 1; k < A.length; k++) {
			if(A[k-1] < A[k]) {
				end_temp_val = k;
			} else {
				if(end - begin < end_temp_val - temp_begin_val) {
					begin = temp_begin_val;
					end = end_temp_val;
				}

				temp_begin_val = k;
				end_temp_val = k;
			}
		}

		if(end - begin < end_temp_val - temp_begin_val) {
			begin = temp_begin_val;
		}

		return begin;
	}



	/*public static int solution(String S) {

		Stack<Integer> stack = new Stack<Integer>();

		char []ch = S.toCharArray();

		int firstOperand = 0;
		int secondOperand = 0;

		int value =0;

		for(int k=0; k<ch.length; k++){

			if(ch[k]=='0' || ch[k]=='1' || ch[k]=='2' || ch[k]=='3' || ch[k]=='4' || ch[k]=='5' || ch[k]=='6' || ch[k]=='7' || 
					ch[k]=='8' || ch[k]=='9' ){				
				stack.push(Character.getNumericValue(ch[k]));
			}else if(ch[k]=='*' || ch[k]=='+'){
				if(!stack.isEmpty()){
					firstOperand = stack.pop();
				}else{
					return -1;
				}

				if(!stack.isEmpty()){
					secondOperand = stack.pop();
				}else{
					return -1;
				}

				if(ch[k]=='+'){
					value = firstOperand + secondOperand;
				}else if(ch[k]=='*'){
					value = firstOperand * secondOperand;
				}

				stack.push(value);


			}
		}


		return value;



}*/

}

