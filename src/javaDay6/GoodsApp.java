package javaDay6;

public class GoodsApp {
	public static void main(String args[]) {
		Goods camera = new Goods("니콘", 800000);
		System.out.println(camera.getCount());
		
		Goods cup = new Goods("머그컵", 2000);
		System.out.println(cup.getCount());
		
		
	}
}
