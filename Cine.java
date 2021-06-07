package ProEva3;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Cine {

    public static void main(String[] args) {
        final int TOTALASIENTOS = 500;
        int opcion;
        CinemaBooking cine = new CinemaBooking(TOTALASIENTOS);
        Boolean flag =true;
        do {
            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Quedan " + cine.consultar() + " asientos disponibles\n\n Elija una opcion:\n  1- Reservar\n  2- Cancelar\n  3- Consultar\n  0- Salir"));

            } while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 0);

            switch (opcion) {
                case 1:
                    
                    int reserva = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos asientos desea reservar ?"));
                    cine.reservar(reserva);
                    JOptionPane.showMessageDialog(null, "Quedan " + cine.consultar() + " asientos disponibles");
                    break;
                case 2:
                    int reserva2 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos asientos desea cancelar ?"));
                    cine.cancel(reserva2);
                    JOptionPane.showMessageDialog(null, "Quedan " + cine.consultar() + " asientos disponibles");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Quedan " + cine.consultar() + " asientos disponibles");
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa");
                    flag=false;
                    break;
                    
            }

        }while(flag==true);

    }
}