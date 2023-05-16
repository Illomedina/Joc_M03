package HISTORIC.M03_Joc;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ParaulaJocTest {
 //Atributs de la classe
 private String paraulaCatala;
 private String paraulaAngles;
 private int intentsCA;
 private int intentsAC;
 

    //Constructor de la classe
    public ParaulaJocTest(String cadenaParaules){
    String [] arrayseparar = new String[4];
    arrayseparar = cadenaParaules.split(";");
    this.paraulaCatala = arrayseparar[0];
    this.paraulaAngles = arrayseparar[1];
    this.intentsCA = Integer.parseInt(arrayseparar[2]); 
    this.intentsAC = Integer.parseInt(arrayseparar[3]);
    }
    
    public String getParaulaCatala()
    {
        return paraulaCatala;
    }

    public void setParaulaCatala(String paraulaCatala) 
    {
        this.paraulaCatala = paraulaCatala;
    }

    public String getParaulaAngles(){
        return paraulaAngles;
    }

    public void setParaulaAngles(String paraulaAngles){
        
        this.paraulaAngles = paraulaAngles;
    }

    public int getIntentsCA(){
        return intentsCA;
    }

    public void setIntentsCA(int intentsCA){
        this.intentsCA = intentsCA;
    }  
    
    public int getIntentsAC(){
        return intentsAC;
    }

    public void setIntentsAC(int intentsAC){
        this.intentsAC = intentsAC;
    }

    public String toString(){
        return this.paraulaCatala + " " + this.paraulaAngles + " " + this.intentsCA + " " + this.intentsAC;
    }

public static void main(String[] args) {
    File paraules_joc = new File("/home/super/Escritorio/historic/paraules-partides.txt");
    ParaulaJocTest[] paraulaobjecte = new ParaulaJocTest[10];
    try (Scanner sc = new Scanner(paraules_joc, StandardCharsets.UTF_8))
    {  
        String lineajoc = sc.nextLine();
        System.out.println(lineajoc);
        paraulaobjecte[0] = new ParaulaJocTest(lineajoc);
        System.out.println(paraulaobjecte[0]);
        sc.close();
    }catch (IOException e) {
        e.printStackTrace();
    }
     /* String cadenaParaules;
    cadenaParaules = "Hola;Hello;0;0";


  ParaulaJocTest paraulaJoc1 = new ParaulaJocTest(cadenaParaules);
    System.out.println(paraulaJoc1.getParaulaAngles());
    System.out.println(paraulaJoc1.getIntentsAC());
    System.out.println(paraulaJoc1.toString()); */





}
}
