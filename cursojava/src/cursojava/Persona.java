/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;

/**
 *
 * @author marqu
 */
public class Persona {
    
   private  int edad;

   private char sexo;

   private String nombre;
   /**
    * Este metodo constructor esta vacio.
    */
    Persona (){
    }
    
    /**
     * 
     * @param n valor nombre
     * @param e valor edad
     * @param s  valor sexo
     */
    Persona( String n, int e, char s){
    edad=e;
    sexo = s;
    nombre=n;
    
    }
    
}
