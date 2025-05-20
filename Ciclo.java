import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ciclo {

    private static final Scanner scanner = new Scanner(System.in);

    public static int obtenerNumero(String mensaje) {

        int numerotemporal2 = 0;
        while (numerotemporal2 <= 0) {
           String numero = JOptionPane.showInputDialog("Ingresa el numero");
            numerotemporal2 = Integer.parseInt(numero);
        }
        return numerotemporal2;
    }

    public static void main(String[] args) {
        int numero = obtenerNumero("pato");
        JOptionPane.showMessageDialog(null, "El numero es:"+numero);
    }
}
