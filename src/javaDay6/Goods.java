package javaDay6;

public class Goods {//Alt + Shift + s //getter,setter,constructor 자동생성 단축키
	private String name;
	private int price;
	private static int count;
		
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		plusCount();
	}
	
	private void plusCount() {
		count = count + 1;
	}
	
	public int getCount() {
		return count;
	}
	
}
