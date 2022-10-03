public class Task04 {

    public static boolean checkEvenNumbers(int a, int b, int c) {
        return a % 2 == 0 || b % 2 == 0 || c % 2 == 0;
    }

    public static boolean checkOddNumbers(int a, int b, int c) {
        return a % 2 != 0 || b % 2 != 0 || c % 2 != 0;
    }

    public static void main(String[] args) {

        int a = Task00.inputPositiveNumber();
        int b = Task00.inputPositiveNumber();
        int c = Task00.inputPositiveNumber();

        boolean result = checkEvenNumbers(a, b, c);

        String msg = result ? "Yes,there is an even number" : "No, some numbers aren't even";

        System.out.println(msg);

        result = checkOddNumbers(a, b, c);

        msg = result ? "Yes,there is an odd number" : "No, some numbers aren't odd";

        System.out.println(msg);
    }
}

