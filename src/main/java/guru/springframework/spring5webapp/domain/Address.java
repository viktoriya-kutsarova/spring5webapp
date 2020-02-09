package guru.springframework.spring5webapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String addressLine1;
	private String city;
	private String state;
	private String zipCode;

	public Address() {
	}

	public Address(String addressLine1, String city, String state, String zipCode) {
		this.addressLine1 = addressLine1;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address{" +
				"id=" + id +
				", addressLine1='" + addressLine1 + '\'' +
				", city='" + city + '\'' +
				", state='" + state + '\'' +
				", zipCode='" + zipCode + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Address address = (Address) o;

		if (id != null ? !id.equals(address.id) : address.id != null) return false;
		if (addressLine1 != null ? !addressLine1.equals(address.addressLine1) : address.addressLine1 != null)
			return false;
		if (city != null ? !city.equals(address.city) : address.city != null)
			return false;
		if (state != null ? !state.equals(address.state) : address.state != null)
			return false;
		return zipCode != null ? zipCode.equals(address.zipCode) : address.zipCode == null;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (addressLine1 != null ? addressLine1.hashCode() : 0);
		result = 31 * result + (city != null ? city.hashCode() : 0);
		result = 31 * result + (state != null ? state.hashCode() : 0);
		result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
		return result;
	}
}
