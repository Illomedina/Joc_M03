package HISTORIC.M03_Joc;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.io.PrintStream;


public class lecturaFitxers{
    
    //Escribe fitxer, entrada  cadena de texto con el nombre del fichero, salida: array de objetos, guarda todo en la array lo del fichero.
    public static void escriureFitxer(ParaulaJoc [] llistaObjectes, String fitxers){
        //Declarem la clase file
        File filein = new File(fitxers);
        //Declareem el escriptor
        try(PrintStream escriptor = new PrintStream(filein);)
        {
            
            //PrintStream escriptor = new PrintStream(filein); 
            for(int i = 0; i < llistaObjectes.length; i++){
                escriptor.println(llistaObjectes[i].toString());

                
            }
            
            escriptor.close();

            
        }catch (IOException e) {
            e.printStackTrace();
        }
        //Fem un bucle que s'execuute tantes vegades com llargaria de l'array
            //transformem cada objecte en un string
            //introduim este string a l'arrxiu
    }   
    

    
    public static int contadorLinies (String fitxer ){
        int contador = 0;
        File file = new File(fitxer);
        
        try (Scanner sc = new Scanner(file ,StandardCharsets.UTF_8.name()))
            {  while(sc.hasNextLine()){
                sc.nextLine();
                contador ++;
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
        return contador;
        
    }


    public static ParaulaJoc [] llegirFitxer(String fitxer, ParaulaJoc [] llistaObjectes){
        String stringValors;
        File paraules_joc = new File(fitxer);
        try (Scanner sc = new Scanner(paraules_joc,StandardCharsets.UTF_8.name()))
        { 
            for(int i = 0; i < llistaObjectes.length && sc.hasNext(); i++){
            //Mentre hague una linea
                stringValors = sc.nextLine();
                //System.out.println(stringValors);
                //Cada vegada que trobe un string anem a crear un objecte i guardarlo en l'array de Objectes
                llistaObjectes[i] = new ParaulaJoc(stringValors);
            }            
        }catch (IOException e) {
            e.printStackTrace();
        }
         
  
    return llistaObjectes;
    }

  public static void main(String[] args) {
    ParaulaJoc [] llistaParaules = new ParaulaJoc [lecturaFitxers.contadorLinies("/home/super/Joc/Joc_M03/historic/M03_Joc/HISTORIC/M03_Joc/paraules-partides.txt")];
    //lecturaFitxers.llegirFitxer("J:/Github/M3/joc_M03/Joc_M03/historic/M03_Joc/HISTORIC/M03_Joc/paraules-partides.txt, llistaParaules");
    lecturaFitxers.llegirFitxer("/home/super/Joc/Joc_M03/historic/M03_Joc/HISTORIC/M03_Joc/paraules-partides.txt", llistaParaules);
    
    System.out.println(contadorLinies("/home/super/Joc/Joc_M03/historic/M03_Joc/HISTORIC/M03_Joc/paraules-partides.txt"));

    for(int i = 0; i < llistaParaules.length; i++){
        System.out.println(llistaParaules[i].toString());

    }
  
  
  }
  }
