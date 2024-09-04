
public class Heels extends Footwear {
	private float height;

	public Heels(String name, long price, float height) {
		super(name, price);
		this.height = height;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
}
