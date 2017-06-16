import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suitNumber = (int)(Math.random()*4.0+1);           
		int faceNumber = (int)(Math.random()*13.0+1);   
		int suitNumber2 = (int)(Math.random()*4.0+1);           
		int faceNumber2 = (int)(Math.random()*13.0+1); 
		Card newCard1 = new Card(suitNumber,faceNumber);
		Card newCard2 = new Card(suitNumber2,faceNumber2);  
		System.out.println("card 1: " + newCard1.name+" "+newCard1.points);
		System.out.println("card 2: " +newCard2.name+" "+newCard2.points);
		
		Scanner in = new Scanner(System.in);
		int i = 3;
		int points = newCard1.points + newCard2.points;
		while (i < 6){
			System.out.println("Would you like to have another card? Y/N"); 
			char ans = in.next().charAt(0);
			if (ans == 'Y') {
				int suitNumberX = (int)(Math.random()*4.0+1);
				int faceNumberX = (int)(Math.random()*13.0+1); 
				Card newCardX = new Card(suitNumberX,faceNumberX);
				System.out.println("card "+i+": " +newCardX.name+" "+newCardX.points);
				i +=1;
				points += newCardX.points;
				System.out.println("TOTAL Points: " + points);
			} 
			else {
				break;				
			}
			
			// STOP if points goes over 21
			if (points > 21) {
				break;				
			}
				
		
		}
		

	}

}
