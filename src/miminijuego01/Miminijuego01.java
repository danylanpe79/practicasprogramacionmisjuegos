/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miminijuego01;


import java.util.Scanner;

/**
 *
 * @author Daniel Lanza Peña
 */
public class Miminijuego01 {

    public static String jugador="";
    public static String jugador1="";
    public static String ordenador="";
    public static int numerovictorias=0;
    public static int numerovictorias2=0;
    public static int comprobacion=0;
    
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        

    do{
    titulojuego();
    Eleccionjugador();
    if (comprobacion==0){
    Eleccionmaquina();
    Comparacion();
    Victoria(args);
    }
    else if (comprobacion==1){
        System.out.println("Vuelve a intentarlo");
        }
    }while((numerovictorias<3) && (numerovictorias2<3));    
    
    }

    
   public static void Eleccionjugador(){ 
         
       Scanner leer=new Scanner(System.in);
       System.out.printf("\nSaca piedra, papel o tijera\n");
       System.out.println("\nIntroduce tu jugada o teclea salir para terminar\n");
       jugador = leer.nextLine();
       
        switch (jugador){
            
     case "piedra":{
        piedra();
        comprobacion=0;
        break;
     }
     case "papel":{
         papel();
         comprobacion=0;
         break;
     }
     case "tijera":{
         tijera();
         comprobacion=0;
         break;
     }
     case "salir": {
         System.out.printf("Has elegido terminar el programa");
         System.exit(0); // Finaliza el programa con éxito

     }
     default:{
         System.out.println("Has introducido un elemento erroneo");
         comprobacion=1;
         break;
     }
     }
   
    }
    public static void Eleccionmaquina(){
 int jugada=(int) Math.floor(Math.random() * 3 + 1);
    if (jugada == 1) {
 ordenador = "tijera";
 System.out.println(ordenador);
 tijera();
 }
 if (jugada == 2) {
 ordenador = "papel";
 System.out.println(ordenador);
 papel();
 }
 if (jugada == 3) {
 ordenador= "piedra";
 System.out.println(ordenador);
 piedra();
    }
    }
    public static void Comparacion(){
        
        do{
    
 if (ordenador.equals(jugador)) {
         System.out.println("No tiene sentido que intentes empatar");
         System.out.println("El computo de victorias es: \n"
                +"Tu: "+numerovictorias+"\n"
                +"Ordenador: "+numerovictorias2);
         break;
         }
    if (jugador.equals("tijera") && (ordenador.equals("papel"))) {
 numerovictorias=numerovictorias+1;
 System.out.println("El computo de victorias es: \n"
                +"Tu: "+numerovictorias+"\n"
                +"Ordenador: "+numerovictorias2);
 break;
 }
 if (jugador.equals("papel") && (ordenador.equals("tijera"))) {
 numerovictorias2=numerovictorias2+1;
 System.out.println("El computo de victorias es: \n"
                +"Tu: "+numerovictorias+"\n"
                +"Ordenador: "+numerovictorias2);
 break;
 }
 if (jugador.equals("tijera") && (ordenador.equals("piedra"))) {
 numerovictorias2=numerovictorias2+1;
 System.out.println("El computo de victorias es: \n"
                +"Tu: "+numerovictorias+"\n"
                +"Ordenador: "+numerovictorias2);
 break;
 }
 if (jugador.equals("piedra") && (ordenador.equals("tijera"))) {
  numerovictorias=numerovictorias+1;
  System.out.println("El computo de victorias es: \n"
                +"Tu: "+numerovictorias+"\n"
                +"Ordenador: "+numerovictorias2);
  break;
 }
 if (jugador.equals("piedra") && (ordenador.equals("papel"))) {
 numerovictorias2=numerovictorias2+1;
 System.out.println("El computo de victorias es: \n"
                +"Tu: "+numerovictorias+"\n"
                +"Ordenador: "+numerovictorias2);
 break;
 }
 if (jugador.equals("papel") && (ordenador.equals("piedra"))) {
  numerovictorias=numerovictorias+1;
  System.out.println("El computo de victorias es: \n"
                +"Tu: "+numerovictorias+"\n"
                +"Ordenador: "+numerovictorias2);
  break;
 }    
   }while (numerovictorias!=3 && numerovictorias2!=3);

}
   public static void Victoria(String[] args){
    if (numerovictorias==3){
        System.out.println("El computo de victorias es: \n"
                +"Tu: "+numerovictorias+"\n"
                +"Ordenador: "+numerovictorias2);
        System.out.printf("Enhorabuena, has ganado el juego");
    }        
    if (numerovictorias2==3){
        System.out.println("El computo de victorias es: \n"
                +"Tu: "+numerovictorias+"\n"
                +"Ordenador: "+numerovictorias2);
        System.out.printf("Lo sentimos, has perdido la partida");
    }    
    
}
   
    
    
    // TODO code application logic here
    
    public static void tijera() {
 System.out.println("'''\n"
 + "       _______\n"
 + "   ---'   ____)____\n"
 + "           ________)\n"
 + "         ___________)\n"
 + "         (____)\n"
 + "   ---.__(___)\n"
 + "'''");
 }
public static void papel() {
 System.out.println("'''\n"
 + "    _______\n"
 + "---'   ____)______\n"
 + "        __________)\n"
 + "            _______)\n"
 + "          _______)\n"
 + "---.__________)\n");
 }    
 public static void piedra() {
 System.out.println("'''\n"
 + "    _______\n"
 + "---'   ____)\n"
 + "        (_____)\n"
 + "        (_____)\n"
 + "        (____)\n"
 + "---.____(___)\n"
 + "'''\n");
 }   
    
 public static void titulojuego() {
 System.out.println("\n |----'    |    |----     |----'     |----'      /'               |----'    /'     |---'     |----    |           |----|       -----    |        |    |----    |---'     /'     |---|\n"
 + " |    |    |    |         |    |     |    |    /    '             |    |   /   '   |    |    |        |           |    |         |      |        |    |        |    |   /   '   |    \n"
 + " |----'    |    |----     |     |    |---/    |------|            |---'   |-----|  |----'    |----    |           |    |         |      |        |    |----    |---'   |-----|  |---|\n"
 + " |         |    |         |    |     |   '    |      |    '--'    |       |     |  |         |        |           |    |         |      |    |   |    |        |    |  |     |      |\n"
 + " |         |    |----'    |---'      |    |   |      |    '--|    |       |     |  |         |----    '----       '----'         |      |    '--/     |----    |    |  |     |  |---|\n"
 + "                                                             /   \n");
}
}
 


 
 
 
 
 
  

