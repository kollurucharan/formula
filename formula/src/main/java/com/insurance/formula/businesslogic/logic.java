package com.insurance.formula.businesslogic;

import org.springframework.stereotype.Component;

import com.insurance.formula.model;
import com.insurance.formula.contract.businessLogicInterface;

@Component
public class logic implements businessLogicInterface {

	public double formula(model m) {

		double ageFactorPerYear = 10.0;
		double baseRate = 500.0;
		System.out.println(m.getLoction());
		// ----------loaction factor------
		double locationFactor;
		if (m.getLoction().equals("delhi")) {
			locationFactor = 1.5;
		} else if (m.getLoction().equals("goa")) {
			locationFactor = 1.0;
		} else {
			locationFactor = 1.3;
		}

		// ------healthFactor---
		double healthFactor = 0;
		if (m.getHealth().contains("tobacco")) {
			healthFactor = healthFactor + 1.5;
		}
		if (m.getHealth().contains("alcohol")) {
			healthFactor = healthFactor + 0.9;
		}

		// ---------preExistingConditionFactor----
		double preExistingConditionFactor = 0;
		if (m.getPreExistingCondition().contains("bp")) {
			healthFactor = healthFactor + 0.9;
		}
		if (m.getPreExistingCondition().contains("diabetic")) {
			healthFactor = healthFactor + 1.3;
		}
		if (m.getPreExistingCondition().contains("thyroid")) {
			healthFactor = healthFactor + 1.0;
		}
		// -----------members-----------------------
		double members;
		if (m.getMembers() == 1) {
			members = 0.5;
		} else if (m.getMembers() == 2) {
			members = 0.8;
		} else if (m.getMembers() == 3) {
			members = 1.0;
		} else {
			members = 1.5;
		}

		// --------------------formula------------
		double premium = m.getPackageAmount()
				/ ((1 + preExistingConditionFactor) * (1 + locationFactor * healthFactor) + ageFactorPerYear);

		System.out.println("The health insurance premium per month is: " + premium + " INR");

		return ((premium / 100) * members) + premium;
	}

}
