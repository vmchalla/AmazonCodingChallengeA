package com.vmchalla.weekend.movies;

import java.util.ArrayList;
import java.util.List;
/**
 * Domain : weekend Movies.
 * @author vmohanchalla
 *
 */
public class WeekendMovies {
	/**
	 * takes two lists and produces the optimum list with minimum clubbing.
	 * @param personAMovies
	 * @param personBMovies
	 * @return
	 */
	public  List<String> optimumMovieListToWatch(List<String> personAMovies, List<String>personBMovies){
		List<String> optimumMovieList = new ArrayList<String>();
		
		int personAMoviesLength = personAMovies.size();
		int personBMoviesLength = personBMovies.size();
		
		 if(personAMoviesLength<personBMoviesLength){
			
			 
			 optimumMovieList = optimumRecursively(personBMovies, personAMovies);
			
		} else {
			
			optimumMovieList =  optimumRecursively(personAMovies, personBMovies);
			
			
		}
		
		
		return optimumMovieList;
	}
	
	/**
	 * Recursively halve the lists till the smallList has only 1 element in it. 
	 * Base Condition : if smallList has only 1 element : add it to the optimumList.
	 * @param bigList
	 * @param smallList
	 * @return
	 */
	private  List<String> optimumRecursively(List<String> bigList, List<String> smallList){
		List<String> optimumMovieList = new ArrayList<String>();
		//Base Condition
		/*
		 * If both lists are equal add bigList element first then smallList element.
		 * otherwise
		 * Add the bigList elements and smallList element at penultimate position.
		 */
		if(smallList.size()==1){
			if(smallList.size()==bigList.size()){
				optimumMovieList.add(bigList.get(0));
				optimumMovieList.add(smallList.get(0));
			} else {
				for(int i=0; i<bigList.size();i++){
					if(i==bigList.size()-1){
						optimumMovieList.add(smallList.get(0));
					}
					optimumMovieList.add(bigList.get(i));
				}
			}
		} else {
			//recursive calls.
			optimumMovieList.addAll(optimumRecursively(bigList.subList(0, bigList.size()/2), smallList.subList(0, smallList.size()/2)));
			optimumMovieList.addAll(optimumRecursively(bigList.subList(bigList.size()/2, bigList.size()), smallList.subList(smallList.size()/2, smallList.size())));
		}
		return optimumMovieList;
	}

}
