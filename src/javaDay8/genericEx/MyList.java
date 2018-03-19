package javaDay8.genericEx;

public class MyList<T> {//배열관리

	private T [] oArray;
	private int crtPos;
	
	public MyList() {
		this.oArray = (T[])new Object[3];
		this.crtPos = 0;
	}
	
	public void add(T o) {
		oArray[crtPos] = o;
		crtPos++;
		if(crtPos>oArray.length-1)
		{
			crtPos = 0;
		}
	}
	
	public Object getget(int i) {
		return oArray[i];
		
	}
	
	public int size() {
		return crtPos;
	}
	
}
