package problems;

import java.util.Scanner;

public class MatrixOperation {
	
	//private int row, col;
	private static int[][] matrixA;
	private static int[][] matrixB;
	private static int[][] matrixResult;
	private static String[] arrStr;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char menuInp;
		int row,col;
		boolean loopExit = true;
		while(loopExit) {	
			System.out.println("Menu:  \n A. Enter Matrix A \n B. Enter Matrix B \n C. A + B \n D. A - B \n E. A * B \n F. exit");
			menuInp = in.next().charAt(0);
			switch (menuInp){
			case 'A':
				System.out.println("enter Matrix A row number:");
				row = in.nextInt();
				System.out.println("enter Matrix A column number:");
				col = in.nextInt();
				matrixA = inputMatrix(row,col);
				System.out.println("A=");
				printMatrix(matrixA);
				break;
			case 'B':
				System.out.println("enter Matrix B row number:");
				row = in.nextInt();
				System.out.println("enter Matrix B column number:");
				col = in.nextInt();
				matrixB = inputMatrix(row,col);
				System.out.println("B=");
				printMatrix(matrixB);
				break;
			case 'C':
				matrixResult = addMatrix(matrixA,matrixB);
				System.out.println("A + B =");
				printMatrix(matrixResult);
				break;
			case 'D':
				matrixResult = substractMatrix(matrixA,matrixB);
				System.out.println("A - B =");
				printMatrix(matrixResult);
				break;
			case 'E':
				matrixResult = timesMatrix(matrixA,matrixB);
				System.out.println("A * B =");
				printMatrix(matrixResult);
				break;
			case 'F':
				loopExit = false;
				break;
			default:
				System.out.println("Invalid operator.");		
			}
		
		}
		
		System.out.println("Exit Successfully.");		
		

	}
	
	// Input matrix 
	public static int[][] inputMatrix(int row, int col){ 
        int[][] matrix = new int[row][col]; 
        Scanner in = new Scanner(System.in);
        for(int r = 0; r< matrix.length; r++){     	        	
        	System.out.println("Matrix["+row+"]["+col+"] enter row "+ (r+1)+ ":(" + col+" values comma seperated)");
        	arrStr = in.nextLine().split(",");
        	for (int c=0;c<arrStr.length;c++){
        		matrix[r][c] = Integer.parseInt(arrStr[c]); // convert string into int
        	}
        	//System.out.println();
              
          } 
        
        return matrix;
	}
	
	// print matrix
	public static void printMatrix(int[][] A){
		String str;
		for(int r = 0; r < A.length; r++){
			str = "";
			for(int c=0; c < A[r].length; c++){
				str = str + A[r][c] +" ";
			}
			System.out.println(str);
		}
	}
	
	// A + B
	public static int[][] addMatrix(int[][] A, int[][] B){
		int[][] C = new int[A.length][A[0].length];
		for(int r = 0; r < A.length; r++){
			for(int c=0; c < A[r].length; c++){
				C[r][c] = A[r][c] + B[r][c];
			}
		}
		return C;
	}
	
	// A - B
	public static int[][] substractMatrix(int[][] A, int[][] B){
			int[][] C = new int[A.length][A[0].length];
			for(int r = 0; r < A.length; r++){
				for(int c=0; c < A[r].length; c++){
					C[r][c] = A[r][c] - B[r][c];
				}
			}
			return C;
		}
	
	// A * B
	public static int[][] timesMatrix(int[][] A, int[][] B){
		if (A[0].length != B.length){
			return null;
		} else {
			int[][] C = new int[A.length][B[0].length];
			double sumArow;
			for(int r = 0; r < A.length; r++){
				for(int c=0; c < B[0].length; c++){
					sumArow = 0;
					for(int j=0; j < A[0].length; j++){
						sumArow = sumArow + A[r][j] * B[j][c];
					}
					C[r][c] = (int) sumArow;
				}					
			}
			
			return C;
		}		
	}

}
