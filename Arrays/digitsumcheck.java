public class digitsumcheck {
    public static void main(String[] args) {
        int[] array = {56, 36, 30, 87, 45, 11, 123, 70};

        System.out.println("Elements whose digit sum is greater than 7:");

        for (int num : array) {
            int original = num;
            int sum = 0;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum > 7) {
                System.out.println(original + " (Digit Sum: " + sum + ")");
            }
        }
    }
}

