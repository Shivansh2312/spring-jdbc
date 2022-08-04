package com.coforge.training.airline.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coforge.training.airline.model.Passenger;
import com.coforge.training.airline.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService lservice;
	
	
	//Request --> Front Controller --> Controller --> Response(Views-JSP)
	//Browse Home Page- http://localhost:8085/ims/
	@RequestMapping("/")
	public String viewHomePage()
	{
		return "index";
	}
	
	@RequestMapping("/register")
	public String viewRegisterPage(Model model)
	{
		Passenger passenger = new Passenger();
		model.addAttribute("passenger",passenger);
		return "register"; //It consist of Model(Dealer object) + View(Register)
	}
	
	// PostRequest --> Controller ---> Service--> PassengerRepository--> JPA Repository --> Database
    // PassengerRepository-->Service ---> Controller ---> Response(views- jsp)
	@PostMapping("/savePassenger")
	
	//@RequestMapping(path = "/savePassenger" method = RequestMethod.POST)
	public String saveDealer(HttpServletRequest req,@ModelAttribute("passenger") Passenger passenger)
	{
        lservice.savePassenger(passenger); //Interacts with Service layer for data base logic implementation
		return "index";
	}

}
