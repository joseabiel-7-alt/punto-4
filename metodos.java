
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class metodos {

    public objteatro[][] G(int filas, int columnas, Scanner sc) {
        objteatro[][] t = new objteatro[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                t[i][j] = new objteatro();

                System.out.println("ingrese el número del asiento");
                while (!sc.hasNextInt()) {
                    System.out.println("Por favor, ingrese un número válido para el asiento:");
                    sc.next();
                }
                int numero = sc.nextInt();
                System.out.println("ingrese la fila del asiento");
                char fila = sc.next().charAt(0);
                System.out.println("ingrese el precio del asiento");
                while (!sc.hasNextDouble()) {
                    System.out.println("Por favor, ingrese un número válido para el precio del asiento:");
                    sc.next();
                }
                double precio = sc.nextDouble();

                t[i][j].setNumero(numero);
                t[i][j].setFila(fila);
                t[i][j].setPrecio(precio);
            }
        }
        return t;
    }

    public void Ordenprecio(objteatro[][] t) {
        for (int i = 0; i < t.length; i++) {
            Arrays.sort(t[i], new Comparator<objteatro>() {
               
                public int compare(objteatro a, objteatro b) {
                    if (a == null && b == null) {
                        return 0;
                    }
                    if (a == null) {
                        return 1;   // nulls al final

                    }
                    if (b == null) {
                        return -1;  // nulls al final
                    }
                    return Double.compare(a.getPrecio(), b.getPrecio());
                }
        });
        }
    }
}

