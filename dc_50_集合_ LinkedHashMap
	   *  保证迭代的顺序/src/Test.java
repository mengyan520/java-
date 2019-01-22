import java.util.LinkedHashMap;

/*
 * LinkedHashMap继承HashMap
 * 保证迭代的顺序
 * */
public class Test {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
		linkedHashMap.put("a", 1);
		linkedHashMap.put("b", 2);
		linkedHashMap.put("c", 3);
		System.out.println(linkedHashMap);
	}

}
