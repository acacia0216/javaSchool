package javaDay5.ex05;

public class Tv {
	private int ch, vol;
	private boolean pow;
	
	public Tv() {}
	
	public Tv(int ch, int vol, boolean pow) {
		this.ch = ch;
		this.vol = vol;
		this.pow = pow;
	}
	
	
	public void setPow(boolean pow) {//전원관리
		this.pow = pow;
		if(pow == true)
			System.out.println("전원이 켜졌습니다.");
		else if(pow == false)
			System.out.println("전원이 꺼졌습니다.");
	}
	public void setVol(int vol) {//음량 셋팅
		if(vol<0)
			this.vol += 0;
		else if(vol>100)
			this.vol += 0;
		else
		this.vol = vol;
	}
	public void setVol(boolean vol) {//음량 조절
		if(vol == true)
			{
			this.vol += 1;
			if(this.vol>100)
				this.vol = 100;
			}
		else if(vol == false)
			{
			this.vol -= 1;
			if(this.vol<0)
				this.vol = 1;
			}
	}
	public void setCh(int ch) {//채널 셋팅
		if(ch<1)
		{
			this.ch += 0;
		}
		else if(ch>255)
			{
			this.ch += 0;
			}
		else
			{
			this.ch = ch;
			}
	}
	public void setCh(boolean ch) {//채널 조정
		if(ch == true)
			{
			this.ch += 1;
			if(this.ch>255)
				this.ch += 0;
			}
		else if(ch == false)
			{
			this.ch -= 1;
			if(this.ch<1)
				this.ch += 0;
			}
	}
	public void status() {//상태
		System.out.println("TV 상태 : "+pow);
		System.out.println("현재 채널 : "+ch);
		System.out.println("현재 음량 : "+vol);
		System.out.println();
	}
}
