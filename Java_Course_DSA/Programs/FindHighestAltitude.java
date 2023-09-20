package Java_Course_DSA.Programs;

import java.util.Arrays;

public class FindHighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-4, -3, -2, -1, 4, 3, 2};
        int size = gain.length;
        largestAltitude(gain, size);
//        System.out.println(highestans);
    }

    private static void largestAltitude(int[] gain, int n) {
        int currentAltitude = 0;
        int maxAltitude = 0;

        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];

            if (currentAltitude > maxAltitude) {
                maxAltitude = currentAltitude;
            }
        }
        System.out.println(maxAltitude);
//        return Arrays.toString();
    }
}
