package com.train.table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "passengerinfo")
public class Resultstable {
	@Id
	int  pnrno;
	@Column
	int trainno;
	@Column
	String journeyday;
	@Column
	String dest;
	@Column
	String seat;
	@Column
	int fare;
	public int getPnrno() {
		return pnrno;
	}
	public void setPnrno(int pnrno) {
		this.pnrno = pnrno;
	}
	public int getTrainno() {
		return trainno;
	}
	public void setTrainno(int trainno) {
		this.trainno = trainno;
	}
	public String getJourneyday() {
		return journeyday;
	}
	public void setJourneyday(String journeyday) {
		this.journeyday = journeyday;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	
	
	
	
	
}
