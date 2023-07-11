public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Hector";
        System.out.println("nombre.length =  " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Hector\") = " + nombre.equals("Hector"));
        System.out.println("nombre.equals(\"hector\") = " + nombre.equals("hector"));
        System.out.println("nombre.equalsIgnoreCase(\"hector\") = " + nombre.equalsIgnoreCase("hector"));
        System.out.println("nombre.compareTo(\"Hector\") = " + nombre.compareTo("Hector"));
        System.out.println("nombre.compareTo(\"Hugo\") = " + nombre.compareTo("Hugo"));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(0, 3) = " + nombre.substring(0, 3));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \".\") = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas.indexOf(\"s\") = " + trabalenguas.indexOf("s"));
        System.out.println("trabalenguas.charAt(11) = " + trabalenguas.charAt(11));
        System.out.println("trabalenguas.indexOf(\"x\") = " + trabalenguas.indexOf("x"));
        System.out.println("trabalenguas.contains(\"aba\") = " + trabalenguas.contains("aba"));
        System.out.println("trabalenguas = " + trabalenguas.startsWith("trab"));
        System.out.println("    trabalenguas    ".trim());



    }
}
