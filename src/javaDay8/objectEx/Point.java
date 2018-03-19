package javaDay8.objectEx;

public class Point {
	   private int x;
	   private int y; 
	   
	   public Point( int x, int y ) {
	     this.x = x;
	     this.y = y;  
	   }

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	   

	public boolean equals(Point p)
	{
		if(x==p.x && y==p.y)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}