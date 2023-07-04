public class PrimitivosFloat {
    public static void main(String[] args) {
        float numeroFloat = 1.0f;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Tipo float corresponde en bytes a: " + Float.BYTES);
        System.out.println("Tipo float corresponde en bits a: " + Float.SIZE);
        System.out.println("Valor max de un float: " + Float.MAX_VALUE);
        System.out.println("Valor min de un float: " + Float.MIN_VALUE);

        double numeroDouble = 1.7976931348623157E30;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Tipo double corresponde en bytes a: " + Double.BYTES);
        System.out.println("Tipo double corresponde en bits a: " + Double.SIZE);
        System.out.println("Valor max de un double: " + Double.MAX_VALUE);
        System.out.println("Valor min de un double: " + Double.MIN_VALUE);
    }
}
