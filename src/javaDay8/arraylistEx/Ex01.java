package javaDay8.arraylistEx;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		Long start = System.currentTimeMillis();
		
		
		List<Point> al = new ArrayList<Point>();
		
		Point p1 = new Point(4,5);
		Point p2 = new Point(5,1);
		Point p3 = new Point(9,2);
		Point p4 = new Point(7,2);
		Point p5 = new Point(6,7);
		Point p6 = new Point(3,8);
		
		al.add(p1);//추가
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		al.add(p6);
		
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i).toString());
		}
		System.out.println("==========================");
		
		for(Point pp:al)
		{
			System.out.println(pp.toString());
		}
		System.out.println("==========================");
		
		al.remove(1);
		
		for(Point pp:al)
		{
			System.out.println(pp.toString());
		}
		
		System.out.println("==========================");
		al.add(1, p2);
		for(Point pp:al)
		{
			System.out.println(pp.toString());
		}
		
		
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		
		al.remove(3);//삭제
		
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		
		al.set(1, p4);//셋팅(치환)
		
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		
		if(al.isEmpty())
		{
			System.out.println("비어있음");
		}
		else
		{
			if(al.contains(p2))
				System.out.println("p4가 있네");
			else
			{
				al.add(p2);
				System.out.println("p2가 추가되었음");
			}
		}
		
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		
		
		
		while(!al.isEmpty())
		{
			al.remove(0);
			System.out.println("삭제");
		}
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		if(al.isEmpty())
		{
			System.out.println("비어있음");
		}
		else
		{
			System.out.println("안비었음");
		}
		
		
		al.add(p1);//추가
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		al.add(p6);
		
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i).toString());
		}
		System.out.println("==========================");
		
		for(Point pp:al)
		{
			System.out.println(pp.toString());
		}
		System.out.println("==========================");
		
		al.remove(1);
		
		for(Point pp:al)
		{
			System.out.println(pp.toString());
		}
		
		System.out.println("==========================");
		al.add(1, p2);
		for(Point pp:al)
		{
			System.out.println(pp.toString());
		}
		
		
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		
		al.remove(3);//삭제
		
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		
		al.set(1, p4);//셋팅(치환)
		
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		
		if(al.isEmpty())
		{
			System.out.println("비어있음");
		}
		else
		{
			if(al.contains(p2))
				System.out.println("p4가 있네");
			else
			{
				al.add(p2);
				System.out.println("p2가 추가되었음");
			}
		}
		
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		
		
		
		while(!al.isEmpty())
		{
			al.remove(0);
			System.out.println("삭제");
		}
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		if(al.isEmpty())
		{
			System.out.println("비어있음");
		}
		else
		{
			System.out.println("안비었음");
		}
		al.add(p1);//추가
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		al.add(p6);
		
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i).toString());
		}
		System.out.println("==========================");
		
		for(Point pp:al)
		{
			System.out.println(pp.toString());
		}
		System.out.println("==========================");
		
		al.remove(1);
		
		for(Point pp:al)
		{
			System.out.println(pp.toString());
		}
		
		System.out.println("==========================");
		al.add(1, p2);
		for(Point pp:al)
		{
			System.out.println(pp.toString());
		}
		
		
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		
		al.remove(3);//삭제
		
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		
		al.set(1, p4);//셋팅(치환)
		
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		
		if(al.isEmpty())
		{
			System.out.println("비어있음");
		}
		else
		{
			if(al.contains(p2))
				System.out.println("p4가 있네");
			else
			{
				al.add(p2);
				System.out.println("p2가 추가되었음");
			}
		}
		
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		
		
		
		while(!al.isEmpty())
		{
			al.remove(0);
			System.out.println("삭제");
		}
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		if(al.isEmpty())
		{
			System.out.println("비어있음");
		}
		else
		{
			System.out.println("안비었음");
		}
		
		
		al.add(p1);//추가
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		al.add(p6);
		
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i).toString());
		}
		System.out.println("==========================");
		
		for(Point pp:al)
		{
			System.out.println(pp.toString());
		}
		System.out.println("==========================");
		
		al.remove(1);
		
		for(Point pp:al)
		{
			System.out.println(pp.toString());
		}
		
		System.out.println("==========================");
		al.add(1, p2);
		for(Point pp:al)
		{
			System.out.println(pp.toString());
		}
		
		
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		
		al.remove(3);//삭제
		
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		
		al.set(1, p4);//셋팅(치환)
		
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		
		if(al.isEmpty())
		{
			System.out.println("비어있음");
		}
		else
		{
			if(al.contains(p2))
				System.out.println("p4가 있네");
			else
			{
				al.add(p2);
				System.out.println("p2가 추가되었음");
			}
		}
		
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		
		
		
		while(!al.isEmpty())
		{
			al.remove(0);
			System.out.println("삭제");
		}
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		if(al.isEmpty())
		{
			System.out.println("비어있음");
		}
		else
		{
			System.out.println("안비었음");
		}
		al.add(p1);//추가
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		al.add(p6);
		
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i).toString());
		}
		System.out.println("==========================");
		
		for(Point pp:al)
		{
			System.out.println(pp.toString());
		}
		System.out.println("==========================");
		
		al.remove(1);
		
		for(Point pp:al)
		{
			System.out.println(pp.toString());
		}
		
		System.out.println("==========================");
		al.add(1, p2);
		for(Point pp:al)
		{
			System.out.println(pp.toString());
		}
		
		
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		
		al.remove(3);//삭제
		
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		
		al.set(1, p4);//셋팅(치환)
		
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		
		if(al.isEmpty())
		{
			System.out.println("비어있음");
		}
		else
		{
			if(al.contains(p2))
				System.out.println("p4가 있네");
			else
			{
				al.add(p2);
				System.out.println("p2가 추가되었음");
			}
		}
		
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		
		
		
		while(!al.isEmpty())
		{
			al.remove(0);
			System.out.println("삭제");
		}
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		if(al.isEmpty())
		{
			System.out.println("비어있음");
		}
		else
		{
			System.out.println("안비었음");
		}
		
		
		al.add(p1);//추가
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		al.add(p6);
		
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i).toString());
		}
		System.out.println("==========================");
		
		for(Point pp:al)
		{
			System.out.println(pp.toString());
		}
		System.out.println("==========================");
		
		al.remove(1);
		
		for(Point pp:al)
		{
			System.out.println(pp.toString());
		}
		
		System.out.println("==========================");
		al.add(1, p2);
		for(Point pp:al)
		{
			System.out.println(pp.toString());
		}
		
		
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		
		al.remove(3);//삭제
		
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		
		al.set(1, p4);//셋팅(치환)
		
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		
		if(al.isEmpty())
		{
			System.out.println("비어있음");
		}
		else
		{
			if(al.contains(p2))
				System.out.println("p4가 있네");
			else
			{
				al.add(p2);
				System.out.println("p2가 추가되었음");
			}
		}
		
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		
		
		
		while(!al.isEmpty())
		{
			al.remove(0);
			System.out.println("삭제");
		}
		System.out.println("현재 리스트 갯수 : "+al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(i+1+"번 : "+al.get(i));
		}
		if(al.isEmpty())
		{
			System.out.println("비어있음");
		}
		else
		{
			System.out.println("안비었음");
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start+"ms");
	}

}
