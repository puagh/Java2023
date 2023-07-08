public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "El profe";

        String resultado = curso.concat(profesor);
        System.out.println("resultado  = " + resultado);

        String resultado2 = curso.transform(c -> {
            return c + "con " + profesor;
        });

        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);

        String resultado3 = resultado.replace("a", "x");
        System.out.println("resultado3 = " + resultado3);
    }
}
