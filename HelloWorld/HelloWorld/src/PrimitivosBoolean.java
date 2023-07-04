public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean datoLogico = false;

        double d = 98345.453e-3; // 98.345453
        float f = 2894556.99e-4f; // 289.4556.99
        System.out.println("d = " + d);
        System.out.println("f = " + f);

        datoLogico = d > f;
        System.out.println("d > f = " + datoLogico);
    }
}
