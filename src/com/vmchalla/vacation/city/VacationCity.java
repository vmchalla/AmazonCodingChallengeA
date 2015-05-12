package com.vmchalla.vacation.city;

import java.util.Arrays;
import java.util.List;
/**
 * Domain : vacation City
 * @author vmohanchalla
 *
 */
public class VacationCity {
	
	private static final String NO_MATCH = "NOT_FOUND";
	
	/**
	 * takes in the homeCity and the Array of cities for vacation and returns the matched 
	 * Vacation City. If no match found return not found.
	 * @param homeCity
	 * @param cities
	 * @return
	 */
	public   String getVacationCity(String homeCity, String[]cities){
		
		List<String> citiesAsList = Arrays.asList(cities);
		double homecityRatio=getRatio(homeCity);
		
		//Find the city matching the homeCityRatio 
		//disregarding homeCity(which is present in the list)
		for(String city: citiesAsList){
			double eachCityRatio= getRatio(city);
			if(!city.equalsIgnoreCase(homeCity)&&eachCityRatio==homecityRatio){
				return city;
			}
			
		}
		return NO_MATCH;
	}
	
	/**
	 * Checks if the character passed is a vowel or a consonant.
	 * @param c
	 * @return
	 */
	private  boolean isVowel(char c ){
		if("aeiou".contains(String.valueOf(c)) || "AEIOU".contains(String.valueOf(c))){
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * takes a city as input and returns the consonant to vowel ratio.
	 * @param city
	 * @return
	 */
	private  double getRatio(String city){
		double ratio = 0.0;
		int vowelCount=0;
		int consonantCount=0;
		char[] cityAsCharArray = city.toCharArray();
		
		for(int i=0;i< cityAsCharArray.length;i++){
			if(isVowel(cityAsCharArray[i])){
				vowelCount++;
			} else {
				consonantCount++;
			}
		}
		ratio = (double)consonantCount/vowelCount;
		return ratio;
	}

}
