/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosjava;

/**
 *
 * @author Joan Marí
 */
public class EjerciciosJava {

    /**
     * 
     * @param numBellotas
     * @param finDeSemana
     * @return 
     */
   public boolean fiestaArdillas(int numBellotas, boolean finDeSemana){
       // si es fin de semana da igual cuantas bellotas haya
       if (finDeSemana){
       return true;
       }
       //si hay entre  40 y 60 bellotas, exito
       if (40 <= numBellotas && numBellotas <= 60){
           return true;
       }
       return false;
   }
       
        /**
         * 
         * @param velocidad valores entre 60 y 80
         * @param birthday indica si es tu cumpleaños
         * @return se devuelve 0  1 o  2 dependiendo de tu velocidad y de si es tu cumpleaños o no  < >
         */
       public  int multa (int velocidad, boolean birthday){
           if  (birthday){
               velocidad -=5; //si es mi cumple, me quitan 5 de la velocidad permitida
           }
           if (velocidad <= 60){
               return 0;
           }
           if (60 < velocidad && velocidad <= 80){
               return 1;//pequeña multa
           }
           return 2;
       }
       
       public boolean muyVanidoso(int multiplo){
           if (multiplo %11 == 0){
               return true;
           }
           if ((multiplo -1)%11 == 0){
               return true;
           }
           return false;
       }
    
    public static void main(String[] args) {
        EjerciciosJava ejercicio = new EjerciciosJava();
        //test del primer ejercicio
        System.out.println("Ejercicio o1: ARDILLAS");
        System.out.println("30,false:" + ejercicio.fiestaArdillas(30, false));
        System.out.println("50,false:" + ejercicio.fiestaArdillas(50, false));
        System.out.println("70,true:" + ejercicio.fiestaArdillas(70, true));
        
         //test del segundo ejercicio
        System.out.println("Ejercicio o2: multa");
        System.out.println("60,false:" + ejercicio.multa(60, false));
        System.out.println("65,false:" + ejercicio.multa(65, false));
        System.out.println("65,true:" + ejercicio.multa(65, true));
        
        //test del tercer ejercicio
        System.out.println("Ejercicio o3: vanidoso");
        System.out.println("22:" + ejercicio.muyVanidoso(22));
        System.out.println("23" + ejercicio.muyVanidoso(24));
        System.out.println("24" + ejercicio.muyVanidoso(24));
    }
    
}
