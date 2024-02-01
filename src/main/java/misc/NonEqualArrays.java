package misc;

public class NonEqualArrays {

    public static void main(String[] args) {
        int[][] arr = new int[4][7];

        int[][] arr2 = {{1,2,3,4,5,6,7},
                {1,1},
                {0}};

        int[][] arr3 = new int[4][];
        arr3[0] = new int[10];
        arr3[1] = new int[3];
        arr3[2] = new int[0];
        arr3[3] = new int[5];


        String[] strs = new String[4];
        strs[0] = "Max";
        strs[1] = "a";
        strs[2] = "abcdefg";
        strs[3] = "xxxxxxxxxxxxxxxxxxxxxxxxxx";
    }
}
