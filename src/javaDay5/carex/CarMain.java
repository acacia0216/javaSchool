package javaDay5.carex;

public class CarMain {
	public static void main(String args[]) {
		CarEx carC = new CarEx();//carEx 인스턴스 생성
		String a = "자동차 달리다";
		String b = carC.run();//carEx인스턴스로 run매소드 호출
		String c = CarEx.run();
		
		if(b==(c))
			{System.out.println("참조 같음1");}
		else {System.out.println("참조 다름1");}
		
		if(b==(a))
			{System.out.println("참조 같음2");}
		else {System.out.println("참조 다름2");}
		
		if(c==(a))
			{System.out.println("참조 같음3");}
		else {System.out.println("참조 다름3");}
		
		if(b.equals(c))
		{System.out.println("참조 같음4");}
		else {System.out.println("참조 다름4");}
	
		if(b.equals(a))
			{System.out.println("참조 같음5");}
		else {System.out.println("참조 다름5");}
		
		if(c.equals(a))
			{System.out.println("참조 같음6");}
		else {System.out.println("참조 다름6");}
		
		
		CarEx carBus = new BusEx();
//		carBus.openDoor();//오류
		System.out.println(carBus.run());
		BusEx.openDoor();//???인스턴스 생성 없이 호출?
	}
}
