import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        String estado = "";
        double promedio = 0.0;
        double matematicas = 0.0;
        double ciencias = 0.0;
        double administracion = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la calificacion de matematicas");
        matematicas = scanner.nextDouble();

        System.out.println("Ingrese la calificacion de ciencias");
        ciencias = scanner.nextDouble();

        System.out.println("Ingrese la calificacion de administracion");
        administracion = scanner.nextDouble();

        promedio = (matematicas + ciencias + administracion) / 3.0;

        estado = promedio >= 6.0 ? "Aprobado" : "Reprobado";
        System.out.println("promedio = " + promedio);
        System.out.println("estado = " + estado);
    }
}
