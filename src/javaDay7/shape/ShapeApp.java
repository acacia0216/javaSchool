package javaDay7.shape;

public class ShapeApp {
	public static void main(String args[]) {

//		Shape[] sArray = new Shape[6];
//		
//		Shape t1 = new Triangle("분홍","분홍",3,7);
//		Shape t2 = new Triangle("빨강", "빨강",3,5);
//		
//		Shape r1 = new Ractangle("하늘","하늘",7,9);
//		Shape r2 = new Ractangle("파랑", "파랑",3,5);
//		
//		Shape c1 = new Circle("연두","연두",5);
//		Shape c2 = new Circle("초록", "초록",7);
//		
//		
//		sArray[0] = t1;
//		sArray[1] = t2;
//		sArray[2] = r1;
//		sArray[3] = r2;
//		sArray[4] = c1;
//		sArray[5] = c2;
//		
//		for(int i=0; i<sArray.length; i++)
//		{
//			sArray[i].draw();
//			sArray[i].area();
//		}
		
		Drawable[] dArray = new Drawable[4];
		
		Drawable t1 = new Triangle("빨강","빨강",5,4);
		Drawable r1 = new Ractangle("노랑","노랑",2,9);
		Drawable c1 = new Circle("파랑","파랑",7);
		Drawable p1 = new Point(5,6);
		
		dArray[0] = t1;
		dArray[1] = r1;
		dArray[2] = c1;
		dArray[3] = p1;
		
		for(int i=0; i<dArray.length; i++)
		{
			dArray[i].draw();
		}
		System.out.println("삼각형 넓이");
		for(int i=0; i<dArray.length; i++)
		{
			if(dArray[i] instanceof Triangle) {
				((Triangle)dArray[i]).area();
			}
		}
		for(int i=0; i<dArray.length; i++)
		{
			if(dArray[i] instanceof Shape)
			{
				((Shape)dArray[i]).area();
			}
		}
	}
}
