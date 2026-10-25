public class vowelsconsonantdigit {
    public static void main(String args[]) {
        String str = "education123";
        int vowels = 0, consonants = 0, digits = 0;

        for(int i=0 ; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (Character.isLetter(ch)) {
                consonants++;
            } else if (Character.isDigit(ch)) {
                digits++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
    }
}
