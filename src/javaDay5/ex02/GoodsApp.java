package javaDay5.ex02;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class GoodsApp {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Scanner isc = new Scanner(System.in);
		Goods computer = new Goods();
//		computer.name = "LG그램";
//		computer.price = 1200000;
		
		Goods cup = new Goods();
//		cup.name = "머그컵";
//		cup.price = 5000;
//		
//		System.out.println(computer.name);
//		System.out.println(computer.price);
//		System.out.println(cup.name);
//		System.out.println(cup.price);
//		
//		cup.name = "맥주컵";
//		cup.price = 7000;
//		System.out.println(cup.name);
//		System.out.println(cup.price);
		
		computer.setName("LG그램");
		computer.setPrice(1200000);
		cup.setName("머그컵");
		cup.setPrice(5000);
		sc.close();
		isc.close();
		System.out.println(computer.getName());
		System.out.println(computer.getPrice());
		System.out.println(cup.getName());
		System.out.println(cup.getPrice());
		computer.showInfo();
		cup.showInfo();
		
		Goods gs1 = new Goods("모나미볼펜",500);
		gs1.showInfo();
		
		Goods gs2 = new Goods("동물볼펜",-600);
		gs2.showInfo();
		
		Goods gs3 = new Goods("꽃볼펜",800);
		gs3.showInfo();
		
	}
}
