package jp3;

public class NonLinearRecursion {
	
	public static double fibonacci(double d){
		if(d < 2) {
			return d;
		}
		else {
			return fibonacci(d-1) + fibonacci(d-2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d=4;
		NonLinearRecursion f = new NonLinearRecursion();
		System.out.println("Fibonacci ["+ f.fibonacci(d)+"] value [" + d +"]");

	}

}
