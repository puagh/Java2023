public class ConversionDeTipos {
    public static void main(String[] args) {

        String numeroStr = "60";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "1212.456e12";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);
    }
}
