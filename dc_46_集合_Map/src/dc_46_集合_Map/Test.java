package dc_46_集合_Map;
/*
 * 字典理解
 * 
 * */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String,String>();
		//添加,并返回值，一般为null，但是如果添加重复键，返回重复键的值
		map.put("name", "单车");
		map.put("age", "18");
		String age = map.put("age", "18");
		System.out.println(age);
		System.out.println(map);
		//获取
		System.out.println(map.get("name"));
		//移除
		map.remove("name");
		System.out.println(map.get("name"));
		//keyset方法，遍历
		map.put("name", "单车");
		System.out.println("=========");
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(map.get(string));
			
		}
	}

}
