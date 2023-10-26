class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre ){
        this.nombre = nuevoNombre;
    }

    public String mostrarNombre(){
        return this.nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.modificarNombre("Hector");

        System.out.println("iniciamos en main");

        System.out.println("persona = " + persona.mostrarNombre());

        System.out.println(" Antes de llamar test ");

        test(persona);

        System.out.println(" Despues de llamar test ");

        System.out.println("persona = " + persona.mostrarNombre());

        System.out.println("Finaliza main");
    }

    public static void test(Persona persona){
        System.out.println("Iniciamos el metodo test");

        persona.modificarNombre("mafoy");

        System.out.println("finaliza el metodo test");
    }

}