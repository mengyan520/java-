package dc_48_集合_增强for循环;
/*
 * 注意：我们这里遍历的是set集合，不是Map，因为Map没有继承Iterable接口
 * */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			//key
			System.out.print(entry.getKey()+":");
			//value
			System.out.println(entry.getValue());
		}
	}

}
