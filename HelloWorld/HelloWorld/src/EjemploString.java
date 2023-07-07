public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programacion JAVA";
        String curso2 = new String("Programacion Java");

        boolean esIgual = curso == curso2;
        System.out.println("esIgual = " + esIgual);
        
        esIgual = curso.equals(curso2);
        System.out.println("esIgual = " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("esIgual = " + esIgual);
    }
}
