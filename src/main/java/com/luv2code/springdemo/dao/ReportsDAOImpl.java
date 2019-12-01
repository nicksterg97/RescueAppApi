package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Reports;


@Repository
public class ReportsDAOImpl implements ReportsDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Reports> getReports() {
		
		// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
						
				// create a query  ... sort by last name
				Query<Reports> theQuery = 
						currentSession.createQuery("from Reports order by report_id",
								Reports.class);
				
				// execute query and get result list
				List<Reports> reports = theQuery.getResultList();
						
				// return the results		
				return reports;
	}

	@Override
	public void saveReports(Reports theReports) {
		
		// get current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
				
				// save/upate the customer ... finally LOL
				currentSession.saveOrUpdate(theReports);
		
	}

	@Override
	public Reports getReports(int theId) {
		
		// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
				
				// now retrieve/read from database using the primary key
				Reports theReports = currentSession.get(Reports.class, theId);
				
				return theReports;
	}

	@Override
	public void deleteReports(int theId) {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("delete from Reports where report_id=:ReportsId");
		theQuery.setParameter("ReportsId", theId);
		
		theQuery.executeUpdate();	
		
	}
			
	

}











