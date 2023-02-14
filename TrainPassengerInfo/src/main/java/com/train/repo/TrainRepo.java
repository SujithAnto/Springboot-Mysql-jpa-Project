package com.train.repo;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.train.table.Resultstable;

public interface TrainRepo extends JpaRepository<Resultstable, Integer> {
	
public List<Resultstable> findByJourneyday(String Journeyday);


public List<Resultstable> findByJourneydayAndDest(String Journeyday,String dest);

public List<Resultstable> findByJourneydayOrDest(String Journeyday,String dest);
}
