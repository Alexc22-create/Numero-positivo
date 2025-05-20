import java.util.Scanner;
import javax.swing.JOptionPane;

public class ciclopositivo {

    private static final Scanner scanner = new Scanner(System.in);

    public static int obtenerNumero (String mensaje){
    int numeroTemporal=1;
    while (numeroTemporal>0){
    System.out.println (mensaje + ": ");
    numeroTemporal = scanner.nextInt();
    return numeroTemporal;
    }
    }

    /*public static String obtenerCadena (String mensaje){
    String cadenaTemporal;
    System.out.println (mensaje + ": ");
    cadenaTemporal = scanner.nextLine();
    return cadenaTemporal;
    }*/

    public static void main (String[]args){
    
    

    }
}