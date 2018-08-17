import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapSortingByValue {

	public static void main(String[] args) {

		Map<Integer, String> mapvalue = new HashMap<>();
		mapvalue.put(1, "a");
		mapvalue.put(2, "v");
		mapvalue.put(3, "v");
		mapvalue.put(4, "v");
		mapvalue.put(5, "m");
		mapvalue.put(6, "m");
		mapvalue.put(6, "m");
		mapvalue.put(2, "DFS");
		// sorting map collection based on values
		Set<Entry<Integer, String>> keyset = mapvalue.entrySet();

		List<Entry<Integer, String>> list = new ArrayList<>(keyset);
		System.out.println(list);
		Collections.sort(list, new Comparator<Entry<Integer, String>>() {

			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {

				return o1.getValue().compareTo(o2.getValue());
			}
		});
		System.out.println(list);
		for (Entry<Integer, String> entry : list) {
			System.out.println(entry.getKey() + "....." + entry.getValue());

		}

	}

}
