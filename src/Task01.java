public class Task01 {
    public static boolean checkPalindrome(int number) {


        if (number <= 0) {
            return false;
        }

        int copy = number;
        int num = 0;

        while(copy > 9){
            num += copy % 10;
            num *= 10;
            copy /= 10;
        }

        num += copy;

        return num == number;
    }

    public static void main(String[] args) {
        int number = Task00.inputPositiveNumber();

        boolean result = checkPalindrome(number);

        String msg = result ? "Yes, number is palindrome"
                : "No, number isn't palindrome";

        System.out.println(msg);
    }
}

