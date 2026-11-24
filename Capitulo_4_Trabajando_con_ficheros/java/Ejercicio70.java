import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Ejercicio70 {
    public static void main(String[] args) {
        int menores = 0;
        int mujeres = 0;
        try (BufferedReader archivo = new BufferedReader(new FileReader("empleados.txt"))) {
            String linea;
            while ((linea = archivo.readLine()) != null) {
                String[] campos = linea.split(";");
                if (campos.length >= 3) {
                    int edad = Integer.parseInt(campos[1].trim());
                    String sexo = campos[2].trim().toUpperCase();
                    if (edad < 18) menores++;
                    if (sexo.equals("F")) mujeres++;
                }
            }
            System.out.println("Empleados menores de 18 años: " + menores);
            System.out.println("Empleadas de sexo femenino: " + mujeres);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Formato esperado: nombre;edad;M/F. " + e.getMessage());
        }
    }
}