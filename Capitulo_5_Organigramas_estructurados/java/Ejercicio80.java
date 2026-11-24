import java.util.Scanner;
public class Ejercicio80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de numeros: ");
        int n = sc.nextInt();
        int pares = 0, impares = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese numero: ");
            int valor = sc.nextInt();
            if (valor % 2 == 0) pares++;
            else impares++;
        }
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
        sc.close();
    }
}