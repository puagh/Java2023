public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char caracterDecimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("caracterDecimal = " + caracterDecimal);
        System.out.println("Caracter === Decimal: " + (caracter == caracterDecimal));

        char caracterSimbolo = '@';
        System.out.println("Simbolo = " + caracterSimbolo);
        System.out.println("Decimal == Caracter:" + (caracterSimbolo == caracterDecimal));



        // Caracteres especiales
        char espacio = '\u0020';
        char retroceso = '\b'; //borrar un caracter
        char tab = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("char corresponde en byte = " + retroceso + espacio + Character.BYTES);
        System.out.println("char corresponde en bits = " + Character.SIZE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);




    }
}
