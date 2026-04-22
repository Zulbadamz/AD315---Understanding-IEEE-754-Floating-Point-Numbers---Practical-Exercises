public class IEEE754Demo {

    // Convert float to 32-bit IEEE 754 binary string
    public static String toIEEE754(float value) {
        int bits = Float.floatToIntBits(value);
        return String.format("%32s", Integer.toBinaryString(bits)).replace(' ', '0');
    }

    public static void main(String[] args) {

        System.out.println("=== IEEE 754 Demonstration ===\n");

        // 1. Convert decimal to IEEE 754
        float num = 12.5f;
        System.out.println("Decimal: " + num);
        System.out.println("IEEE 754: " + toIEEE754(num));
        System.out.println();

        // 2. Floating point arithmetic issues
        System.out.println("0.1 + 0.2 = " + (0.1 + 0.2));
        System.out.println("1.0 / 3.0 = " + (1.0 / 3.0));
        System.out.println();

        // 3. Special values
        double posInf = 1.0 / 0.0;
        double negInf = -1.0 / 0.0;
        double nan = 0.0 / 0.0;

        System.out.println("Positive Infinity: " + posInf);
        System.out.println("Negative Infinity: " + negInf);
        System.out.println("NaN: " + nan);

        System.out.println("Is NaN != NaN? " + (nan != nan));
        System.out.println();

        // 4. Overflow
        double overflow = 1e308 * 10;
        System.out.println("Overflow example: 1e308 * 10 = " + overflow);

        // 5. Underflow
        double underflow = 5e-324;
        System.out.println("Underflow example: 1e-324 = " + underflow);

        System.out.println("\n=== Done ===");
    }
}
