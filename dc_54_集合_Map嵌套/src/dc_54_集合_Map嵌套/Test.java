package dc_54_集合_Map嵌套;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//Map集合的嵌套,Map中存储的还是Map集合
public class Test {

	public static void main(String[] args) {
		Map<String, Map<String, String>> map = new HashMap<String, Map<String,String>>();
		Map<String, String> subMap1 = new HashMap<String, String>();
		subMap1.put("a1", "1");
		map.put("a",subMap1);
		System.out.println(map);
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			Map<String, String> map2 = map.get(string);
			System.out.println(map2);
			for (String string2 : map2.keySet()) {
				System.out.print(string2+":");
				System.out.println(map2.get(string2));
			}
		}
		System.out.println("=========");
		Set<Entry<String, Map<String, String>>> set2 = map.entrySet();
		Iterator<Entry<String, Map<String, String>>> iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> entry = (Map.Entry<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>) iterator2
					.next();
			System.out.print(entry.getKey()+":");
			System.out.println(entry.getValue());
			for (String string2 : entry.getValue().keySet()) {
				System.out.print(string2+":");
				System.out.println(entry.getValue().get(string2));
			}
		}
	}

}
