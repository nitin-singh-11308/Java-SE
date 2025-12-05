package stringsLearning;

public class RevString {
    static void main() {

        String string = "Welcome To Java world!";
        String rev = "";

        for (int i = string.length()-1; i >= 0; i--) {
            rev += string.charAt(i);
        }

        System.out.println(rev);
    }
}
