import java.util.Scanner;

public class Converter {

    // Method to convert any base to decimal
    public static int toDecimal(String number, int base) {
        int decimal = 0;
        int length = number.length();
        for (int i = 0; i < length; i++) {
            char digit = number.charAt(length - 1 - i);
            int value;
            if (Character.isDigit(digit)) {
                value = digit - '0';
            } else if (Character.isLetter(digit)) {
                value = Character.toUpperCase(digit) - 'A' + 10;
            } else {
                throw new IllegalArgumentException("Invalid character in number: " + digit);
            }
            if (value >= base) {
                throw new IllegalArgumentException("Invalid digit for base " + base + ": " + digit);
            }
            decimal += value * Math.pow(base, i);
        }
        return decimal;
    }

    // Method to convert decimal to any base
    public static String fromDecimal(int decimal, int base) {
        if (decimal == 0) return "0";
        StringBuilder result = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % base;
            char digit = (char) (remainder < 10 ? '0' + remainder : 'A' + remainder - 10);
            result.insert(0, digit);
            decimal /= base;
        }
        return result.toString();
    }

    // Method to handle user input and conversion
    public static void convert() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        String number = scanner.nextLine();

        System.out.print("Enter the base of the number: ");
        int fromBase = scanner.nextInt();

        System.out.print("Enter the base to convert to: ");
        int toBase = scanner.nextInt();

        try {
            int decimal = toDecimal(number, fromBase);
            String result = fromDecimal(decimal, toBase);
            System.out.println("Converted number: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Main method to run the converter
    public static void main(String[] args) {
        convert();
    }
}