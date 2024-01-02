
public class Customer {

	private String name;
	private String phonNumber;
	private int roomNumber;

	public Customer(String name, String phonNumber, int roomNumber) {
		super();
		this.name = name;
		this.phonNumber = phonNumber;
		this.roomNumber = roomNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonNumber() {
		return phonNumber;
	}

	public void setPhonNumber(String phonNumber) {
		this.phonNumber = phonNumber;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", phonNumber=" + phonNumber + ", roomNumber=" + roomNumber + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phonNumber == null) ? 0 : phonNumber.hashCode());
		result = prime * result + roomNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Customer))
			return false;
		Customer other = (Customer) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phonNumber == null) {
			if (other.phonNumber != null)
				return false;
		} else if (!phonNumber.equals(other.phonNumber))
			return false;
		
		return true;
	}

	public boolean equalsStrict(Customer target) {
		if (this.equals(target)&& this.roomNumber== target.roomNumber) {
			return true;
			
		}
		return false;
	}
	
}
