import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String[] usernames = new String[2];
        usernames[0] = "malfoy";
        usernames[1] = "prince";

        String[] passwords = {"54321", "12345"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el usuario: ");
        String u = scanner.nextLine();
        System.out.println("Ingrese la contrasenia: ");
        String p = scanner.nextLine();
        boolean esAutenticado = false;

        for(byte i = 0; i < usernames.length; i++){
            esAutenticado = usernames[i].equals(u) && passwords[i].equals(p) || esAutenticado;
        }

        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(u).concat("!") : "Lo siento, requiere autenticarse primero";
        System.out.println(mensaje);

    }
}
