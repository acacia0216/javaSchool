package javaDay6.extendsEx;

public class Student extends Person{
	//필드
	/*String name , int age 부모필드 가져옴*/
	public String schoolName;
	
	//생성자
	public Student() {
		System.out.println("student()");
	}

	public Student(String schoolName) {
		super();
		this.schoolName = schoolName;
	}
	public Student(String name, int age, String schoolName) {//부모필드 가져와서 내것처럼 사용
		super(name, age);
		this.schoolName = schoolName;
	}
	//메소드
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public void showInfo() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
//		super.showInfo();
		System.out.println("학교명 : "+schoolName);
		System.out.println();
	}
}
