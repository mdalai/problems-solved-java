package jp3;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class resolvePaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystem fs = FileSystems.getDefault();
		Path p = fs.getPath("C:\\Users\\minga\\Downloads\\CUW\\2017T2 MBA-523");
		Path p1 = Paths.get("NIO2/Path");
		
		Path p12 = p.resolve(p1.toString());
		Path p21 = p1.resolve(p.toString());
		
		System.out.println(p);
		System.out.println(p1);
		System.out.println(p12);
		System.out.println(p21);
		
		Path[] ps = new Path[3];
		ps[0] = Paths.get("C:/java/workspace/StudyTest/src/jp3/files/tempFile.txt");
		ps[1] = Paths.get("src/jp3/files");
		ps[2] = Paths.get("tempFile.txt");
		
		System.out.println("File Path ps[0] [" + ps[0] + "]");
		System.out.println("File Path ps[1] [" + ps[1] + "]");
		System.out.println("File Path ps[2] [" + ps[2] + "]");

	}

}
