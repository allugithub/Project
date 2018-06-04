import java.util.Date;

public class WhiteSpcecount {

	public static void main(String[] args) throws InterruptedException {
		/*words available in a sentence separated by whitespcae*/
		Date d=new Date();
		
		 
		long ms=d.getTime();
		int count=1;
		String s="this is ram ";
		s=s.trim();
	/*	Thread.sleep(110);
		
		for(int i=0;i<s.length();i++){
			//char t=s.charAt(i);
			if(s.charAt(i)==32){
				count++;
			}
		}
		Date d1 = new Date();
		long ms1=d1.getTime();
 System.out.println("Total  words found:  "+count);
 System.out.println(ms +"..."+ms1+"::::"+(ms1-ms));
	*/int iv=s.indexOf(32);
	System.out.println(iv);
	for(int j=0;j<s.length();j++){
		if(iv!=(-1)){
		
		System.out.println("space at"+iv);
		iv=s.indexOf(32, iv+1);
		}else{
			System.exit(0);
		}
	}
	
	
	
	}
	


}
