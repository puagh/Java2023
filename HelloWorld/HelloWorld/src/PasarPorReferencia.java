public class PasarPorReferencia {
    public static void main(String[] args) {
        int[] edades = {18, 19 ,20};

        System.out.println("iniciamos en main");

        for(int edad: edades){
            System.out.println("edad = " + edad);
        }

        System.out.println(" Antes de llamar test ");

        test(edades);

        System.out.println(" Despues de llamar test ");
        
        for( int edad: edades){
            System.out.println("edad = " + edad);
        }

        System.out.println("Finaliza main con los datos del arreglo modificados");
    }

    public static void test(int[] arrEdad){
        System.out.println("Iniciamos el metodo test");
       
        for(int edad: arrEdad){
            edad = edad + 30;
        }
        System.out.println("finaliza el metodo test");
    }



}
