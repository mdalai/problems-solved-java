package problems;

import java.util.Scanner;

public class DecodeSecretMsg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String code = "1234567";
		String decode = "DWELHOR";
		
		String msg ="" ;	
		Scanner in = new Scanner(System.in);		
		do {
			String c1 = in.next();
			if (code.indexOf(c1)==-1){
				System.out.println("Please re-enter a code within [1,7]:");
				continue;
			}
			
			msg += c1;			
		} while(msg.length()<10);
		
		System.out.println("Input: "+ msg);
		
		String msg_new="";		
		for (int i=0; i<msg.length(); i++){
			msg_new += decode.charAt(code.indexOf(msg.charAt(i)));
		}
		
		System.out.println("Output: "+ msg_new);

	}

}
