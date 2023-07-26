public class OperadorInstanceOfGenericos {
    public static void main(String[] args) {
        Object texto = "Creando un obj de la clase String";
        Number numero = 23;

        boolean b1 = numero instanceof Object;
        System.out.println("numero es del tipo Object = " + b1);

        b1 = numero instanceof Number;
        System.out.println("numero es del tipo Number = " + b1);

        b1 = numero instanceof Integer;
        System.out.println("numero es del tipo Integer = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("Texto es del tipo Integer = " + b1);
    }
}
