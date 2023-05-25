public class Multiply {
    public static void MultiplyNumbers() {
        int[] num = {12001, 29384, 12384, 909345, 34289, 1, 2, 3};
        long sumOfNumbers = 0;
        double multipleNumbers = 1;

        for (int number : num) {
            if (number % 2 == 0) {
                sumOfNumbers += number;
            } else if (number % 2 != 0) {
                multipleNumbers *= number;
            }
        }

        System.out.println("Sum of Numbers: " + sumOfNumbers);
        System.out.println("Multiply Numbers: " + multipleNumbers);
    }
}
