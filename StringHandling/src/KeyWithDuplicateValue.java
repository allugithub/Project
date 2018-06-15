import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class KeyWithDuplicateValue {

	public static void main(String[] args) {
	
		Map<Integer, String> mapvalue = new HashMap<>();
		mapvalue.put(1, "a");
		mapvalue.put(2, "v");
		mapvalue.put(3, "v");
		mapvalue.put(4, "v");
		mapvalue.put(5, "m");
		mapvalue.put(6, "m");
		//mapvalue.put(2, "k");
		Map<Integer, Integer> map = new HashMap<>();
		Set<Entry<Integer, String>> keyset = mapvalue.entrySet();
		for (Entry<Integer, String> entryset : keyset) {
			if(mapvalue.containsKey(entryset.getKey())) {
				map.put(entryset.getKey(), map.get(entryset)+1);
			}
			else {
				map.put(entryset.getKey(), 1);
			}
		}
		Set<Entry<Integer, Integer>> mapset=map.entrySet();
		for (Entry<Integer, Integer> entry : mapset) {
			if(entry.getValue()>=2)
				System.out.println(entry.getKey());
			
		}
		
	

		
	}

}
