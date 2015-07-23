import java.util.HashMap;

public class HashMapTest {
	public static void main(String args[]){
		
		HashMap numberTypes = new HashMap();

		numberTypes.put("byte", "-128 to 127");
		numberTypes.put("short", "-32768 to 32767");
		numberTypes.put("int", "-2147483648 to 2147483647");
		numberTypes.put("long", "-922337203685775808 to 922337203685775807");
		
		System.out.println(numberTypes.get("byte"));
		
		HashMap cities = new HashMap();

		cities.put("Portland", "- the largest city in the U.S. state of Oregon.");
		cities.put("Chicago", "- on Lake Michigan in Illinois, is among the largest cities in the U.S. Famed for its bold architecture.");
		cities.put("Los Angeles", "- is a sprawling Southern California city famed as the center of the nation’s film and television industry.");

		System.out.println(cities.get("Portland"));
		
		cities.keySet();
		numberTypes.values();
		System.out.println(cities.containsKey("Chicago"));
		System.out.println(numberTypes.containsValue("123-456-7890"));
	}
}
