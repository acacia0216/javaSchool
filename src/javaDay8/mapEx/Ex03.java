package javaDay8.mapEx;

import java.util.HashMap;
import java.util.Map;

public class Ex03 {
	public static void main(String args[]) {
		
		Map<String, Point> map = new HashMap<String, Point>();
		
		Point p1 = new Point(1,1);
		Point p2 = new Point(2,2);
		Point p3 = new Point(3,3);
		Point p4 = new Point(4,4);
		Point p5 = new Point(5,5);
		
		map.put("1번", p1);
		map.put("2번", p2);
		map.put("3번", p3);
		map.put("4번", p4);
		map.put("5번", p5);
		
		System.out.println(map.get("1번"));//1번에 뭐들었냐
		System.out.println(map.size());//몇개들었냐
		System.out.println(map.isEmpty());//비었냐
		System.out.println(map.containsKey("4번"));//4번이라는 키가 있냐
		System.out.println(map.values());//값 모두출력
		System.out.println(map.keySet());//키 모두출력
		System.out.println(map.toString());//키,값 모두 출력
		
		
		
		
	}
}
