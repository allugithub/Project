import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicate {
	
	public static void duplicateChar(String str1){
		String str=str1.replaceAll(" ", "");
		char[] ch=str.toCharArray();
		HashMap <Character,Integer> map=new HashMap();
		for (char c : ch) {
			if(map.containsKey(c)) {
				System.out.println("from..."+map.get(c));
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		Set<Map.Entry<Character, Integer>> keySet=map.entrySet();
		//System.out.println("duplilcate char in string"+str);
		
		for (Entry<Character, Integer> entry : keySet) {
			if(entry.getValue()>1)
				System.out.println(entry.getKey()+"...."+entry.getValue());
		}

	}
	
	

	public static void main(String[] args) {
		duplicateChar("internationalization");

	}

}
