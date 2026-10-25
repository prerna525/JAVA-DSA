public class consonantcount {
    public static void main(String args[])
    {
        String str = "education";
        int consonant = 0;
        for(int i=0 ; i < str.length() ; i++)
        {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                continue;}
            else
                consonant++;    
        }
        System.out.println("consonant" + consonant);    
}
}