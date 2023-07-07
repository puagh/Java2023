import javax.swing.*;

public class Ex1_Factura {
    public static void main(String[] args) {
        final String numUltimoTicket = "3467";
        final byte iva = 16;
        short numeroTicket = 0;
        float precioProd1 = 0, precioProd2 = 0, precioProd3 = 0, subtotalTicket = 0, ivaTicket = 0, totalTicket = 0;

        try{
            String ingresoPrecio1 = JOptionPane.showInputDialog("Ingrese el precio del producto 1");
            precioProd1 = Float.parseFloat(ingresoPrecio1);
            System.out.println("precioProd1 = " + precioProd1);

            String ingresoPrecio2 = JOptionPane.showInputDialog("Ingrese el precio del producto 2");
            precioProd2 = Float.parseFloat(ingresoPrecio2);

            String ingresoPrecio3 = JOptionPane.showInputDialog("Ingrese el precio del producto 3");
            precioProd3 = Float.parseFloat(ingresoPrecio3);
        } catch (NumberFormatException exception){
            JOptionPane.showMessageDialog(null, "Error, ingrese el precio correctamente sin comas");
            main(args);
            System.exit(0);
        }

        subtotalTicket = precioProd1 + precioProd2 + precioProd3;
        ivaTicket = subtotalTicket * iva / 100;
        totalTicket = subtotalTicket + ivaTicket;

        numeroTicket = (Short.parseShort(numUltimoTicket));
        numeroTicket++;

        String impresioRemision = "Numero de Ticket " + numeroTicket;
        impresioRemision += "\r\n\n\nProducto 1: \t" + precioProd1;
        impresioRemision += "\r\nProducto 2: \t" + precioProd2;
        impresioRemision += "\r\nProducto 3: \t" + precioProd3;
        impresioRemision += "\r\n---------------------";
        impresioRemision += "\r\nSubtotal: \t" + subtotalTicket;
        impresioRemision += "\r\nIVA(16%): \t" + ivaTicket;
        impresioRemision += "\r\nTotal: \t" + totalTicket;
        impresioRemision += "\r\n\n\nAgradecemos su compra, ¡vuelva pronto!";




        JOptionPane.showMessageDialog(null, impresioRemision);

    }
}
