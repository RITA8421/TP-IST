package com.univ;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Vehicule {
	
	private long V_ID;
	private String platNumber;
	private String marque;
	

	List<Rent> rents = new ArrayList<Rent>();
	
	@OneToMany(cascade=CascadeType.REMOVE,mappedBy="vehicule")
	public List<Rent> getRents() {
		return rents;
	}

	public void setRents(List<Rent> rents) {
		this.rents = rents;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getV_ID() {
		return V_ID;
	}

	public void setV_ID(long v_ID) {
		V_ID = v_ID;
	}

	public String getPlatNumber() {
		return platNumber;
	}

	public void setPlatNumber(String platNumber) {
		this.platNumber = platNumber;
	}
	
	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	public Vehicule() {
		// TODO Auto-generated constructor stub
	}
	

}
