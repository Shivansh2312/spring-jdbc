package com.coforge.training.airline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coforge.training.airline.model.Passenger;
import com.coforge.training.airline.repository.PassengerRepository;

@Service
@Transactional
public class LoginService {
	
	//creating instance of passenger
	@Autowired
	private PassengerRepository prepo;
	
	public void savePassenger(Passenger passenger)
	{
		//this save() method is predefined method Of JPA repo
		prepo.save(passenger);
	}

}
