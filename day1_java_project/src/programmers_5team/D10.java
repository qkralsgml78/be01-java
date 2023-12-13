package programmers_5team;

public class D10 {
	public static void main(String[] args) {
		 String s= "try hello world";
		 
		 
		 String[] n = s.split("");
		 String result = "";
		 int leg = 0;

		
		 for (int i = 0; i < n.length; i++, leg++) {
			 System.out.print(n[i]);
			 if(leg % 2 ==0 && !(n[i].equals(" "))) {
				 n[i] = n[i].toUpperCase();
			 }if(n[i].equals(" ")) {
				 leg = 0;
			 }
			 result += n[i];
		}
		 System.out.print(result);
	}	 

}
