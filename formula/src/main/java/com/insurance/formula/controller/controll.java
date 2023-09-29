package com.insurance.formula.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.formula.model;
import com.insurance.formula.contract.repositoryInterface;

@RestController
public class controll {

	@Autowired
	repositoryInterface rp;

	@GetMapping(value = "/formula")
	@ResponseBody

	public double formula(Model model, model m) {

		model.addAttribute("amount", rp.formula(m));
		return rp.formula(m);
	}
}
