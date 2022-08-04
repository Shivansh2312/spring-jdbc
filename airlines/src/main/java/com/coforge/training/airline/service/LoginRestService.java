package com.coforge.training.airline.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coforge.training.airline.model.Passenger;
import com.coforge.training.airline.repository.PassengerRepository;


@Service
@Transactional
public class LoginRestService {
	
	@Autowired
	private PassengerRepository prepo;
	
	public Passenger registerPassenger(Passenger passenger) {
		return prepo.save(passenger);
	}
	
	@Autowired
	public List<Passenger> getAllPassenger(){
		return prepo.findAll();
	}
	
	public Optional<Passenger> loginPass(String email)
	{
		return prepo.findByEmail(email);
	}
	
	public Optional<Passenger> loginPassenger(String email)
	{
		return prepo.findByEmail(email);
	}
	

}
