package dc_81_��������л��ͷ����л�;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//ע�⣺��̬�������ܱ����л�
public class Test {

	public static void main(String[] args)throws IOException, ClassNotFoundException {
		//���л�
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/person.txt"));
		Person person = new Person("danche", 18);
		objectOutputStream.writeObject(person);
		objectOutputStream.close();
		//�����л���
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/person.txt"));
		Person person2 = (Person) objectInputStream.readObject();
		//�����ӡ age = 18����Ϊ������д���ǣ��Ѿ��������࣬�����age��ֵ18�����ԣ�����Ҳ��18
		System.out.println(person2);
		objectInputStream.close();
	}

}
