package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Event;


@Repository
public class EventDAOImpl implements EventDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Event> getEvent() {
		
		// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
						
				// create a query  ... sort by last name
				Query<Event> theQuery = 
						currentSession.createQuery("from Event order by event_id",
								Event.class);
				
				// execute query and get result list
				List<Event> event = theQuery.getResultList();
						
				// return the results		
				return event;
	}

	@Override
	public void saveEvent(Event theEvent) {
		
		// get current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
				
				// save/upate the customer ... finally LOL
				currentSession.saveOrUpdate(theEvent);
		
	}

	@Override
	public Event getEvent(int theId) {
		
		// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
				
				// now retrieve/read from database using the primary key
				Event theEvent = currentSession.get(Event.class, theId);
				
				return theEvent;
	}

	@Override
	public void deleteEvent(int theId) {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("delete from Event where Event_id=:EventId");
		theQuery.setParameter("EventId", theId);
		
		theQuery.executeUpdate();	
		
	}
			
	

}











