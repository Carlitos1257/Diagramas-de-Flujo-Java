import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Ejercicio67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (BufferedWriter archivo = new BufferedWriter(new FileWriter("indexados.txt"))) {
            System.out.print("Cuantos registros desea guardar? ");
            int n = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < n; i++) {
                System.out.print("Clave: ");
                String clave = sc.nextLine();
                System.out.print("Dato: ");
                String dato = sc.nextLine();
                archivo.write(clave + ";" + dato);
                archivo.newLine();
            }
            System.out.println("Archivo indexados.txt creado.");
        } catch (IOException | NumberFormatException e) {
            System.out.println("No fue posible crear el archivo: " + e.getMessage());
        }
        sc.close();
    }
}