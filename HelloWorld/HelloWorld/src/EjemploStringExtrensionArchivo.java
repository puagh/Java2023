public class EjemploStringExtrensionArchivo {
    public static void main(String[] args) {
        String archivo = "Photo2342341233123(12,898.78).jpeg";
        System.out.println("archivo = " + archivo.length());
        System.out.println("archivo = " + archivo.lastIndexOf("."));
        System.out.println("archivo = " + archivo.substring(archivo.lastIndexOf(".") + 1));
    }
}
