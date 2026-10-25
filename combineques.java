public class combineques {
    public static void main(String args[]) {
        String str = "Hi 23 Java!";
        int vowels = 0;
        int cosonant = 0;
        int digit = 0;
        int space = 0;
        for (int i=0; i < str.length(); i++){
            char ch =str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;}
                else if(Character.isLetter(ch)){
                    cosonant++;
                }
                else if(Character.isDigit(ch)){
                    digit++;
                }else if(ch == ' '){
                    space++;
                }
                else{
                    continue;
                }
            }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + cosonant);
        System.out.println("Digits: " + digit);
        System.out.println("space: " + space);
    }
}
