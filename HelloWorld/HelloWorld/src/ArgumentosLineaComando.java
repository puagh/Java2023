public class ArgumentosLineaComando {
    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println(" Debe ingresar parametros ");
            System.exit(0);
        }

        for(int i = 0; i < args.length; i++){
            System.out.println("Argumentos n~  = " + i + " : " + args[i]);
        }


    }
}
