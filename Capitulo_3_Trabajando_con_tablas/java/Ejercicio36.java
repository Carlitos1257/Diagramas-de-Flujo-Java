import java.util.Scanner;
public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de elementos: ");
        int n = sc.nextInt();
        int positivos = 0, negativos = 0, ceros = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un numero: ");
            int valor = sc.nextInt();
            if (valor > 0) positivos++;
            else if (valor < 0) negativos++;
            else ceros++;
        }
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
        sc.close();
    }
}