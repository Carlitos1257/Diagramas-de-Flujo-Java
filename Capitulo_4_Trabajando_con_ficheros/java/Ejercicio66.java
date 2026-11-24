import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Ejercicio66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (BufferedWriter archivo = new BufferedWriter(new FileWriter("registros.txt"))) {
            for (int i = 1; i <= 1000; i++) {
                System.out.print("Dato del registro " + i + ": ");
                String dato = sc.nextLine();
                archivo.write(i + ";" + dato);
                archivo.newLine();
            }
            System.out.println("Se guardaron 1000 registros en registros.txt");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
        sc.close();
    }
}