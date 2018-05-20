


public class Tester {

	public static void main(String[] args) {
		
		City NY = new City("New York");
		City D = new City("Dubai");
		City M = new City("Mexico");
		City F = new City("Florida");
		City MTV = new City("Mt Everest");
		City T = new City("Thailand");
		City S = new City("Switzerland");
		City NP = new City("North Pole");
		
		NY.addCityToDest(D);
		NY.addCityToDest(M);

		NY.addCityToDest(MTV);
		NY.addCityToDest(F);
		D.addCityToDest(T);
		D.addCityToDest(S);
		S.addCityToDest(T);
		
		F.addCityToDest(NY);
		F.addCityToDest(M);
		M.addCityToDest(F);
		M.addCityToDest(T);
		MTV.addCityToDest(NP);
		
		boolean yesNo =  FlightPath.isPath(NY, NP);
		System.out.println("CAN we get from NY to NP \t"+yesNo);
	
	}

}
