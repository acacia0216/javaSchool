package javaDay7;

import java.util.Scanner;

public class ShapeApp {
	public static void main(String args[]) {

		Shape[] sArray = new Shape[6];
		
		Triangle t1 = new Triangle("분홍","분홍",3,7);
		Triangle t2 = new Triangle("빨강", "빨강",3,5);
		
		Ractangle r1 = new Ractangle("하늘","하늘",7,9);
		Ractangle r2 = new Ractangle("파랑", "파랑",3,5);
		
		Circle c1 = new Circle("연두","연두");
		c1.setRadius(3);
		Circle c2 = new Circle("초록", "초록");
		c2.setRadius(7);
		
		sArray[0] = t1;
		sArray[1] = t2;
		sArray[2] = r1;
		sArray[3] = r2;
		sArray[4] = c1;
		sArray[5] = c2;
		
		System.out.println("========예제========");
		for(int i=0; i<sArray.length; i++)
		{
			sArray[i].draw();
			System.out.println("넓이 : "+sArray[i].area());
			System.out.println();
		}
		System.out.println("========예제========");
		while(true) {
		System.out.println("그릴 모양을 선택해주세요");
		System.out.println("1. 삼각형");
		System.out.println("2. 사각형");
		System.out.println("3. 원형");
		System.out.println("4. 종료");
		
		Scanner sc = new Scanner(System.in);
		Scanner csc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		
		
		switch(num)
		{
		case 1:Triangle t5 = new Triangle();
		System.out.print("선 색 : ");
		t5.setLineColor(csc.nextLine());
		System.out.print("면 색 : ");
		t5.setFillColor(csc.nextLine());
		System.out.print("높이 : ");
		t5.setHeight(sc.nextInt());
		System.out.print("가로 : ");
		t5.setWidth(sc.nextInt());
		System.out.println("어떤작업을 실행할까요 : ");
		System.out.println("1. 그리기");
		System.out.println("2. 넓이 구하기");
		System.out.println("3. 처음으로 돌아가기");
		num = sc.nextInt();
		while(true) {	
		switch(num)
			{
			case 1:t5.draw();
			continue;
			case 2:System.out.println(t5.area());
			continue;
			case 3: break;
			}
		}
		
		
		case 2:Ractangle r5 = new Ractangle();
		System.out.print("선 색 : ");
		r5.setLineColor(csc.nextLine());
		System.out.print("면 색 : ");
		r5.setFillColor(csc.nextLine());
		System.out.print("높이 : ");
		r5.setHeight(sc.nextInt());
		System.out.print("가로 : ");
		r5.setWidth(sc.nextInt());
		System.out.println("어떤작업을 실행할까요 : ");
		System.out.println("1. 그리기");
		System.out.println("2. 넓이 구하기");
		System.out.println("3. 처음으로 돌아가기");
		num = sc.nextInt();
			switch(num)
			{
			case 1:r5.draw();
			continue;
			case 2:System.out.println(r5.area());
			continue;
			case 3: break;
			}

			
		case 3:Circle c5 = new Circle();
		System.out.print("선 색 : ");
		c5.setLineColor(csc.nextLine());
		System.out.print("면 색 : ");
		c5.setFillColor(csc.nextLine());
		System.out.print("반지름 : ");
		c5.setRadius(sc.nextInt());
		System.out.println("어떤작업을 실행할까요 : ");
		System.out.println("1. 그리기");
		System.out.println("2. 넓이 구하기");
		System.out.println("3. 처음으로 돌아가기");
		num = sc.nextInt();
			switch(num)
			{
			case 1:c5.draw();
			continue;
			case 2:System.out.println(c5.area());
			continue;
			case 3: break;
			}
		
			
		case 4:
			System.out.println("종료합니다.");
		sc.close();
		csc.close();
		System.exit(0);
		}
		}
		
		
	}
}
