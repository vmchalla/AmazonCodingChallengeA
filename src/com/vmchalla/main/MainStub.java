package com.vmchalla.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.vmchalla.vacation.city.VacationCity;
import com.vmchalla.weekend.movies.WeekendMovies;
/**
 * This is am implementation of Amazon Coding Challenge A for a Java Developer position.
 * There are two problems defined: 
 * 1. Find a vacation city: A person wants to take vacation to a city 
 *     whose consonant to vowel ratio matches his home city.
 *     input: homeCity and a list of cities to take vacation to ( includes the home city as well).
 *     
 *     
 * 2. Find the optimum Movie List for weekend: Two friends want to watch their lists of movies
 *    on a weekend together. Person A does not like the movie choice of person B and person B does
 *    not like the movie choice of person A. They want a software which would provide the optimum 
 *    way of watching that list. 
 *    
 *    If the both lists are same the first element should be that of the first list passed.
 *    ex: AAAA BBBB -> ABABABAB
 *    If one of the lists is bigger the first element in the optimum list should be from 
 *    the bigger list.
 *    There should be minimum amount of clubbing: ex: AAA BBBBB -> BBABABAB
 *    
 *    I am presenting the answer I came up with for these two. The first one is straight forward
 *    the second one requires recursion.
 * @author vmohanchalla
 *
 */
public class MainStub {

	public static void main(String[] args) {
		
		VacationCity vacation = new VacationCity();
		WeekendMovies weekend = new WeekendMovies();

		//----------------------------Vacation City Part--------------------------------------------
		String city = "CROXI";
		String[] vacationCities = {"Croxi", "Proxi", "Nandeda"};
		String vacationCity = vacation.getVacationCity(city, vacationCities);
		
		System.out.println("city For vacation : "+ vacationCity);
		
		
		//-------------------------Weekend Movie Part -------------------------------------------------
		List<String> personA = new ArrayList<String>();
		personA.add("A");
		personA.add("A");
		personA.add("A");
		personA.add("A");
		
		List<String> personB = new ArrayList<String>();
		personB.add("B");
		personB.add("B");
		personB.add("B");
		personB.add("B");
		personB.add("B");
		personB.add("B");
		
		List<String> optimumMovieWatch = weekend.optimumMovieListToWatch(personA, personB);
		
		System.out.println("The sequece is "+optimumMovieWatch);

	}
	
	
	
	
	
	

}
