import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int numero = sc.nextInt();
        if (numero % 5 == 0) {
            System.out.println(numero + " es multiplo de 5.");
        } else {
            System.out.println(numero + " no es multiplo de 5.");
        }
        sc.close();
    }
}