package tv;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public TV() {}
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
//	isPower()
	
	public void Power(boolean power) {
		this.power = power;
	}
	
	public void channel(int channel){
		if (channel >= 1 && channel <= 255) {
			this.channel = channel;
		}
	}
	
	public void channel(boolean b) {
		if (b) {
			if (this.channel > 255) {
				this.channel = 1;
			}else{
				this.channel++;
			}
		}else{
			if (this.channel < 1) {
				this.channel = 255;
			}else{
				this.channel--;
			}
		}
	}
	
	public void volume(int volume){
		if (volume >= 1 && volume <= 100) {
			this.volume = volume;
		}
	}
	
	public void volume(boolean b) {
		if (b) {
			if (this.volume > 100) {
				this.volume = 1;
			}else{
				this.volume++;
			}
		}else{
			if (this.volume < 1) {
				this.volume = 100;
			}else{
				this.volume--;
			}
		}
	}
	
	public void status() {
		System.out.println("[channel : " + channel + ", volume : " + volume + ", power : " + power + "]");
	}
}
