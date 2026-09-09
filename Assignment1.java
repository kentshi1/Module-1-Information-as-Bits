package MW;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] var0) {
        // 1. Build an ASCII-to-decimal converter.
        System.out.println("Enter your string:");
        Scanner var1 = new Scanner(System.in);
        String var2 = var1.nextLine();
        char[] var3 = var2.toCharArray();
        int var4 = var3.length;

        for (int var5 = 0; var5 < var4; ++var5) {
            Character var6 = var3[var5];
            System.out.print((int) var6);
            System.out.print(" ");
        }
        var1.close();
    }
}