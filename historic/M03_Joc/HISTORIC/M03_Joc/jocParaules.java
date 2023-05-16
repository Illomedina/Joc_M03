package HISTORIC.M03_Joc;
import java.util.Scanner;

public class jocParaules {
  public static void main(String[] args) {
     //longitud del Array
     final int N = 4; 
    //Declaración de la Arrray d'objectes
    paraulaJoc[] llistaparaules = new paraulaJoc[N]; 
        
    //declarar scanner
    Scanner sc = new Scanner(System.in);
    int opcio; //variable que usaremos para elegir opciones en el programa.
    do{
      
        //El programa ens demana quina opció inicial volem
        System.out.println("Tria una opció:");
        System.out.println("Opció 1: Jugar");
        System.out.println("Opció 2: Gestionar l'aplicació");
        System.out.println("Opció 3: Sortir de l'aplicació");
        //Guardem el valor que hem triat a la variable opcio
        opcio = sc.nextInt();
        //Introduim l'opcio
        switch(opcio){
          
            case 1:
            //Codigo del juego.
            
            
            
            case 2:
            //En este caso se gestiona la aplicación.
                do{
                    System.out.println("Tria una opció de gestió:");
                    System.out.println("Opció 1: Afegir ");
                    System.out.println("Opció 2: Modificar");
                    System.out.println("Opció 3: Esborrar");
                    System.out.println("Opció 4: Arxivar");
                    System.out.println("Opció 5: Consultar");
                    System.out.println("Opció 6: Sortir");
                    //Introdueix un valor que determina quin cas vol realitzar i el guardem en opcio
                    opcio = sc.nextInt();

                    switch(opcio){
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        
                       
                    }
            
        
        
                }   
                while(opcio!= 6);
                System.out.println("Sortint de la gestió");
                break;
            case 3:
            //Sortint del joc           
            System.out.println("Sortint del programa");
            break;
        }
    }
    while(opcio!= 3);
    //Sortint de l'aplicació
    System.out.println("Sortint de l'aplicació");
    break;
    
    
    

    
  
}
}


    
