package com.coforge.training.airline.model;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

//import java.nio.charset.StandardCharsets;

//import java.util.Base64;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passenger")
public class Passenger {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pass_id")
	private long pass_id;
		
	@Column(name="title")
	private String title;
	
    @Column(name="first_name")
    private String fname;
   
    @Column(name="last_name")
    private String lname;
    
    @Column(unique = true)
    private String email;
    
    @Column(name="pass")
    private String pass;
    
    @Column(name="cpass")
    private String cpass;
    
    @Column(name="dob")
    private Date dob;
   
    @Column(name="contactNo")
    private String contactNo;

	public long getPass_id() {
		return pass_id;
	}

	public void setPass_id(long pass_id) {
		this.pass_id = pass_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}
	
	public String getCpass() {
		return cpass;
	}
	
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public void setCpass(String cpass) {
		this.cpass = cpass;
	}
	
	/*public void setPass(String pass) {
		Base64.Encoder encoder = Base64.getEncoder();  // encrypt password in database field
        String normalString = pass;
        String encodedString = encoder.encodeToString(
        normalString.getBytes(StandardCharsets.UTF_8) );
        this.pass = encodedString;
	}
	
	public void setCpass(String cpass) {
		Base64.Encoder encoder = Base64.getEncoder();  // encrypt password in database field
        String normalString = cpass;
        String encodedString = encoder.encodeToString(
        normalString.getBytes(StandardCharsets.UTF_8) );
        this.cpass = encodedString;
	}*/



	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

    
    
    

}
