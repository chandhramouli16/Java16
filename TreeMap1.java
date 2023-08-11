package CollectionsFramework;

import java.util.*;

public class TreeMap1 {

	public static void main(String[] args) {

		//Declaring TreeMap
		TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
		
		//Adding elements to TreeMap
		tmap.put(1, "Data1");
		tmap.put(23, "Data2");
		tmap.put(70, "Data3");
		tmap.put(4, "Data4");
		tmap.put(2, "Data5");
		
		//Displaying contents using iterator
		//By default, it is sorted by key
		Set<?> set1=tmap.entrySet(); 
		Iterator<?> itr=set1.iterator();
		while(itr.hasNext()) {
			//To reset the pointer to beginning of TreeMap, use Map.Entry()
			Map.Entry<?,?> mEntry=(Map.Entry<?,?>)itr.next();
			System.out.println("Key is : "+mEntry.getKey()+" Value is : "+mEntry.getValue());
		}
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
	}

}
