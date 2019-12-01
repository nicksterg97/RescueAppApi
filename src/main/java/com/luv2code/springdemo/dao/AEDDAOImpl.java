package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.AED;


@Repository
public class AEDDAOImpl implements AEDDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<AED> getAED() {
		
		// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
						
				// create a query  ... sort by last name
				Query<AED> theQuery = 
						currentSession.createQuery("from AED order by AED_id",
													AED.class);
				
				// execute query and get result list
				List<AED> aed = theQuery.getResultList();
						
				// return the results		
				return aed;
	}

	@Override
	public void saveAED(AED theAED) {
		
		// get current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
				
				// save/upate the customer ... finally LOL
				currentSession.saveOrUpdate(theAED);
		
	}

	@Override
	public AED getAED(int theId) {
		
		// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
				
				// now retrieve/read from database using the primary key
				AED theAED = currentSession.get(AED.class, theId);
				
				return theAED;
	}

	@Override
	public void deleteAED(int theId) {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("delete from AED where AED_id=:aedId");
		theQuery.setParameter("aedId", theId);
		
		theQuery.executeUpdate();	
		
	}
			
	

}











