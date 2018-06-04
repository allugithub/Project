import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.BufferUnderflowException;
import java.util.Locale;
import java.util.Random;

public class SMethods {

	public static void main(String[] args) {
		
		String s="sample text for testing in string handling";
		String s1="allu naam he mera ";
		InputStream in=null;
		//CharSequence ch=(CharSequence) new BufferedReader(new InputStreamReader(in));
		StringBuffer sb=new StringBuffer(s);
		
		System.out.println(s.charAt(1));//a:reurns char of the strting at specified index
		System.out.println(s.codePointAt(1));//97: returns asci value of specified index
		System.out.println(s.codePointBefore(7));//102: Returns the character asci value before the specified index. if we enter wrong inpur like 0 it will thorow  java.lang.StringIndexOutOfBoundsException
		System.out.println(s.codePointCount(10, s.length()));//32 : returns 2nd value(index)- 1st value(index) 
		System.out.println("compareTo : "+s.compareTo("saa"));//string length comparision based on asci value from 1st to 2nd; returns(1st - 2nd)
		System.out.println(s.compareToIgnoreCase("SAMPLE"));
		System.out.println(s.contains("ple t"));//true
		System.out.println(s.contentEquals(sb));//true
		//System.out.println(s.contentEquals(ch));
		System.out.println("endwith : "+s.endsWith("in string handling"));//true
		byte ba[]=s1.getBytes();
		System.out.println(s.indexOf(32, 6+1));//11 : 
		System.out.println(s.isEmpty());//false
		System.out.println(s.lastIndexOf("in"));
		System.out.println(s.matches("text"));
		System.out.println("Raghunath".replace('a', '@'));
		System.out.println(s.replace("text", "done"));
		System.out.println(s.replaceAll("for", "which"));
		System.out.println(s1.startsWith("he", 10));//true : checks mentioned string starts or not at specified index
		System.out.println(s1.subSequence(0, 7));//allu na : prints character between the range
		System.out.println(s1.substring(s1.length()- 10));// removes mentioned no of charactes from string
		System.out.println(s1.substring(1, 8));// prints only mentioned range of string
		char ch[]=s1.toCharArray();//converts string into char array
		System.out.println(ch[3]);
		System.out.println("ALLU".toLowerCase());
		System.out.println("alluR".toUpperCase());
		System.out.println("from trim o/p : "+s1.trim());
		
		
		
	}

}
