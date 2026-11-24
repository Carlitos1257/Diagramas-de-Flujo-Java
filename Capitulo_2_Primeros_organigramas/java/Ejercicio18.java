import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero no negativo: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("No existe factorial para negativos.");
        } else if (n > 20) {
            System.out.println("Ingrese un numero hasta 20 para evitar desbordamiento.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= n; i++) factorial = factorial * i;
            System.out.println("El factorial de " + n + " es " + factorial);
        }
        sc.close();
    }
}