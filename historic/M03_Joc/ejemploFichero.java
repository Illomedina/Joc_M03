/*
 * Ejemplo de cómo leer un fichero, este programa lee los datos de un fichero y los imprime.
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ejemploFichero {

    private String palabraCA;
    private String palabraAN;

    // Constructor
    public ejemploFichero(String palabraCA, String palabraAN) {
        this.palabraCA = palabraCA;
        this.palabraAN = palabraAN;
    }

    public String toString() {
        return this.palabraCA + "\t" + this.palabraAN;
    }

    public static void main(String[] args) {
        File file = new File("/home/super/Escritorio/historic/paraules-partides.txt");
        try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8))
        {
            // Llegeix 1er llibre
            String palabraCA = sc.nextLine();
            String palabraAN = sc.nextLine();
            ejemploFichero a1 = new ejemploFichero(palabraCA, palabraAN);
    
            // Llegeix 2on llibre
            palabraCA = sc.nextLine();
            palabraAN = sc.nextLine();
            ejemploFichero a2 = new ejemploFichero(palabraCA, palabraAN);

            // Imprimeix
            System.out.println();
            System.out.println(a1.toString());
            System.out.println(a2.toString());
            System.out.println();
    
            sc.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}