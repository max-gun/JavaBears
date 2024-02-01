package misc;

public class MyStrings {

    public static void main(String[] args) {
        String s1 = "Max";
        String s2 = "Max";

        System.out.println(s1==s2);

        s2 += '!';

        System.out.println(s1==s2);
        System.out.println("---------------------");

        String s3 = new String("Max");
        System.out.println(s1 == s3.intern());
    }
}
