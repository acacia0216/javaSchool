package javaDay2.indentifier;

public class Ex07 {
	public static void main(String args[]) {
		
		String str = "굿모닝";
		int i = 2000;
		double d = 3.14;
		String name = "이상화";
		
		System.out.println("안녕하세요");
		System.out.println(str);
		System.out.println();
		
		System.out.print("안녕");
		System.out.println("하세요");
		System.out.println();
		
		System.out.println(str + " " + str + "하십니까");
		System.out.println();
		
		System.out.println(str + i);
		System.out.println(str + d);
		System.out.println(String.valueOf(i) +" + "+ String.valueOf(d));
		System.out.println();
		
		System.out.println("제 이름은 "+name+" 입니다.");
		System.out.println();
		
		System.out.println("=============================================");
		System.out.println("안녕\n하세요");
		System.out.println("안녕\t하세요");
		System.out.println("안녕\"하\"세요");
		System.out.println("안녕\\하세요");
	}
}
