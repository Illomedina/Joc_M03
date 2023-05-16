package HISTORIC.M03_Joc;
public class ParaulaJoc {
 //Atributs de la classe
 private String paraulaCatala;
 private String paraulaAngles;
 private int intentsCA;
 private int intentsAC;
 

    //Constructor de la classe
    public ParaulaJoc(String cadenaParaules){
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

    
        
}