package jp3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	
	public static void serialize(String outFile, Object serializableObject) throws IOException {
		FileOutputStream fos = new FileOutputStream(outFile);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(serializableObject);
	}
	
	public static Object deSerialize(String serializedObject) throws FileNotFoundException, IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(serializedObject);
		ObjectInputStream ois = new ObjectInputStream(fis);
		return ois.readObject();
	}

}
