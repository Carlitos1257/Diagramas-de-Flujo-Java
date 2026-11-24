import java.util.Scanner;
public class Ejercicio79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos multiplos desea? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) System.out.println(i * 3);
        sc.close();
    }
}