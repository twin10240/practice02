package tv;

public class WatchTV {
	public static void main(String[] args) {
		TV tv = new TV(7, 20, false);
		
		tv.status();
		
		tv.Power(true);
		tv.volume(120);
		tv.status();
		
		tv.volume(false);
		tv.status();
		
		tv.channel(0);
		tv.status();
		
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();
		
		tv.Power(false);
		tv.status();
	}

}
