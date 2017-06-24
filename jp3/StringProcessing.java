package jp3;

public class StringProcessing {

	public static void main(String[] args) {
		String str1 = "How are you teacher?";
		String str2 = "I am good!";
		String str1_b = reverse(str1);
		String str2_b = reverse(str2);
		
		System.out.println("----------Using String ----------");
		System.out.println("reverse= " +str1_b);
		System.out.println("reverse= " +str2_b);
		
		//backwardsDay(str1_b);
		//backwardsDay(str2_b);
		
		// StringBuilder
		StringBuilder str = new StringBuilder("How are you teacher?");
		System.out.println("---------Using StringBuilder ----------");
		System.out.println("reverse= " + str.reverse());

	}
	
	public static String backwardsDay(String original){    
		String backwards ="";    
		for(int i= original.length()-1; i>=0; i-- ) {
			backwards+=original.substring(i, i+1);
		}//endfor         
		System.out.println(backwards); 
		
		return backwards;
	}//end method backwardsDay
	

	 public static String reverse(String str){     
		 String strRev = "";     
		 for(int i=str.length()-1; i>=0; i--)        
			 strRev+=str.charAt(i);        
		 //endfor         
		 return strRev;  
	} 

}
