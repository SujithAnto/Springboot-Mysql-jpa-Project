package com.train.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.repo.TrainRepo;
import com.train.table.Resultstable;

@Service
public class TrainService {

	@Autowired
TrainRepo sc;
	public List<Resultstable> getResults() {
		return sc.findAll();
	}
	public Optional<Resultstable> getdatabyid(int id) {
		return sc.findById(id);
	}
	public List<Resultstable> getbytrainum(String num) {
		return sc.findByJourneyday(num);
	}
	
	public Resultstable adddata(Resultstable data) {
		return sc.save(data);
	}
	public List<Resultstable> getdatabyfilter(Resultstable data) {
		
		return sc.findByJourneydayOrDest(data.getJourneyday(),data.getDest());
	}
	
	
	
	
	
}
