package dc_81_对象的序列化和反序列化;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//注意：静态遍历不能被序列化
public class Test {

	public static void main(String[] args)throws IOException, ClassNotFoundException {
		//序列化
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/person.txt"));
		Person person = new Person("danche", 18);
		objectOutputStream.writeObject(person);
		objectOutputStream.close();
		//反序列化，
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/person.txt"));
		Person person2 = (Person) objectInputStream.readObject();
		//这里打印 age = 18，因为，上面写入是，已经加载了类，给类的age赋值18，所以，这里也是18
		System.out.println(person2);
		objectInputStream.close();
	}

}
