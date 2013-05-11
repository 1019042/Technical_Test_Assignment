/*
 * Program to detect how many times
 * method put() and get() is called on Map
 */

import java.util.HashMap;


public class Map {
	static int counter_put = 0, counter_get = 0;
	
	public static int putMap(HashMap<String,String> map,String key, String value){
		map = new HashMap<String,String>();
		map.put(key, value);
		counter_put++;
		return counter_put;
	}
	public static int getMap(HashMap<String,String> map,String key){
		map = new HashMap<String,String>();
		map.get(key);
		counter_get++;
		return counter_get;
	}
	
	public static void main(String[] args) {
		HashMap<String,String> map1 = new HashMap<String,String>();
		putMap(map1,"firstName", "Kevin");
		System.out.println("Number of times put() used: "+ putMap(map1,"lastName", "Dragon"));//get the total number of put() on Map
		
		getMap(map1,"firstname");
		System.out.println("Number of times get() used: "+ getMap(map1,"lastname"));//get the total number of get() on Map
		
	}//end main

}
