package jp3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date {
	public String month;
	public String day;    
	public String year;  
		    
	public Date(String m, String d, String y){  
		month=m;  day=d;  year=y; 
	}
	

	public static void main(String[] args) {
		ArrayList<Date> birthdays = new ArrayList<Date>();
		Pattern dateP;
		dateP = Pattern.compile("([0-9]{2})/([0-9]{2})/([0-9]{4})");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Birthday (MM/DD/YYYY): ");
		String bdate = in.nextLine();
		while(!bdate.equals("")){
			Matcher dateM = dateP.matcher(bdate);
			if(dateM.matches()){
				String month = dateM.group(1);
				String day = dateM.group(2);
				String year= dateM.group(3);
				Date bday = new Date(month,day,year);
				birthdays.add(bday);
				System.out.println("Adde a Birthday: "+bdate);
			}
			
			System.out.println("Enter a Birthday (MM/DD/YYYY): ");
			bdate = in.nextLine();
		}
		in.close();
		
		System.out.println(birthdays.size());

	}

}
