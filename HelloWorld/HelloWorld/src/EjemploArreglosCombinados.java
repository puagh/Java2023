public class EjemploArreglosCombinados {
    public static void main(String[] args) {
        int[] a,b,c;
        a = new int[10];
        b = new int[10];
        c = new int[(a.length + b.length)];

        for(int i = 0; i < a.length; i++){
            a[i] = i+1;
        }

        for(int i = 0; i < b.length; i++){
            b[i] = (i + 1)*5;
        }

        System.out.println("Valores del arreglo a: ");
        for(int aelem: a){
            System.out.println(aelem);
        }

        System.out.println("Valores del arreglo b: ");
        for(int belem: b){
            System.out.println(belem);
        }

        int aux = 0;
        for(int i =0; i < (c.length/2); i++){
            c[aux++] = a[i];
            c[aux++] = b[i];
        }

        System.out.println("Valores del arreglo c: ");
        aux = 0;
        for(int celem: c){
            System.out.println(celem);
            aux++;
            if(aux % 2 == 0){
                System.out.println("--");
            }

        }



    }
}
