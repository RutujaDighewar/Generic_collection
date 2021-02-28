/**
 * 
 */
package com.gen;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
 

/**
 * @author Rutuja
 *
 */
public class GenericTest {

	public static void main(String[] args) {

      List<String> pune = new ArrayList<>();
      pune.add("Karve nagar");
      pune.add("Warje");
      
      HashMap<String, List<String>> mh=new HashMap<>();
      mh.put("Pune" , pune);
      
      HashMap<String ,HashMap<String ,List<String>>> india=new HashMap<>();
      india.put("Maharashtra", mh);
      HashMap<String , HashMap<String , HashMap<String , List<String>>>> world = new HashMap<>();
      world.put("India", india);
      
      Set<String> setOfCountry=world.keySet();
      for(String countryKey : setOfCountry) {
    	  System.out.println(countryKey);
    	  HashMap<String, HashMap<String , List<String>>> countries = world.get(countryKey);
    	  Set<String> setOfState=countries.keySet();
    	  for(String state : setOfState) {
    		  System.out.println("\t"+state);
    		  HashMap<String ,List<String>> city = countries.get(state);
    		  Set<String> setOfCity = city.keySet();
    		  for(String cities : setOfCity) {
    			  System.out.println("\t\t\t"+cities);
    			  List<String> area=city.get(cities);
    			  for(String location : area) {
    				  System.out.println("\t\t\t\t"+location);
    			  }
    		  }
    	  }
      }
      
      
	}

}
