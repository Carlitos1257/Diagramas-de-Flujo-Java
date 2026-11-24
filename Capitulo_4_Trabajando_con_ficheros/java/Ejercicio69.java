import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Ejercicio69 {
    public static void main(String[] args) {
        int nacidos1940 = 0;
        int nacidos1941 = 0;
        try (BufferedReader archivo = new BufferedReader(new FileReader("empleados.txt"))) {
            String linea;
            while ((linea = archivo.readLine()) != null) {
                String[] campos = linea.split(";");
                if (campos.length >= 2) {
                    int anio = Integer.parseInt(campos[1].trim());
                    if (anio == 1940) nacidos1940++;
                    if (anio == 1941) nacidos1941++;
                }
            }
            System.out.println("Empleados nacidos en 1940: " + nacidos1940);
            System.out.println("Empleados nacidos en 1941: " + nacidos1941);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Revise empleados.txt (formato nombre;anio). " + e.getMessage());
        }
    }
}