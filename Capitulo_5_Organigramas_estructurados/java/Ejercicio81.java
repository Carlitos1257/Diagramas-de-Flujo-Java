import java.util.Scanner;
public class Ejercicio81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos numeros desea procesar? ");
        int cantidad = sc.nextInt();
        for (int j = 1; j <= cantidad; j++) {
            System.out.print("Ingrese un numero entre 0 y 20: ");
            int n = sc.nextInt();
            if (n < 0 || n > 20) {
                System.out.println("Valor fuera del rango permitido.");
            } else {
                long factorial = 1;
                for (int i = 1; i <= n; i++) factorial *= i;
                System.out.println("Factorial de " + n + ": " + factorial);
            }
        }
        sc.close();
    }
}