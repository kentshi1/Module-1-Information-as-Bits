import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        // Build a number-base converter supporting binary, decimal, octal, and hexadecimal.
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        String number = input.nextLine();

        System.out.println("Enter the base (2, 8, 10, or 16):");
        int base = input.nextInt();

        long decimal = Long.parseLong(number, base);

        System.out.println("Binary: " + Long.toBinaryString(decimal));
        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + Long.toOctalString(decimal));
        System.out.println("Hexadecimal: " + Long.toHexString(decimal).toUpperCase());

        input.close();
    }
}