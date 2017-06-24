package jp3;

public class LinearRecursion {
	
	public LinearRecursion() {};
	
	public static double factorial(double d) {
		if (d <= 1) {
			return 1;
		}
		else{
			return d*factorial(d-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d=5;
		LinearRecursion f = new LinearRecursion();
		System.out.println("Factorial ["+f.factorial(d)+"] of [" + d +"]");

	}

}
