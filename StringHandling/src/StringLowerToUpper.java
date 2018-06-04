
public class StringLowerToUpper {

	public static void main(String[] args) {
		char c='\0';String t;
		String s="todya is sunday";
		s=s.trim();
		char ch=s.charAt(0);
		String temp=s.substring(1);
		String temp1=(""+ch).toUpperCase();
		System.out.println(temp1+temp);
		String temp2=temp1+temp;
		
		
		String beforeText="";
		String finalText="";
		for(int i=0;i<temp2.length();i++){
			beforeText=beforeText+temp2.charAt(i);
			if(temp2.charAt(i)==32){
				
				t=(temp2.charAt(i+1))+"".toUpperCase();
			   
			   String afterText=temp2.substring(i+2);
			  finalText= beforeText+t+afterText;
				temp2=finalText;			
			}
			
		}
		System.out.println(temp2);
		
	}

}
