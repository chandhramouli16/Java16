package CollectionsFramework;

import java.util.*;

public class HashMap1 {

	public static void main(String[] args) {

		//Creating HashMap
		Map<String, Integer> m1=new HashMap<String, Integer>();
		//      Key   Value
		m1.put("Zara", 8);
		m1.put("Mahnaz", 31);
		m1.put("Ayan", 12);
		m1.put("Daisy", 14);
		
		System.out.println("Map elements are : ");
		System.out.println(m1);
		
		//Here you can get particular value only with key
		System.out.println("Value where key is 'Ayan' is : "+m1.get("Ayan"));
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		HashMap<Integer, String> hmap=new HashMap<Integer, String>();
		
		hmap.put(12,"Chaitanya");
		hmap.put(2,"Rahul");
		hmap.put(7,"Singh");
		hmap.put(49,"Ajeet");
		hmap.put(3,"Anuj");
		
		//Displaying content using iterator, to print with key and value pair
		//Iterator can only be used in set, so we are converting it to set
		Set<?> set1=hmap.entrySet(); 
		Iterator<?> itr=set1.iterator();
		while(itr.hasNext()) {
			//To reset the pointer to beginning of HaspMap, use Map.Entry()
			Map.Entry<?,?> mEntry=(Map.Entry<?,?>)itr.next();
			System.out.println("Key is : "+mEntry.getKey()+" Value is : "+mEntry.getValue());
		}
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		//Printing values based on key
		String var=hmap.get(2);
		System.out.println("Value where key 2 is : "+var);
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		//Removing values based on key
		hmap.remove(3);
		System.out.println("Map key and values after removal : ");
		
		Set<?> set2=hmap.entrySet();
		Iterator<?> itr1=set2.iterator();
		while(itr1.hasNext()) {
			Map.Entry<?,?> mEntry2=(Map.Entry<?,?>)itr1.next();
			System.out.println("Key is : "+mEntry2.getKey()+" Value is : "+mEntry2.getValue());
		}
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		//HashMapLooping - Displaying elements with for loop and while loop
		
		HashMap<Integer,String> hmap1=new HashMap<Integer,String>();
		
		hmap1.put(11, "AB");
		hmap1.put(19, "CD");
		hmap1.put(13, "EF");
		hmap1.put(54, "GH");
		hmap1.put(15, "IJ");
		
		//For Loop
		System.out.println("Printing using For-Each Loop : ");
		for(Map.Entry<?,?> mEntry3:hmap1.entrySet()) {
			System.out.println("Key : "+mEntry3.getKey()+" Value is : "+mEntry3.getValue());
		}
		
		//While Loop and Iterator
		System.out.println("Printing using While Loop and Iterator : ");
		Iterator<?> itr2=hmap1.entrySet().iterator();
		while(itr2.hasNext()) {
			Map.Entry<?,?> mEntry4=(Map.Entry<?,?>)itr2.next();
			System.out.println("Key is : "+mEntry4.getKey()+" Value is : "+mEntry4.getValue());
		}
		
		System.out.println();
		System.out.println("_________________________________________________");
			
		//________________________________________________________________________//
		
	}

}
