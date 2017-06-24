package jp3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {

	public static void main(String[] args) {
		//replace charactors with 
		String line = "e E f F G g";
		line = line.replaceAll("e", "b");
		line = line.replaceAll("E", "A");
		line = line.replaceAll("f", "c");
		line = line.replaceAll("F", "D");
		System.out.println(line);
		
		// Patter and Matcher
		Pattern p = Pattern.compile("(J|j)ava");
		String str = "Java courses have a lot homeworks. Good luck.";
		System.out.println(str);
		Matcher m = p.matcher(str);
		str = m.replaceAll("Oracle");
		System.out.println(str);


	}

}
