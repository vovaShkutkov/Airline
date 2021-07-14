package com.training.airport.view;

import java.util.ArrayList;

import com.training.airport.airport.Airport;

import com.training.airport.airline.Airline;

import com.training.airport.logic.Logic;


public class View {

	public static void print (Airport screen, String destination) {

		ArrayList<Airline> theList = Logic.lookForDestination(screen, destination);
		for (Airline element : theList) {
			System.out.println(element);
		}

	}
	
	public static void printDay (Airport screen, int dayDeparture) {

		ArrayList<Airline> theList = Logic.lookForDayDeparture(screen, dayDeparture);
		for (Airline element : theList) {
			System.out.println(element);
		}

	}
	
	
	public static void printDayAndTime (Airport screen, int dayDeparture, int timeDeparture) {

		ArrayList<Airline> theList = Logic.lookForDayAndTime(screen, dayDeparture,timeDeparture);
		for (Airline element : theList) {
			System.out.println(element);
		}

	}
	

}
