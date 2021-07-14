package com.training.airport.main;

import java.util.ArrayList;

import com.training.airport.airport.Airport;
import com.training.airport.airline.Airline;
import com.training.airport.logic.Logic;
import com.training.airport.view.View;

public class Main {

	private static ArrayList<Airline> line = null;

	static {
		line = new ArrayList<Airline>();
		line.add(new Airline("London", 1010, "Broiler-747", 3, 1));
		line.add(new Airline("Berlin", 1001, "Broiler-747", 6, 2));
		line.add(new Airline("Moscow", 1100, "Broiler-747", 9, 3));
		line.add(new Airline("Barselona", 0011, "Broiler-747", 12, 4));
		line.add(new Airline("Vilnius", 0101, "Broiler-747", 15, 5));
		line.add(new Airline("Minsk", 0110, "Broiler-747", 18, 6));
		line.add(new Airline("Warshava", 1010, "Broiler-747", 21, 7));
	}
	
	public static void main(String[] args) {
		
		Airport screen = new Airport(line);
		
		System.out.println("Search by destination:");
		View.print(screen, "London");
		System.out.println("Search by day departure:");
		View.printDay(screen, 3);
		System.out.println("Search by day and time departure:");
		View.printDayAndTime(screen, 18, 6);

	}

}
