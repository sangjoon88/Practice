
public class TV {

	String color;                         //변수
	boolean power;                //변수
	int channel;						//변수
	
	void power() {					//TV를 켜거나 끄는 기능을 하는 method
		power=!power;
	}
	
	void channelUp() {				//TV의 채널을 높이는 기능을 하는 method
		++channel;
	}
	
	void channelDown() {			//TV의 채널은 낮추는 기능을 하는 method
		--channel;
}

	class TvTest {
		public static void main(String args[]) {
			TV t;
			t=new TV();
			t.channel=7;
			t.channelDown();
			
			System.out.println("현재 채널은" + " + t.channel + " + "입니다.");
			
		}
	}
	
}