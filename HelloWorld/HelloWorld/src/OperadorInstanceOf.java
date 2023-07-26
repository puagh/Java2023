public class OperadorInstanceOf {
    public static void main(String[] args) {
        String texto = "Creando un obj de la clase String";
        Integer numero = 23;

        boolean b1 = numero instanceof Object;
        System.out.println("Texto es del tipo Object = " + b1);

        b1 = numero instanceof Number;
        System.out.println("Texto es del tipo Number = " + b1);

        b1 = numero instanceof Integer;
        System.out.println("Texto es del tipo Integer = " + b1);
    }
}
