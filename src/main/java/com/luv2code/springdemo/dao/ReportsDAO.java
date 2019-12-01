package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Reports;

public interface ReportsDAO {

	public List<Reports> getReports();

	public void saveReports(Reports theReports);

	public Reports getReports(int theId);

	public void deleteReports(int theId);
	
}
