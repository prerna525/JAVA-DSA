public class countdigit {
     public static void main(String args[]) {
         String str = "hello123"; 
         int digit = 0; 
         for(int i=0 ; i < str.length() ; i++) {
             char ch = str.charAt(i); 
             if (Character.isDigit(ch)) 
                {
                    digit++;
                 }
                 }
                  System.out.println("digit" + digit); }
    
}
