package stringsLearning;

public class StringPyramid {
    static void main() {

//      method no.1

        String string = "I Love Indian Army";
        String str2 = "";


        for (int i = 0; i < string.length(); i++) {
            str2 = str2 + string.charAt(i);
            System.out.println(str2);

            if (string.length() == str2.length()) {
                break;
            }
        }

//        method no.2 "But we need to concatenate extra space in the end of string"

//        String string = "I Love Indian Army ";
//
//        for (int i = 0; i < string.length(); i++) {
//            System.out.println(string.substring(0,i));
//        }
    }
}
