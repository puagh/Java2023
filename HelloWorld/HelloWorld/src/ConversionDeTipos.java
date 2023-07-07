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

        //Convertir de primitivo a String

        int otroInt = -29;
        System.out.println("otroInt = " + otroInt);

        String otroStr = Integer.toString(otroInt);
        System.out.println("otroStr = " + otroStr);

        otroStr = String.valueOf(otroInt+79);
        System.out.println("otroStr = " + otroStr);

        String otroRealStr = Double.toString(234234.45e-2);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(534533.99e11-5f);
        System.out.println("otroRealStr = " + otroRealStr);

        //Convertir primitivos en otros primitivos

        int i = 38434;
        short s = (short)i;
        System.out.println("i = " + i);
        System.out.println("s = " + s);

        float f = (float)i;
        System.out.println("f = " + f);

    }
}
