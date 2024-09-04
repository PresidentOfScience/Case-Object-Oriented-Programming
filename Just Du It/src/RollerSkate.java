
public class RollerSkate extends Footwear {
	private int wheel;

	public RollerSkate(String name, long price, int wheel) {
		super(name, price);
		this.wheel = wheel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	
}
