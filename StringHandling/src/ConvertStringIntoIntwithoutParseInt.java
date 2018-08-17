import java.util.logging.Logger;

public class ConvertStringIntoIntwithoutParseInt {
	//public static final Logger log=Logger.getLogger(ConvertStringIntoIntwithoutParseInt.class);

	public static int convertedNo(String no) {
		int n = 0;
		int zasc=(int)'0';
		try {
			char[] ch = no.toCharArray();
			for(int i=0;i<ch.length;i++) {
				
				int tasc=(int )ch[i];
				if(tasc<=49 && tasc >=58) {
				System.out.println("1..."+n*10);
				System.out.println(tasc-zasc);
				n=(n*10)+(tasc-zasc);
			}
				else {
					throw  new NumberFormatException();
				}
			}
		} catch (NumberFormatException ne) {
			System.out.println("pls enter a no in string format");
			System.exit(0);
		}
		return n;
	}

	public static void main(String[] args) {
System.out.println(convertedNo("352l"));
	}

}
