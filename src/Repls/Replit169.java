package Repls;

public class Replit169 {
    public static void main(String[] args) {
        int[] a = {2, 7, 3, 8, 4};
        System.out.println(avgElements(a)); //should print 4.8
    }

    final static double avgElements(int[] a) {
        double avg = 0;
        for (int i = 0; i < a.length; i++) {
            avg += (a[i]);
        }
        avg = avg / a.length;
        return avg;
    }
}

