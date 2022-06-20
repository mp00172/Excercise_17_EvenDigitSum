public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number != 0) {
            int digitToProcess = number;
            digitToProcess %= 10;
            number -= digitToProcess;
            number /= 10;
            if (digitToProcess % 2 == 0) {
                sum += digitToProcess;
            }
        }
        return sum;
    }
}
