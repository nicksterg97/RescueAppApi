package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.ReportsDAO;
import com.luv2code.springdemo.entity.Reports;

@Service
public class ReportsServiceImpl implements ReportsService {

	// need to inject customer dao
	@Autowired
	private ReportsDAO ReportsDAO;
	
	@Override
	@Transactional
	public List<Reports> getReports() {
		return ReportsDAO.getReports();
	}

	@Override
	@Transactional
	public void saveReports(Reports theReports) {

		ReportsDAO.saveReports(theReports);
	}

	@Override
	@Transactional
	public Reports getReports(int theId) {
		
		return ReportsDAO.getReports(theId);
	}

	@Override
	@Transactional
	public void deleteReports(int theId) {
		
		ReportsDAO.deleteReports(theId);
	}
}





