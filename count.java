public class count {
    public static void main(String args[]) {
        String str = "programming";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                count++;
            }
        }System.out.println("The character 'g' appears " + count + " times in the string.");
    
}}
