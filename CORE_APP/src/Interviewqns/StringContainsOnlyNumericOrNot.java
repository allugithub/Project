package Interviewqns;

public class StringContainsOnlyNumericOrNot {
	
	public static void checkString(String str) {
		int count=0;
		char ch[] =str.toCharArray();
		for(char s:ch) {
			//if(s>='0' && s<='9')
			if(Character.isDigit(s))
				count++;
		}
		if(count==str.length())
			System.out.println("string has only numeric data");
		else
			System.out.println("String have non numeric data also");
	}
	
	

	public static void main(String[] args) {
		checkString("54213dsfa");
		String s=4+4+"abc"+4+4;
		System.out.println(s);
		System.out.println(Character.compare('A', 'a'));

	}

}
