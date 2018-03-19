package javaDay6.extendsEx;

public class Person {
	protected String name;
	protected int age;
	
	
	public Person() {
		System.out.println("person()");
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void showInfo() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println();
	}
	
}
