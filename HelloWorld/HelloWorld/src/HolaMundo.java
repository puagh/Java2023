public class HolaMundo {
    public static void main(String[] args){
        String greetings = "Hola Mundo desde Java 2023";
        System.out.println(greetings);
        System.out.println("greetings.toUpperCase() = " + greetings.toUpperCase());

        int numero = 10;
        System.out.println("numero = " + numero);

        boolean valor = true;
        if(valor){
            System.out.println("Hello world");
            numero = 100;
            System.out.println("numero = " + numero);
        }

        System.out.println("numero = " + numero);

        var num = 0.006f;
        System.out.println("num = " + num);

    }
}
