package com.univ;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Rent {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long RentID;
	Person driver;
	private Vehicule vehicule;
	
	@ManyToOne
	public Vehicule getVehicule() {
		return vehicule;
	}
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	@Temporal(TemporalType.DATE)
	Date beginRent;
	@Temporal(TemporalType.DATE)
	Date endRent;
	
	@ManyToOne
	public Person getDriver() {
		return driver;
	}
	public void setDriver(Person driver) {
		this.driver = driver;
	}
	
	
	@OneToOne
	public long getRentID() {
		return RentID;
	}
	public void setRentID(long rentID) {
		RentID = rentID;
	}
	public Date getBeginRent() {
		return beginRent;
	}
	public void setBeginRent(Date beginRent) {
		this.beginRent = beginRent;
	}
	public Date getEndRent() {
		return endRent;
	}
	public void setEndRent(Date endRent) {
		this.endRent = endRent;
	}
	
	public Rent() {
		// TODO Auto-generated constructor stub
	}

}
