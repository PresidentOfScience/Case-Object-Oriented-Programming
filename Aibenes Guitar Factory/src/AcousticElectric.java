
public class AcousticElectric extends Acoustic {
	private int tone;
	private int volume;
	
	public AcousticElectric(int soundType) {
		super(soundType);
		if(getSoundType() != 0) {
			setSoundType(0);
		}
		if(getSoundType() == 0) {
			setGuitarSoundType("crunch");
		}
		this.tone = 0;
		this.volume = 0;
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
	
}
