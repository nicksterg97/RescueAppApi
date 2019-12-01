package com.luv2code.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reports")
public class Reports {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="report_id")
	private int report_id;
	
	@Column(name="AED_id")
	private int AED_id;
	
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="status")
	private String status;
	
	@Column(name="comment")
	private String comment;
	
	
	public Reports() {
		
	}


	public int getReport_id() {
		return report_id;
	}


	public void setReport_id(int report_id) {
		this.report_id = report_id;
	}


	public int getAED_id() {
		return AED_id;
	}


	public void setAED_id(int AED_id) {
		this.AED_id = AED_id;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	@Override
	public String toString() {
		return "Reports [report_id=" + report_id + ", AED_id=" + AED_id + ", user_id=" + user_id + ", status=" + status
				+ ", comment=" + comment + "]";
	}

	



	

	
		
}





