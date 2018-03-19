package javaDay5.ex02;

public class Goods {

	private String name;
	private int price;
	
	public Goods() {}//객체생성 담당
	
	public Goods(String name) {//초기화담당
		
		this.name = name;
	}
	public Goods(String name, int price) {//초기화담당
		
		this(name);//다른생성자호출
		
		if(price<0)	{this.price = 0;}
		else {this.price = price;}
	}
public Goods(int price, String name) {//초기화담당
		
		this.name = name;
		
		if(price<0)	{this.price = 0;}
		else {this.price = price;}
	}

	public void setName(String name) {//셋팅담당
		this.name = name;
	}
	public void setPrice(int price)	{//셋팅담당
		if(price<0)
		{this.price = 0;}
		this.price = price;
	}
	public String getName() {//리턴담당
		return this.name;
	}
	public int getPrice() {//리턴담당
		if(price<0)
		{this.price = 0;}
		return this.price;
	}
	
	public void showInfo() {//출력담당
		System.out.println("================");
		System.out.println(this.name+" // "+this.price+"원");
		System.out.println("================");
	}
}
