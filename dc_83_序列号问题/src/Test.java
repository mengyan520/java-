

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args)throws IOException,ClassNotFoundException {
		File file = new File("src/person.txt");
		writeFile(file);
		readFile(file);
	}

	// 序列化
	public static void readFile(File file)throws IOException, ClassNotFoundException {
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
		Person person = (Person) objectInputStream.readObject();
		System.out.println(person);
		objectInputStream.close();
		
	}

	// 反序列化
	public static void writeFile(File file)throws IOException {
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
		Person person = new Person("单车", 20);
		objectOutputStream.writeObject(person);
		objectOutputStream.close();
	}
}
