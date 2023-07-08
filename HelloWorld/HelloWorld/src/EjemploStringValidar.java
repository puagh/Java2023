public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = " ";
        boolean esNull = curso == null;

        System.out.println("esNull = " + esNull);

        if(esNull){
            curso = "Programación Java";
        }

        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);

        boolean estaVacio = curso.isEmpty();

        boolean estaEnBlanco = curso.isBlank();

        System.out.println("En blanco = " + estaEnBlanco);

        if (estaEnBlanco){
            curso = "Programación desde Padawan";
        }
        System.out.println("Bienvenido al " + curso);

    }
}
