public class AutoboxingInteger {
    public static void main(String[] args) {
        Integer[] enteros = {1,2,3,4,5,6,7,8,9};
        int suma = 0;

        for (Integer i:enteros) {
            if(i % 2 == 0){
                suma += i;
            }
        }

        System.out.println("suma = " + suma);
    }
}
