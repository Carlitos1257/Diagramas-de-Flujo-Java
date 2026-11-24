import java.util.Scanner;
public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de elementos: ");
        int n = sc.nextInt();
        int mayores = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un valor: ");
            int valor = sc.nextInt();
            if (valor > 15) mayores++;
        }
        System.out.println("Valores mayores de 15: " + mayores);
        sc.close();
    }
}