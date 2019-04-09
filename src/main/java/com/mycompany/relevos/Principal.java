/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relevos;

/**
 *
 * @author tegui
 * @author Diego
 */
public class Principal {
    
    /**
     * creacion de hilos de tres equipos invocando la clase Equipo  
     * creacion de hilos de 9  atltas invocando la clase hilo
     * 
     */
   
    Equipo equipo1 = new Equipo("Corredores1", 0, 100);
    Equipo equipo2 = new Equipo("Corredores2", 0, 100);
    Equipo equipo3 = new Equipo("Corredores3", 0, 100);
    Hilo atleta1 = new Hilo(equipo1, 0, 33);
    Hilo atleta2 = new Hilo(equipo2, 0, 33);
    Hilo atleta3 = new Hilo(equipo3, 0, 33);
    Hilo atleta4 = new Hilo(equipo1, 33, 66);
    Hilo atleta5 = new Hilo(equipo2, 33, 66);
    Hilo atleta6 = new Hilo(equipo3, 33, 66);
    Hilo atleta7 = new Hilo(equipo1, 66, 100);
    Hilo atleta8 = new Hilo(equipo2, 66, 100);
    Hilo atleta9 = new Hilo(equipo3, 66, 100);
    
   /**
    * inicializacion de los hilos
    */
    
    public void iniciar(){
        
        atleta1.start ();
        atleta2.start ();
        atleta3.start ();
        atleta4.start ();
        atleta5.start ();
        atleta6.start ();
        atleta7.start ();
        atleta8.start ();
        atleta9.start ();
        
    }
}