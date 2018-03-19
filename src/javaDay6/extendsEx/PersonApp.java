package javaDay6.extendsEx;

public class PersonApp {
	public static void main(String args[]) {
		
//		System.out.println("부모");
//		Person person = new Person("이상화", 31);
//		person.showInfo();
//		
//		System.out.println("자식");
//		Student student1 = new Student("서울고등학교");
//		student1.setName("아무개");
//		student1.setAge(23);
//		student1.showInfo();
//		Student	student2 = new Student("김개똥", 24, "한국고등학교");
//		student2.showInfo();
		Student s01 = new Student();
		s01.setName("이정재");
		s01.setAge(45);
		s01.setSchoolName("서울고등학교");
		s01.showInfo();
		
		Student s02 = new Student("이효리", 40, "제주고등학교");
		s02.showInfo();
		
		Person p = new Student();
		p.showInfo();
		
	}
}
