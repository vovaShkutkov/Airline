package com.training.airport.logic;

import java.util.ArrayList;
import com.training.airport.airline.Airline;
import com.training.airport.airport.Airport;

public class Logic {

	public static ArrayList<Airline> lookForDestination(Airport screen, String destination) {

		ArrayList<Airline> theList = screen.getTheList();
		ArrayList<Airline> value = new ArrayList<Airline>();
		
		for(int i=0; i<theList.size(); i++) {
			if (theList.get(i).getDestination().equals(destination)) {
				value.add(theList.get(i));
			}
		}
		
		return value;
	}
	
	
	public static ArrayList<Airline> lookForDayDeparture(Airport screen, int dayDeparture) {

		ArrayList<Airline> theList = screen.getTheList();
		ArrayList<Airline> value = new ArrayList<Airline>();
		
		for(int i=0; i<theList.size(); i++) {
			if (theList.get(i).getDayDeparture()==(dayDeparture)) {
				value.add(theList.get(i));
			}
		}
		
		return value;
	}
	
	
	public static ArrayList<Airline> lookForDayAndTime (Airport screen, int dayDeparture, int timeDeparture) {

		ArrayList<Airline> theList = screen.getTheList();
		ArrayList<Airline> value = new ArrayList<Airline>();
		
		for(int i=0; i<theList.size(); i++) {
			if (theList.get(i).getDayDeparture()==(dayDeparture)||theList.get(i).getTimeDeparture()==(timeDeparture)) {
				value.add(theList.get(i));
			}
		}
		
		return value;
	}

}
