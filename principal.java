import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();

        System.out.println("Ingrese el número de filas:");
        while (!sc.hasNextInt()) {
            System.out.println("Por favor, ingrese un número válido para las filas:");
            sc.next();
        }
        int filas = sc.nextInt();

        System.out.println("Ingrese el número de columnas:");
        while (!sc.hasNextInt()) {
            System.out.println("Por favor, ingrese un número válido para las columnas:");
            sc.next();
        }
        int columnas = sc.nextInt();

        objteatro[][] t = m.G(filas, columnas, sc);
        m.Ordenprecio(t);

        System.out.println("\n--- Teatro ordenado por precio (ascendente) en cada fila ---");
        for (int i = 0; i < t.length; i++) {
            System.out.println("Fila matriz " + i + ":");
            for (int j = 0; j < t[i].length; j++) {
                objteatro a = t[i][j];
                System.out.println("  Col " + j +
                        " -> Numero: " + a.getNumero() +
                        ", Fila: " + a.getFila() +
                        ", Precio: " + a.getPrecio());
            }
        }

        sc.close();
    }
}