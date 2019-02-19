/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2;

/**
 *
 * @author Estudiante
 */
public class Ejemplo2 {

   public static String deStringaBinario(int d){
       String aux="";
       Integer r;
       
       while((d!=1)&&(d!=0)){
           r=d%2;
           aux=aux+r.toString();
           d=d/2;
       }
       aux=aux+d;
       String aux2="";
       for(int i=aux.length()-1;i>=0;i--){
           aux2=aux2+aux.charAt(i);
       }
       return aux2;
   }
    public static void main(String[] args) {
       String aux2 = null;
        System.out.println("aux2"+aux2);
    }
    
}
