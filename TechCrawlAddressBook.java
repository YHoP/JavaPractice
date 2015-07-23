import java.util.HashMap;

public class TechCrawlAddressBook {
	public static void main(String[] args) {
		HashMap<Object, Object> addressBook = new HashMap<Object, Object>();
		addressBook.put("GlobeSherpa", "1000 SW Broadway #1800");
		addressBook.put("Thetus", "317 SW 6th Ave");
		addressBook.put("Epicodus", "208 SW 5th Ave #105");
		addressBook.put("CrowdCompass", "308 SW 2nd Ave #200");
		addressBook.put("Puppet Labs", "308 SW 2nd Ave, 5F");
		addressBook.put("Jive", "915 SW Stark St #400");
		
		for (Object key : addressBook.keySet()){
			System.out.println(key + " : " + addressBook.get(key));
		}
	}
}
