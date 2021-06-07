package ProEva3;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class CinemaBooking {

    //	declaración	de	variables	por	instancia
    private int numAsientosFree;
    private final int numAsientosCinema;

//	modificador
    public CinemaBooking(int asientos) {
        this.numAsientosCinema = asientos;
        this.numAsientosFree = this.numAsientosCinema;
    }
    // modificador

    public void reservar(int nasientos) {
        this.numAsientosFree -= nasientos;
    }
    //	modificador

    public void cancel(int nasientos) {
        this.numAsientosFree += nasientos;
    }
//

    public int consultar() {
        return this.numAsientosFree;

    }

}
