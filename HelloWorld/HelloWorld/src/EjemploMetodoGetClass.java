import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        String texto = "Saludos";
        Class strClass = texto.getClass();

        System.out.println("strClass.getName() = " + strClass.getName());

        for(Method metodo: strClass.getMethods()){
            System.out.println("metodo = " + metodo.getName());
        }

        Integer numero = 34;
        Class integerClass = numero.getClass();
        System.out.println("integerClass.getName() = " + integerClass.getSuperclass());
        
        for(Method metodo: integerClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }
        
    }
}
