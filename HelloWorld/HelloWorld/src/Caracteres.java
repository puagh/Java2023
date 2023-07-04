public class Caracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char caracterDecimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("caracterDecimal = " + caracterDecimal);
        System.out.println("Caracter === Decimal: " + (caracter == caracterDecimal));

        char caracterSimbolo = '@';
        System.out.println("Simbolo = " + caracterSimbolo);
        System.out.println("Decimal == Caracter:" + (caracterSimbolo == caracterDecimal));

        




    }
}
