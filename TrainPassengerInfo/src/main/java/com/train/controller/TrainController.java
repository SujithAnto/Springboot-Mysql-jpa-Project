package com.train.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.train.service.TrainService;
import com.train.table.Resultstable;

@RestController
public class TrainController {
@Autowired
	TrainService rc;
	@GetMapping("results")
	public List<Resultstable> Getuserdata() {
		return rc.getResults();
	}@GetMapping("result/{id}")
	public Optional<Resultstable> Gettrainum(@PathVariable (name="id")int id ) {
		return rc.getdatabyid(id);
	}	@GetMapping("train/{num}")
	public List<Resultstable> GetBytrainum(@PathVariable (name="num")String num) {
		return rc.getbytrainum(num);
	}@PostMapping("adddata")
	public Resultstable Adddata(@RequestBody  Resultstable  data) {
		return rc.adddata(data);
	}
	@GetMapping("resultsbyfilter")
	public List<Resultstable> getresultsbyfilter(@RequestBody  Resultstable  data) {
		return rc.getdatabyfilter(data);
	}
	
	}




