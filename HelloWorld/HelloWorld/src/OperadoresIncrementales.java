public class OperadoresIncrementales {
    public static void main(String[] args) {
        //Preincremento
        int i = 1;
        int j = ++i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Postincremento
        i = 2;
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Predecremento
        i = 3;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Postdecremento
        i = 4;
        j = i--; //j = 4
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("j = " + (++j)); // j = 5
        System.out.println("j = " + (j--)); // j = 5


    }
}
