//Assignment no.1, Problem 2

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 4};

        Arrays.sort(nums);

        int sum = 0;

        for (int i = 0; i < nums.length / 2; i++) {
            int[] arrayi = new int[2];

            for (int j = 0; j < 2; j++) {
                arrayi[j] = nums[2 * i + j];
            }

            sum += Arrays.stream(arrayi).min().getAsInt();
        }

        System.out.println("Maximum sum of minimum values: " + sum);
    }
}
