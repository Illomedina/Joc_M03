/**
 * mycopy [inputfile] [outputfile]
 * copia el contingut d'inputfile a outputfile
 * si no existeix o no pot obrir inputfile dóna error i acaba
 * si no existeix outputfile el crea
 * si existeix elimina el contingut i escriu el contingut d'inputfile 
 *
 * @author Carles Añó
 */

 import java.io.File;
 import java.util.Scanner;
 import java.io.PrintStream;
 
 public class mycopy {
     
     public static void main (String[] args) {
         mycopy programa = new mycopy();
         programa.inici(args);
     }
     
     public void inici(String[] args) {
         try {
             //S'intenta obrir el fitxer d'entrada
             File fin = new File(args[0]);
             Scanner lector = new Scanner(fin);
             //System.out.println("fin: " + args[0]);
 
             //S'intenta obrir el fitxer de sortida
             File fout = new File(args[1]);
             PrintStream escriptor = new PrintStream(fout);
             //System.out.println("fout: " + args[1]);
 
 
             //Si s'executa aquesta instrucció, s'ha obert el fitxer
             while(lector.hasNextLine()) {
                 escriptor.println(lector.nextLine());  //llegim i escrivim
                 
             }
             //Cal tancar el fitxer
             lector.close();
             escriptor.close();
 
         } catch (Exception e) {
             //Excepció!
             System.out.println("Error: " + e);
         }
     }
 }