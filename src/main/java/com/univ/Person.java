package com.univ;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;

@Entity
public class Person {
	
	private long P_ID;
	private String name;
	private Date date;
	private List<Rent> rents = new ArrayList<Rent>();

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long getP_ID() {
		return P_ID;
	}

	public void setP_ID(long p_ID) {
		P_ID = p_ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Temporal(TemporalType.DATE)
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	@OneToMany(cascade = CascadeType.REMOVE,mappedBy="driver")
	public List<Rent> getRents() {
		return rents;
	}

	public void setRents(List<Rent> rents) {
		this.rents = rents;
	}
	
}
