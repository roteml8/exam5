package exam5.question2;

public class Room {

	protected double width;
	protected double length;
	protected boolean hasAC;
	
	public Room(double width, double length, boolean hasAC) {
		
		setWidth(width);
		setLength(length);
		setHasAC(hasAC);
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public void setHasAC(boolean hasAC) {
		this.hasAC = hasAC;
	}

	@Override
	public String toString() {
		return "Room [width=" + width + ", length=" + length + ", hasAC=" + hasAC + "]";
	}
	
	
}
