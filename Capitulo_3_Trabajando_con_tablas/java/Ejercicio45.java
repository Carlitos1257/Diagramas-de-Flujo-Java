import java.util.Scanner;
public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de elementos: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
        } else {
            int[] datos = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Ingrese un valor: ");
                datos[i] = sc.nextInt();
            }
            int mayor = datos[0];
            for (int i = 1; i < n; i++) {
                if (datos[i] > mayor) mayor = datos[i];
            }
            System.out.println("El mayor valor es: " + mayor);
        }
        sc.close();
    }
}