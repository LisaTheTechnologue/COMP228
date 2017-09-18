package exercise4;

public class GameObject {

	int center;

	public int getCenter() {
		return center;
	}

	int velocity;

	public int getVelocity() {
		return velocity;
	}

	boolean state;

	public boolean isState() {
		return state;
	}

	int rotation;

	public int getRotation() {
		return rotation;
	}

	public GameObject(int center, int velocity, boolean state, int rotation) {
		super();
		this.center = center;
		this.velocity = velocity;
		this.state = state;
		this.rotation = rotation;
	}
	
}
