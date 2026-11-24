import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Ejercicio68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (BufferedWriter archivo = new BufferedWriter(new FileWriter("directo.txt"))) {
            for (int clave = 1; clave <= 200; clave++) {
                System.out.print("Dato para la clave " + clave + ": ");
                String dato = sc.nextLine();
                archivo.write(clave + ";" + dato);
                archivo.newLine();
            }
            System.out.println("Se guardaron 200 registros.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}