package exam5.question2;

import java.util.List;

public class House {

	protected Address address;
	protected List<Room> rooms;
	protected boolean hasYard;
	protected boolean hasBasement;
	protected double area;
	
	public House(Address address, List<Room> rooms, boolean hasYard, boolean hasBasement, double area) {
		setAddress(address);
		setRooms(rooms);
		setHasYard(hasYard);
		setHasBasement(hasBasement);
		setArea(area);

	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	
	public void setHasYard(boolean hasYard) {
		this.hasYard = hasYard;
	}
	
	public void setHasBasement(boolean hasBasement) {
		this.hasBasement = hasBasement;
	}
	
	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "House [address=" + address + ", rooms=" + rooms + ", hasYard=" + hasYard + ", hasBasement="
				+ hasBasement + ", area=" + area + "]";
	}
	
	
}
