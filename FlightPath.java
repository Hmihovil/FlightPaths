


public class FlightPath {

	public static boolean isPath(City orCity, City destCity){
		boolean done=false;
		if(orCity.equals(destCity)){
			System.out.printf("\n%13s  ==>> ",orCity.name);
			return true;
		}
		else{
			City nextCity = orCity.getNextCity();
			while((nextCity !=null) &&(!done)){
				System.out.printf("\n%13s  ==>> ",orCity.name);
				done = isPath(nextCity, destCity);
				if(!done){
					nextCity = orCity.getNextCity();
				}
			}
		}
		return done;
	}
	
	
	
	
}
