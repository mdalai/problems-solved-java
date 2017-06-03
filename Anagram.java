package problems;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a phrase:");
		String w1 = in.nextLine();
		System.out.println("Enter another phrase:");
		String w2 = in.nextLine();
		boolean isAnagram = true;
		// remove all white spaces using regular expression
		w1 = w1.replaceAll("\\s","");
		w2 = w2.replaceAll("\\s","");
		
		if (w1.length() != w2.length())
			isAnagram = false;
		else {
			char a_char;
			int i = 0;
			while (i < w1.length()){
				if(w1=="n")
					break;
				a_char = w1.charAt(0);
				w1 = w1.replace(String.valueOf(a_char), "");
				if(w2.indexOf(String.valueOf(a_char))==-1){
					isAnagram = false;
					break;
				} else {
					w2 = w2.replace(String.valueOf(a_char), "");
				}	
				
				i++;				
			}
		}
		
		if(isAnagram)
			System.out.println("These words are Anagram.");
		else
			System.out.println("These words are NOT Anagram.");

	}

}
