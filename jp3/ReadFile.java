package jp3;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line="", fileContent = "";
		try {
			FileReader f = new FileReader(new File("C:/java/workspace/StudyTest/src/jp3/files/tempFile.txt"));
			BufferedReader fileInput = new BufferedReader(f);
			line = fileInput.readLine();
			fileContent = line + "\n";
			while(line != null) {
				line = fileInput.readLine();
				if (line != null)
					fileContent += line + "\n";
			}
			
			fileInput.close();
		}//end try
		
		catch(EOFException eofe) {
			System.out.println("No more lines to read.");
		}
		
		catch(IOException ioe){
			System.out.println("Error reading file.");
			System.exit(0);
		}
		
		System.out.println(fileContent);

	}

}
