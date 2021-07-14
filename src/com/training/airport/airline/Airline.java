package com.training.airport.airline;

import java.util.Arrays;
import java.util.Random;

public class Airline {

	private String destination;
	private int numberFlight;
	private String typePlane; 
	private int timeDeparture;
	private int dayDeparture;
	
	
	
	public Airline (String destination, int numberFlight, String typePlane, int  timeDeparture, int  dayDeparture ) {
		
		this.destination = destination;
		this.numberFlight = numberFlight;
		this.typePlane = typePlane;
		this.timeDeparture = timeDeparture;
		this.dayDeparture = dayDeparture;
		
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumberFlight() {
		return numberFlight;
	}

	public void setNumberFlight(int numberFlight) {
		this.numberFlight = numberFlight;
	}

	public String getTypePlane() {
		return typePlane;
	}

	public void setTypePlane(String typePlane) {
		this.typePlane = typePlane;
	}

	public int getTimeDeparture() {
		return timeDeparture;
	}

	public void setTimeDeparture(int timeDeparture) {
		this.timeDeparture = timeDeparture;
	}

	public int getDayDeparture() {
		return dayDeparture;
	}

	public void setDayDeparture(int dayDeparture) {
		this.dayDeparture = dayDeparture;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dayDeparture;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + numberFlight;
		result = prime * result + timeDeparture;
		result = prime * result + ((typePlane == null) ? 0 : typePlane.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		if (dayDeparture != other.dayDeparture)
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (numberFlight != other.numberFlight)
			return false;
		if (timeDeparture != other.timeDeparture)
			return false;
		if (typePlane == null) {
			if (other.typePlane != null)
				return false;
		} else if (!typePlane.equals(other.typePlane))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", numberFlight=" + numberFlight + ", typePlane=" + typePlane
				+ ", timeDeparture=" + timeDeparture + ", dayDeparture=" + dayDeparture + "]";
	}
	
	
	
	
	
}
