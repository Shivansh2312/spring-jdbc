package com.coforge.training.airline.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.training.airline.model.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
	
	public Optional<Passenger> findByEmail(String email);

}
   