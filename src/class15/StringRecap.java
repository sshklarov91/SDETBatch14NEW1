package class15;

import java.util.Arrays;

public class StringRecap {
    public static void main(String[] args) {
        String str="asdlfkasdklGJDJDJFKf23hrl2k3h423h5$#%$";
        str=str.replaceAll("[^a-zA-Z]", "");
        System.out.println("str=" + str);

        String sentence = "Batch 14 is great. Batch 14 is excellent. Batch 14 is just amazing";
        String[] split = sentence.split("[.?!]");
        System.out.println("split = "+ Arrays.toString(split));

        String str2="Batch 14 is great. Batch 14 is great";
        String replace =str2.replaceFirst("great","good");
        System.out.println(replace);

    }
}
