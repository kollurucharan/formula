package com.insurance.formula;

import java.util.List;

public class model {

	double packageAmount;
	List<String> health;
	List<String> preExistingCondition;
	String loction;
	int members;

	public double getPackageAmount() {
		return packageAmount;
	}

	public void setPackageAmount(double packageAmount) {
		this.packageAmount = packageAmount;
	}

	public List<String> getHealth() {
		return health;
	}

	public void setHealth(List<String> health) {
		this.health = health;
	}

	public List<String> getPreExistingCondition() {
		return preExistingCondition;
	}

	public void setPreExistingCondition(List<String> preExistingCondition) {
		this.preExistingCondition = preExistingCondition;
	}

	public String getLoction() {
		return loction;
	}

	public void setLoction(String loction) {
		this.loction = loction;
	}

	public int getMembers() {
		return members;
	}

	public void setMembers(int members) {
		this.members = members;
	}

}
