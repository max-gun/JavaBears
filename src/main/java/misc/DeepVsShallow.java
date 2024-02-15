package misc;

public class DeepVsShallow {
    public static void main(String[] args) {
        String s5 = "abc";
        String s6 = "abc";

        String s1 = new String("abc");
        String s2 = new String("abc");

        String s3 = s1; // shallow copy
        String s4 = new String(s1); // deep copy

        System.out.println(s4 == s1);
    }
}
