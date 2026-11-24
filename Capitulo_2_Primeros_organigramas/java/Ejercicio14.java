import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos multiplos desea sumar? ");
        int n = sc.nextInt();
        int i = 1, suma = 0;
        while (i <= n) {
            suma = suma + (i * 5);
            i++;
        }
        System.out.println("La suma es: " + suma);
        sc.close();
    }
}