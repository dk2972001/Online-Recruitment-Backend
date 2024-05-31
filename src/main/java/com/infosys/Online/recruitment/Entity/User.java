package com.infosys.Online.recruitment.Entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	
	
	@OneToOne(cascade =CascadeType.MERGE,fetch = FetchType.EAGER)
	@JoinColumn(name="roleId")
	@JsonManagedReference
	private Role role;
	
	@OneToOne(mappedBy = "user", cascade = CascadeType.PERSIST )
	@JsonBackReference
	private JobAvailability jobAvailability;
	
	private String userName;
	private String password;
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

	public User(int userId, Role role, String userName, String password, Date dob,
			String phoneNumber, String email, String address, String gender, String nationality) {
		super();
		this.userId = userId;
		this.role = role;
		this.userName = userName;
		this.password = password;
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

	public String getuserName() {
		return userName;
	}

	public void setuserName(String userName) {
		this.userName = userName;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
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
		return "User [userId=" + userId + ", role=" + role + ", userName=" + userName + ", password=" + password
				+ ", dob=" + dob + ", phoneNumber=" + phoneNumber + ", email="
				+ email + ", address=" + address + ", gender=" + gender + ", nationality=" + nationality + "]";
	}
	

}