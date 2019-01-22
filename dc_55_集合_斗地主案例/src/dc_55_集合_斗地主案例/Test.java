package dc_55_集合_斗地主案例;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * 1.组合牌
 * 2.洗牌
 * 3.发牌
 * 4.看牌
 * */
public class Test {
	static HashMap<Integer, String> map;
	static ArrayList<Integer> arrayList;

	public static void main(String[] args) {
		// 组合牌
		createCards();
		// 洗牌
		Collections.shuffle(arrayList);
		//发牌
		licensingCards();
	}
	// 组合牌
	public static void createCards() {
		// 创建Map集合，key是编号，value是牌
		map = new HashMap<Integer, String>();
		// 创建List集合，存储编号
		arrayList = new ArrayList<Integer>();
		// 定义13个点数的数组
		String[] numbers = { "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3" };
		// 定义4个花色数组
		String[] colors = { "♠", "♥", "♣", "♦" };
		// 遍历数组，花色+点数的组合,存储到Map集合
		// 定义键，初始值为2,先忽略大小王
		int index = 2;
		for (String string : numbers) {
			for (String string2 : colors) {
				map.put(index, string2 + string);
				arrayList.add(index);
				index++;
			}
		}
		// 存储大小王
		map.put(0, "大王");
		arrayList.add(0);
		map.put(1, "小王");
		arrayList.add(1);
	}
	//发牌功能,将牌编号,发给玩家集合,底牌集合
	public static void licensingCards() {
		ArrayList<Integer> player1 = new ArrayList<Integer>();
		ArrayList<Integer> player2 = new ArrayList<Integer>();
		ArrayList<Integer> player3 = new ArrayList<Integer>();
		ArrayList<Integer> bottom = new ArrayList<Integer>();
		
		for (int i = 0; i < arrayList.size(); i++) {
			if (i<3) {
				bottom.add(arrayList.get(i));
				continue;
			}
			if (i%3==0) {
				player1.add(arrayList.get(i));
			}else if (i%3==1) {
				player2.add(arrayList.get(i));
			}else {
				player3.add(arrayList.get(i));
			}
		}
		//排序
		Collections.sort(player1);
		Collections.sort(player2);
		Collections.sort(player3);
		//看牌
		look("地主",player1, map);
		look("农民",player2, map);
		look("农民",player3, map);
		look("底牌",bottom, map);
	}
	//看牌,将玩家手中的编号,到Map集合中查找,根据键找值
	public static void look(String name, ArrayList<Integer> player, Map<Integer, String> map) {
		System.out.print(name+" ");
		for (Integer integer : player) {
			System.out.print(map.get(integer)+" ");
		}
		System.out.println();
	}
	
}
