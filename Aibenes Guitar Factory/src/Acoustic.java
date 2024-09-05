
public class Acoustic {
	private int soundType;
	private String guitarSoundType;

	public Acoustic(int soundType) {
		super();
		this.soundType = soundType;
		if(soundType == 0) {
			this.guitarSoundType = "warm";
		}
		else {
			this.guitarSoundType = "bright";
		}
	}

	public int getSoundType() {
		return soundType;
	}

	public void setSoundType(int soundType) {
		this.soundType = soundType;
	}
	
	public String getGuitarSoundType() {
		return guitarSoundType;
	}

	public void setGuitarSoundType(String guitarSoundType) {
		this.guitarSoundType = guitarSoundType;
	}

}
