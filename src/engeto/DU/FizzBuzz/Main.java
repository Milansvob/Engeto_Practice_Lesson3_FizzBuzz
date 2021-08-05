package engeto.DU.FizzBuzz;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = i+1;

            if ((numbers[i] % 3 == 0) && (numbers[i] % 5 == 0)) {
                System.out.println(FizzBuzz.FIZZBUZZ);
            }
            else if (numbers[i] % 3 == 0) {
                System.out.println(FizzBuzz.FIZZ);
            }
            else if (numbers[i] % 5 == 0) {
                System.out.println(FizzBuzz.BUZZ);
            }
            else System.out.println(numbers[i]);
        }
    }
}
