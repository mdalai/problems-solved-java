package studyTool;

public class Fish {
	String typeOfFish;
	int friendliness;
	
	public Fish(){
		typeOfFish = "Unknown";
		friendliness = 3;		
	}
	
	public Fish(String t, int f){
		typeOfFish = t;
		friendliness = f;		
	}
	
	public int getFriendliness(){
		return friendliness;
	}
	
	
	// variable argument
	public static Fish nicestFish(Fish ... numFish) {
		Fish temp = new Fish();
		temp = numFish[0];
		for (int i=0; i< numFish.length; i++){
			temp = numFish[i].getFriendliness() > temp.getFriendliness()? numFish[i]:temp;
		}
		return temp;
	}
	
	// Main method	
	public static void main(String[] args)  {
		Fish amber = new Fish("AngelFish",5);
		Fish james = new Fish("Guppy",3);
		
		Fish nFish = new Fish();
		nFish = nicestFish(amber,james);
		System.out.println(nFish.getFriendliness());
	}

}
