package com.luv2code.springdemo.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.luv2code.springdemo.entity.User;
import com.luv2code.springdemo.entity.AED;
import com.luv2code.springdemo.entity.Event;
import com.luv2code.springdemo.entity.Reports;



import com.luv2code.springdemo.service.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UniversalRestController {
	
	//****************** USER ****************************
	
	
	//autowire the UserService
	
	@Autowired
	private UserService userService;
	
	//add mapping for GET/users
	@GetMapping("/users")
	public List<User> getUsers(){
		
		return userService.getUsers();
	}
	
	//add mapping for GET/users/{userId}
	@GetMapping("/users/{userId}")
	public User getUser(@PathVariable int userId){
			
		return userService.getUser(userId);
	}
	
	//add mapping for DELETE/user/{userId}
	@RequestMapping(method=RequestMethod.DELETE,value="/users/delete/{userId}")
	public void deleteUser(@PathVariable int userId){
						
		userService.deleteUser(userId);
	}
	
	
	//add mapping for POST/users
	@RequestMapping(method=RequestMethod.POST,value="/users/add")
	public void addUser(@RequestBody User user){
			
		userService.saveUser(user);
	}
	
	
	
	
	//****************** AED ****************************
	
	@Autowired
	private AEDService aedService;
	
	//add mapping for GET/AED
	@GetMapping("/aed")
	public List<AED> getAED(){
			
		return aedService.getAED();
	}
		
	
	//add mapping for POST/aed
	@RequestMapping(method=RequestMethod.POST,value="/aed/add")
	public void addAED(@RequestBody AED aed){
				
		aedService.saveAED(aed);
	}
	
	//add mapping for DELETE/aed/{aedId}
	@RequestMapping(method=RequestMethod.DELETE,value="/aed/delete/{aedId}")
	public void deleteAED(@PathVariable int aedId){
					
		aedService.deleteAED(aedId);
	}
	
	//add mapping for GET/aed/{aedId}
	@GetMapping("/aed/{aedId}")
	public AED getAED(@PathVariable int aedId){
				
		return aedService.getAED(aedId);
	}
	
	//****************** Event ****************************
	
		@Autowired
		private EventService eventService;
		
		//add mapping for GET/Event
		@GetMapping("/event")
		public List<Event> getEvent(){
				
			return eventService.getEvent();
		}
			
		
		//add mapping for POST/event
		@RequestMapping(method=RequestMethod.POST,value="/event/add")
		public void addEvent(@RequestBody Event event){
					
			eventService.saveEvent(event);
		}
		
		//add mapping for DELETE/event/{eventId}
		@RequestMapping(method=RequestMethod.DELETE,value="/event/delete/{eventId}")
		public void deleteEvent(@PathVariable int eventId){
						
			eventService.deleteEvent(eventId);
		}
		
		//add mapping for GET/event/{eventId}
		@GetMapping("/event/{eventId}")
		public Event getEvent(@PathVariable int eventId){
					
			return eventService.getEvent(eventId);
		}
		
		//****************** Reports ****************************
		
			@Autowired
			private ReportsService reportsService;
			
			//add mapping for GET/reports
			@GetMapping("/reports")
			public List<Reports> getReports(){
					
				return reportsService.getReports();
			}
				
			
			//add mapping for POST/reports
			@RequestMapping(method=RequestMethod.POST,value="/reports/add")
			public void addReports(@RequestBody Reports reports){
						
				reportsService.saveReports(reports);
			}
			
			//add mapping for DELETE/reports/{reportsId}
			@RequestMapping(method=RequestMethod.DELETE,value="/reports/delete/{reportsId}")
			public void deleteReports(@PathVariable int reportsId){
							
				reportsService.deleteReports(reportsId);
			}
			
			//add mapping for GET/reports/{reportsId}
			@GetMapping("/reports/{reportsId}")
			public Reports getReports(@PathVariable int reportsId){
						
				return reportsService.getReports(reportsId);
			}
		
	

}
