public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = 590;
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("convertido en binario = " + Integer.toBinaryString(numeroDecimal));
        
        int numeroBinario = 0b1001001110;
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("convertido en octal = " + Integer.toOctalString(numeroDecimal));
        int numeroOctal = 01116;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("convertido en hexadecimal = " + Integer.toHexString(numeroDecimal));
        int numeroHexadecimal = 0x24e;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);
    }
}
