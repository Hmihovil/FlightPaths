

import java.util.Stack;


public class City{
	String name;
	Stack<City> cities;
	

	public City(){
		name = "noname";
		cities = new Stack<City>();
	}
	public City(String name){
		this.name = name;
		cities  = new Stack<City>();
	}
	
	public City(String name, Stack<City> immediateDestinations){
		this.name = name;
		cities = immediateDestinations;
	}
	
	public boolean equals(Object o){
		if(o instanceof City){
			City otherCity = (City)o;
			return (this.name.equalsIgnoreCase(otherCity.name));
		}
		return false;
	}
	public City getNextCity(){
		if(!cities.isEmpty()){
			return cities.pop();
		}
		else{
			return null;
		}
	}
	public void addCityToDest(City c){
		cities.push(c);
	}
	
	
}