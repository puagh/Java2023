import java.sql.SQLOutput;

public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "";

        StringBuilder sb = new StringBuilder(c);

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 5000000; i++){
            //c = c.concat(a).concat(b).concat("\n"); //ms
            //c += a + b + "\n"; //ms
            sb.append(a).append(b).append("\n"); //113ms
        }



        long fin = System.currentTimeMillis();
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
        System.out.println(fin - inicio + "ms");

    }

}
