public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 435623423;
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = 435623423;

        int num = intObjeto2.intValue();
        int num2 = intObjeto2;

        System.out.println("intObjeto = " + intObjeto);
        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);

        String valorTvLcd = "25999";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);





    }
}
