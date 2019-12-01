package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.EventDAO;
import com.luv2code.springdemo.entity.Event;

@Service
public class EventServiceImpl implements EventService {

	// need to inject customer dao
	@Autowired
	private EventDAO EventDAO;
	
	@Override
	@Transactional
	public List<Event> getEvent() {
		return EventDAO.getEvent();
	}

	@Override
	@Transactional
	public void saveEvent(Event theEvent) {

		EventDAO.saveEvent(theEvent);
	}

	@Override
	@Transactional
	public Event getEvent(int theId) {
		
		return EventDAO.getEvent(theId);
	}

	@Override
	@Transactional
	public void deleteEvent(int theId) {
		
		EventDAO.deleteEvent(theId);
	}
}





