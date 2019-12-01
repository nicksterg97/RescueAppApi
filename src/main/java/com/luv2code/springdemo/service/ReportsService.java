package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.Reports;

public interface ReportsService {

	public List<Reports> getReports();

	public void saveReports(Reports theReports);

	public Reports getReports(int theId);

	public void deleteReports(int theId);
	
}
