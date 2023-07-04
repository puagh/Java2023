public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = (byte) 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en bytes a: " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bits a: " + Byte.SIZE);
        System.out.println("Valor max de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor min de un byte: " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo Short corresponde en bytes a: " + Short.BYTES);
        System.out.println("Tipo Short corresponde en bits a: " + Short.SIZE);
        System.out.println("Valor max de un Short: " + Short.MAX_VALUE);
        System.out.println("Valor min de un Short: " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en bytes a: " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bits a: " + Integer.SIZE);
        System.out.println("Valor max de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor min de un int: " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde en bytes a: " + Long.BYTES);
        System.out.println("Tipo long corresponde en bits a: " + Long.SIZE);
        System.out.println("Valor max de un long: " + Long.MAX_VALUE);
        System.out.println("Valor min de un long: " + Long.MIN_VALUE);



    }
}
