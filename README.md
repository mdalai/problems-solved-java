# problems-solved-java
Solving interesting problems with java; More for a learning purpose;

1. **Palindrome**: find out if a string is palindrome, for example, deed, level are palindrome.
   * get the length
   * compare 1st and last letter using a loop
   * <Palindrome.java>
2. **Decode secret message**: Decode secret message composed of code into the readable message. <DecodeSecretMsg.java>
3. **Anagram**: An anagram is a word or a phrase made by transposing the letters of another word or phrase; for example, "parliament" is an anagram of "partial men," and "software" is an anagram of "swear oft." Write a program that figures out whether one string is an anagram of another string. The program should ignore whitespace and punctuation.
   * get the lengths of two words ignoring the space
   * compare the length of two words if not equals it is NOT an anagram.
   * pick up a letter from both words and remove the letter from both words; loop the process till two word strings are empty;
   * <Anagram.java>
4. **Matrix Operation**: Write a program that take in two matrices and then allow the user to choose to add, subtract, or multiply them and display the answer.
   * Show menu, enter matrix, A+B, A-B, A*B, show matrix;
   * A*B is hardest; 3 loops: sumArow = sumArow + A[r][j] * B[j][c];
   * <MatrixOperation.java>
5. **Card Game 1**: randomly add a card if user asks;  allow the user to continue to add cards to the hand until the number of points goes over 21 or the user decides not to add any more cards or the total number of cards is 5.
   * folder 'card1': <Card.java> <Main2.java>
   

# Java basic class form
```
public class template {
	// variables
	private int numSides;
	private boolean regular;
	
	// constructor 1 
	public template(){		
	}
	
	// constructor 2 
	public template(int num){
		numSides = num;
	}
	
	// constructor 3
	public template(int num, boolean reg){
		numSides = num;
		regular = reg;
	}	
	
	// setter method 1
	public void setNumSides(int num) {
		numSides = num;
	}
	
	// setter method 2
	public void setRegular(boolean reg){
		regular = reg;
	}	
	
	// getter method 1
	public int getNumSides(){
		return numSides;
	}
	
	// getter method 2
	public boolean getRegular(){
		return regular;
	}
}
```
