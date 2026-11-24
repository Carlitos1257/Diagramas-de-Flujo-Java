import java.util.Scanner;
public class Ejercicio43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de valores: ");
        int n = sc.nextInt();
        int[] positivos = new int[n];
        int[] negativos = new int[n];
        int p = 0, neg = 0, ceros = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un valor: ");
            int x = sc.nextInt();
            if (x > 0) positivos[p++] = x;
            else if (x < 0) negativos[neg++] = x;
            else ceros++;
        }
        System.out.println("Positivos:");
        for (int i = 0; i < p; i++) System.out.println(positivos[i]);
        System.out.println("Negativos:");
        for (int i = 0; i < neg; i++) System.out.println(negativos[i]);
        System.out.println("Ceros: " + ceros);
        sc.close();
    }
}