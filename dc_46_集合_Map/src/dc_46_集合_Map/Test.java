package dc_46_����_Map;
/*
 * �ֵ����
 * 
 * */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String,String>();
		//���,������ֵ��һ��Ϊnull�������������ظ����������ظ�����ֵ
		map.put("name", "����");
		map.put("age", "18");
		String age = map.put("age", "18");
		System.out.println(age);
		System.out.println(map);
		//��ȡ
		System.out.println(map.get("name"));
		//�Ƴ�
		map.remove("name");
		System.out.println(map.get("name"));
		//keyset����������
		map.put("name", "����");
		System.out.println("=========");
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(map.get(string));
			
		}
	}

}
