package com.training.airport.airport;

import java.util.ArrayList;

import com.training.airport.airline.Airline;

public class Airport {

	private ArrayList<Airline> theList;
	
	public Airport(ArrayList<Airline> theList) {
		this.theList = theList;
	}

	public ArrayList<Airline> getTheList() {
		return theList;
	}

	public void setTheList(ArrayList<Airline> theList) {
		this.theList = theList;
	}


	
}
