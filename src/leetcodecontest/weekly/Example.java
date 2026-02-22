package leetcodecontest.weekly;

public class Example {
    public static void main(String[] args) {

        // ==============================
        // 1️⃣ String.valueOf()
        // ==============================
        int num1 = 100;
        String str1 = String.valueOf(num1);
        System.out.println("String.valueOf(int): " + str1);


        // ==============================
        // 2️⃣ Integer.parseInt()
        // ==============================
        String str2 = "200";
        int num2 = Integer.parseInt(str2);
        System.out.println("Integer.parseInt(String): " + num2);


        // ==============================
        // 3️⃣ Integer.valueOf()
        // ==============================
        Integer num3 = Integer.valueOf("300");
        System.out.println("Integer.valueOf(String): " + num3);


        // ==============================
        // 4️⃣ Integer.toBinaryString()
        // ==============================
        int num4 = 10;
        String binary = Integer.toBinaryString(num4);
        System.out.println("Binary of 10: " + binary);


        // ==============================
        // 5️⃣ Radix Conversions
        // ==============================

        // Decimal -> Binary
        System.out.println("10 to Binary: " + Integer.toString(10, 2));

        // Decimal -> Octal
        System.out.println("10 to Octal: " + Integer.toString(10, 8));

        // Decimal -> Hex
        System.out.println("255 to Hex: " + Integer.toString(255, 16));

        // Binary -> Decimal
        System.out.println("1010 (binary) to Decimal: " + Integer.parseInt("1010", 2));

        // Hex -> Decimal
        System.out.println("A (hex) to Decimal: " + Integer.parseInt("A", 16));

        // Base 36 Example
        System.out.println("Z (base36) to Decimal: " + Integer.parseInt("Z", 36));


        // ==============================
        // 6️⃣ Fixed 8-bit Binary Format
        // ==============================
        String paddedBinary = String.format("%8s", Integer.toBinaryString(5)).replace(' ', '0');
        System.out.println("5 in 8-bit binary: " + paddedBinary);
    }
}
