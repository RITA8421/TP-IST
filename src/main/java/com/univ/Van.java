package com.univ;

import javax.persistence.Entity;

@Entity
public class Van extends Vehicule{
	private int MaxWeight;

	public int getMaxWeight() {
		return MaxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		MaxWeight = maxWeight;
	}

}
