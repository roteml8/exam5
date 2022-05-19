package exam5.question2;

public class Address {

	protected String street;
	protected int number;
	protected String state;
	protected String city;

	
	public Address(String street, int number, String state, String city) {
		
		setStreet(street);
		setNumber(number);
		setState(state);
		setCity(city);

	}

	public void setStreet(String street) {
		this.street = street;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", number=" + number + ", state=" + state + ", city=" + city + "]";
	}
	
	
}
