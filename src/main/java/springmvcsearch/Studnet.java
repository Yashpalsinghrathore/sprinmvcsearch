package springmvcsearch;

import java.util.Date;
import java.util.List;

public class Studnet {

	private String email;
	private long id;
	private Date dob;
	private List<String> courses;
	private String gender;
	private String type;
	
	private Address address;
	
	
	@Override
	public String toString() {
		return "Studnet [email=" + email + ", id=" + id + ", dob=" + dob + ", courses=" + courses + ", gender=" + gender
				+ ", type=" + type + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
