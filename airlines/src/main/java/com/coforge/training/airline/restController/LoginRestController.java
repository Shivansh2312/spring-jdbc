package com.coforge.training.airline.restController;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.training.airline.exception.ResourceNotFoundException;
import com.coforge.training.airline.model.Admin;
import com.coforge.training.airline.model.Passenger;
import com.coforge.training.airline.service.LoginRestService;



@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class LoginRestController {

	@Autowired
	private LoginRestService lrservice;

	//Open Postman and make POST request - http://localhost:8085/airline/api/passenger
	//Under body tab --> raw --> Text --> Json and type the json data to be saved
	@PostMapping("/register_users")
	public Passenger createPassenger(@Validated @RequestBody Passenger passenger) {
		Passenger p = new Passenger();
		p.setTitle(passenger.getTitle());
		p.setFname(passenger.getFname());
		p.setLname(passenger.getLname());
		p.setEmail(passenger.getEmail());
		p.setPass(passenger.getPass());
		p.setCpass(passenger.getCpass());
		p.setDob(passenger.getDob());
		p.setContactNo(passenger.getContactNo());

		p = lrservice.registerPassenger(p);
		return passenger;
	}

	//Open Postman and make GET request - http://localhost:8085/airline/api/passenger
	@GetMapping("/register_users")
	public List<Passenger> getAllPassenger(){
		return lrservice.getAllPassenger();
	}

	//Open Postman and make POST request - http://localhost:8085/airline/api/passenger
	
	// Note: Have to change the return type to Boolean and return variable 'a';
	@PostMapping("/login_user")
	public String loginPassenger(@Validated @RequestBody Passenger passenger) throws ResourceNotFoundException
	{
		Boolean a=false;

		String email = passenger.getEmail();
		String password = passenger.getPass();
		//System.out.println("the password of passenger is: "+passenger.getPass());
		
		Passenger p = lrservice.loginPassenger(email).orElseThrow(() ->
		new ResourceNotFoundException("Passenger not found for this id :: "));
		System.out.println(p.getEmail() +" "+ p.getPass() );

		if(email.equals(p.getEmail()) && password.equals(p.getPass()))
		{
			a=true;
		}
		if(a==true)
			return "Login Successful!";
		else
			return "Invalid Password";
	}
	
	@PostMapping("/admin_login")
	public String adminLogin(@Validated @RequestBody Admin adm) throws ResourceNotFoundException
	{
		Boolean a = false;
		String admin_email = "srishiv@gmail.com";
		String admin_pass = "shiv54";
		
		String email = adm.getAdmin_email();
		String pass = adm.getAdmin_pass();
		System.out.println("Email:  "+email);
		System.out.println("Password:  "+pass);
		if((admin_email.equals(email)) && admin_pass.equals(pass))
		{
			a = true;
		}
		if(a==true)
			return "Admin Login Successful!";
		else
			return "Invalid Fields";
		
	}


}
