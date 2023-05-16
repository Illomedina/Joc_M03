package HISTORIC.M03_Joc;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class lecturaFitxers{
    public static ParaulaJoc [] llegirFitxer(String fitxer, ParaulaJoc [] llistaObjectes){
        String stringValors;
        File paraules_joc = new File("J:/Github/M3/joc_M03/Joc_M03/historic/M03_Joc/HISTORIC/M03_Joc/paraules-partides.txt");
        //int i = 0;
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
    ParaulaJoc [] llistaParaules = new ParaulaJoc [10];

    llistaParaules = lecturaFitxers.llegirFitxer("paraules-partides.txt", llistaParaules);
    for(int i = 0; i < llistaParaules.length; i++){
        System.out.println(llistaParaules[i].toString());

    }
  
  
  }
  }
