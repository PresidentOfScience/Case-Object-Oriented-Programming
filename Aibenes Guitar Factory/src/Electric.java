
public class Electric {
	private String guitarSoundType;
	private int switchPos;
	private int tone;
	private int volume;
	
	public Electric(int switchPos, int tone, int volume) {
		super();
		this.switchPos = switchPos;
		this.tone = tone;
		this.volume = volume;
		if(switchPos == 1) {
			guitarSoundType = "Funk";
		}
		else if(switchPos == 2) {
			guitarSoundType = "Jazz";
		}
		else if(switchPos == 3) {
			guitarSoundType = "Blues";
		}
		else if(switchPos == 4) {
			guitarSoundType = "Rock";
		}
	}

	public int getSwitchPos() {
		return switchPos;
	}

	public void setSwitchPos(int switchPos) {
		this.switchPos = switchPos;
	}

	public int getTone() {
		return tone;
	}

	public void setTone(int tone) {
		this.tone = tone;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getGuitarSoundType() {
		return guitarSoundType;
	}

	public void setGuitarSoundType(String guitarSoundType) {
		this.guitarSoundType = guitarSoundType;
	}
	
}
