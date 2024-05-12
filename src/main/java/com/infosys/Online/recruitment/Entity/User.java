package com.infosys.Online.recruitment.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class User {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@OneToOne
	@JoinColumn(name="roleId")
	private Role role;
	private String fullName;
	private String password;
	private String ConfirmPassword;
	private Date dob;
	private String phoneNumber;
	private String email;
	private String address;
	private String gender;
	private String nationality;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, Role role, String fullName, String password, String confirmPassword, Date dob,
			String phoneNumber, String email, String address, String gender, String nationality) {
		super();
		this.userId = userId;
		this.role = role;
		this.fullName = fullName;
		this.password = password;
		ConfirmPassword = confirmPassword;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.gender = gender;
		this.nationality = nationality;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return ConfirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", role=" + role + ", fullName=" + fullName + ", password=" + password
				+ ", ConfirmPassword=" + ConfirmPassword + ", dob=" + dob + ", phoneNumber=" + phoneNumber + ", email="
				+ email + ", address=" + address + ", gender=" + gender + ", nationality=" + nationality + "]";
	}
	

}