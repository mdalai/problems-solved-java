package problems;

import java.util.Scanner;

public class Factorial {
	
	private int num;
	private String numStr ="";
	
	public Factorial(int n){
		num = n;
		numStr = "1";
	}

	public static void main(String[] args) {
		System.out.println("Please input a Number: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Factorial f = new Factorial(n);
		System.out.println(f.toString());

	}
	
	int getFactorial(){ 
		int factorial=1;   
		for(int i = num; i > 0;  i--){    
			factorial *= i;			
			//System.out.println(i);
		}     
		return factorial;     
	} 
	
	String getNumStr() {
		for(int i = 2; i < num+1; i++){    
			numStr = numStr + "*" + i ;
			//System.out.println(numStr);
		}     
		return numStr;
	}
	
	public String toString() {    
		return "Factorial: " + num + "! = " + getNumStr() + " = " + getFactorial();
	} 

}
