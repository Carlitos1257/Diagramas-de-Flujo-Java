import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad: ");
        double cantidad = sc.nextDouble();
        System.out.print("Ingrese el porcentaje: ");
        double porcentaje = sc.nextDouble();
        double resultado = cantidad * porcentaje / 100.0;
        System.out.println("El " + porcentaje + "% de " + cantidad + " es " + resultado);
        sc.close();
    }
}