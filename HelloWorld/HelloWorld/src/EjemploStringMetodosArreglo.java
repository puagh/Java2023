public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        char[] arreglo = trabalenguas.toCharArray();
        
        for (byte i = 0; i < trabalenguas.length(); i++){
            System.out.println("arreglo[i] = " + arreglo[i]);
        }

        String[] arreglo2 = trabalenguas.split("a");
        for (byte i = 0; i < arreglo2.length; i++){
            System.out.println("arregloTrabalenguas[i] = " + arreglo2[i]);
        }

        String archivo = "prueba.archivo.pdf";
        String[] archivoArr = archivo.split("\\.");
        for (byte i =0; i < archivoArr.length; i++){
            System.out.println("archivoArr[i] = " + archivoArr[i]);
        }
        System.out.println("archivoArr = " + archivoArr[(archivoArr.length) - 1]);
    }
}
