package algorithm;

public class ConcatenatedNumber {
    public int solution(int[] num_list) {
        int[] num1 = new int[num_list.length / 2];
        int[] num2 = new int[num_list.length - num1.length];


        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                num1[i / 2] = num_list[i];
            } else {
                num2[i / 2] = num_list[i];
            }
        }


        return concatenateNumbers(num1, num2);
    }


    private int concatenateNumbers(int[] num1, int[] num2) {
        int result = 0;

        // Concatenate num1
        for (int digit : num1) {
            result = result * 10 + digit;
        }

        // Concatenate num2
        for (int digit : num2) {
            result = result * 10 + digit;
        }

        return result;
    }
}
