package Interviewqns;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NoOfWordOccuranceInString {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis=new FileInputStream("io.txt");
		//ObjectInputStream ois=new ObjectInputStream(fis);
		int i=0;
		String str="";
		while((i=fis.read())!=-1) {
			str=str+(char)i;
		}
		//System.out.println(str);
		String s[]=str.trim().split(" ");
		Map<String, Integer> map=new HashMap<>();
		for(String s1:s) {
			if(map.containsKey(s1))
				map.put(s1, map.get(s1)+1);
			else
				map.put(s1, 1);
		}
		//System.out.println(map);
		Iterator itr=map.keySet().iterator();
		while(itr.hasNext()) {
			String ks=(String)itr.next();
			System.out.println(ks+"  repeated   "+map.get(ks)+ "   no of times");
		}

	}

}
