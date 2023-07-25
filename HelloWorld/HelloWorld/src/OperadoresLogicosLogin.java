import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        String username = "malfoy";
        String password = "41234";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el usuario: ");
        String u = scanner.nextLine();
        System.out.println("Ingrese la contrasenia: ");
        String p = scanner.nextLine();

        boolean esAutenticado = false;
        if(username.equals(u) && password.equals(p)){
            esAutenticado = true;
        } else{
            System.out.println("Usuario o contrasenia incorrectas");
        }

        if(esAutenticado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else{
            System.out.println("Lo siento, requiere autenticarse primero");
        }

    }
}
