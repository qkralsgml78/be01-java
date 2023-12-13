package programmers_5team;

//class a1 {
//    public String a1(String s, int n) {
//        String answer = "";
//        String[] up = {"A", "B", "C", "D","E","F","G","H","I", "J","K","L","M","N","O","P","Q","R","X","T","U","W","Z","Y"};
//        String[] lo = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","x","t","u","w","z","y"};
//        String[] a = s.split("");
//        
//        for (int i = 0; i <= a.length; i++) {
//        	if(a[i].equals(a[a.length-1])) {
//        		answer += a[i];
//        		answer += a[i+n];
//        	}
//		}
//        
//        return answer;
//    }
//}

//public class D12 {
//	public static void main(String[] args) {
//		String s ="AB";

//		int n =1;
//		
//		String answer = "";
//		
//      String[] a = s.split("");
//        
//      char n1=' ';
//        
//        
//        for (int j = 0; j < a.length; j++) {
//        	if(Character.isUpperCase(a[j].charAt(0))) {
//        		if((int)a[j].charAt(0) + n > (int)'Z') {
//        			n1 = (char)((int)a[j].charAt(0) + n -(int)'Z' + (int)'A');
//        		}else{
//        			n1 =(char)(a[j].charAt(0)+ n);
//        		}
//        		
//        		}else if(Character.isLowerCase(a[j].charAt(0))) {
//        			if((int)a[j].charAt(0) + n > (int)'z') {
//	        			n1 = (char)((int)a[j].charAt(0) + n -(int)'z' + (int)'a');
//	        		}else{
//	        			n1 =(char)(a[j].charAt(0)+ n);
//	        		}
//        			answer += Character.toString(n1);
//        		}
//        
//        	}
//        System.out.println(answer);
//	}
//}
//		
//

public class D12 {
    public static void main(String[] args) {
        String s = "a B z";
        int n = 4;
        String answer = "";
        
        String[] a = s.split("");
        
        char n1 = ' ';
        
        for (int j = 0; j < a.length; j++) {
            if (Character.isUpperCase(a[j].charAt(0))) {
                if (a[j].charAt(0) == ' ') {
                	n1 = a[j].charAt(0);
                }else if((int) a[j].charAt(0) + n > (int) 'Z') {
                	n1 = (char) ((int) a[j].charAt(0) + n - (int) 'Z' + (int) 'A');
                }else {
                    n1 = (char) (a[j].charAt(0) + n);
                }
                answer += Character.toString(n1);
            } else if (Character.isLowerCase(a[j].charAt(0))) {
                if (a[j].charAt(0) == ' ') {
                	n1 = a[j].charAt(0);
                }else if((int) a[j].charAt(0) + n > (int) 'z') {
                	n1 = (char) ((int) a[j].charAt(0) + n - (int) 'z' + (int) 'a'-1);
                }else {
                    n1 = (char) (a[j].charAt(0) + n);
                }
                answer += Character.toString(n1);
            }else answer +=a[j];
        }
        System.out.println(answer);
    }
}
