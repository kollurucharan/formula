package com.insurance.formula.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.insurance.formula.model;
import com.insurance.formula.contract.businessLogicInterface;
import com.insurance.formula.contract.repositoryInterface;

@Repository
public class repository implements repositoryInterface {

	@Autowired
	businessLogicInterface bli;

	@Override
	public double formula(model m) {
		// TODO Auto-generated method stub
		return bli.formula(m);
	}

}
