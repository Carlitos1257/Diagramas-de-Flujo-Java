import java.util.Scanner;
public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] datos = new int[10];
        int suma = 0;
        for (int i = 0; i < datos.length; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            datos[i] = sc.nextInt();
            suma += datos[i];
        }
        System.out.println("Suma de los diez elementos: " + suma);
        sc.close();
    }
}