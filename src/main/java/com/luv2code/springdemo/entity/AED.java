package com.luv2code.springdemo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="AED")

public class AED {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AED_id")
	private int AED_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="lat")
	private String lat;
	
	@Column(name="lon")
	private String lon;
	
	@Column(name="photo")
	private String photo;
	
	public AED() {
		
	}

	public int getAED_id() {
		return AED_id;
	}

	public void setAED_id(int AED_id) {
		this.AED_id = AED_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "AED [AED_id=" + AED_id + ", name=" + name + ", description=" + description + ", lat=" + lat + ", lon="
				+ lon + ", photo=" + photo + "]";
	}

	

}
