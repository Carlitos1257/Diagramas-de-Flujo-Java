import java.util.Scanner;
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] datos = new int[10];
        for (int i = 0; i < datos.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            datos[i] = sc.nextInt();
        }
        System.out.println("Elementos guardados:");
        for (int dato : datos) System.out.println(dato);
        sc.close();
    }
}