package Assignment1;

public class Question1 {
    public static void main(String[] args) {
        String s2 = "Hi\uD83D\uDC4B, my name is \u0639\u0645\u0631";
        System.out.println(s2);
        System.out.println(s2.length());
        /*
        Explanation of the size of String
        The size of the string printed in this code is 20 because it contains 5 unicode point. 2 representing the waving hand emoji,
        and the last three unicode point representing my native language in Arabic. The rest of the 15 is the combination of the other
        english characters including space bar and comma.

         */
    }
}
