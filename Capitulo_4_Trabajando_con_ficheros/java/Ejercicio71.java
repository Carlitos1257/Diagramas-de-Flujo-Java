import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Ejercicio71 {
    public static void main(String[] args) {
        int categoria1 = 0, categoria2 = 0, categoria3 = 0, errores = 0;
        try (BufferedReader archivo = new BufferedReader(new FileReader("categorias.txt"))) {
            String linea;
            while ((linea = archivo.readLine()) != null) {
                String[] c = linea.split(";");
                if (c.length < 2) { errores++; continue; }
                switch (c[1].trim()) {
                    case "1": categoria1++; break;
                    case "2": categoria2++; break;
                    case "3": categoria3++; break;
                    default: errores++;
                }
            }
            System.out.println("Categoria 1: " + categoria1);
            System.out.println("Categoria 2: " + categoria2);
            System.out.println("Categoria 3: " + categoria3);
            System.out.println("Registros no validos: " + errores);
        } catch (IOException e) {
            System.out.println("No se pudo leer categorias.txt: " + e.getMessage());
        }
    }
}