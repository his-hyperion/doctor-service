package his.hyperion.doctors.models;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Patient {
	@Id
	private String _id;

	private String hin;
	private String title;
	private String firstName;
	private String lastName;
	private Date dob;
	private String gender;
	private String civilStatus;
	private String nic;
	private String passport;
	private String citizenship;
	private String language;
	private String bloodGroup;
	private String address;
	private String phone;
	private String mobile;
	private String remark;
	public Patient(String _id, String hin, String title, String firstName, String lastName, Date dob, String gender,
			String civilStatus, String nic, String passport, String citizenship, String language, String bloodGroup,
			String address, String phone, String mobile, String remark) {
		this._id = _id;
		this.hin = hin;
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.civilStatus = civilStatus;
		this.nic = nic;
		this.passport = passport;
		this.citizenship = citizenship;
		this.language = language;
		this.bloodGroup = bloodGroup;
		this.address = address;
		this.phone = phone;
		this.mobile = mobile;
		this.remark = remark;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getHin() {
		return hin;
	}
	public void setHin(String hin) {
		this.hin = hin;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCivilStatus() {
		return civilStatus;
	}
	public void setCivilStatus(String civilStatus) {
		this.civilStatus = civilStatus;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	public String getCitizenship() {
		return citizenship;
	}
	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public Patient() {
		
	}
}
