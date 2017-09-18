package exercise4;

public class GameObject {

	static int centerX;

	public int getCenterX() {
		return centerX;
	}

	static int centerY;

	public int getCenterY() {
		return centerY;
	}

	static double velocity;

	public double getVelocity() {
		return velocity;
	}

	static String state;

	public String getState() {
		return state;
	}

	static int rotation;

	public int getRotation() {
		return rotation;
	}

	public GameObject(int centerX, int centerY, double velocity, boolean state, int rotation) {
		super();
		this.centerX = centerX;
		this.centerY = centerY;
		this.velocity = velocity;
		if (state) {
			this.state = "alive";
		} else
			this.state = "dead";

		this.rotation = rotation;
	}

	public static String getGameObjInfo() {

		String stringFormat = String.format("Center: {%s,%s}%nVelocity: %s%nStatus: %s%nRotation: %s", centerX,centerY,velocity,state,rotation);

		return stringFormat;
	}
}
