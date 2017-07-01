package his.hyperion.doctors.models;

import org.springframework.data.annotation.Id;

public class Doctor {
	
	@Id private String _id;
	private String fname;
	private String lname;
	private int age;
	private String specialization;
	
	
	
	public Doctor(String _id, String fname, String lname, int age, String specialization) {
		this._id = _id;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.specialization = specialization;
	}

	public Doctor() {
		
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSpecialization() {
		return specialization;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	
}
