
public class Address {
	
	private String hNo;
	private String street;
	private String city;
	public String gethNo() {
		return hNo;
	}
	public void sethNo(String hNo) {
		this.hNo = hNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(String hNo, String street, String city) {
		super();
		this.hNo = hNo;
		this.street = street;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", street=" + street + ", city=" + city + "]";
	}
	

}
