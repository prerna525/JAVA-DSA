public class countletter {
    public static void main(String args[]) {
        String str = "ab12cd34";
        int letter = 0;
        for(int i=0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                letter++;
            }
        }
        System.out.println("Letters: " + letter);
    }
}
