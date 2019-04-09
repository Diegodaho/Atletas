/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relevos;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author tegui
 * @author Diego
 */

public class Hilo extends Thread {

    Equipo equipo;
    private int posicion;
    private int fin;
    private String equipo1;
    private String equipo2;
    private String equipo3;
    
    /**
     * metodo constructor para Hilo
     * @param equipo equipo de hilo
     * @param posicion posicio de hilo
     * @param fin  fin de hilo
     */
    public Hilo(Equipo equipo, int posicion, int fin) {
        this.equipo = equipo;
        this.posicion = posicion;
        this.fin = fin;
    }
    
    /**
     * metdodo para arrancar los hilos
     */

    @Override
    public void run() {
  
         
        if (posicion == 0) {//inicializacion de la posicion en cero al primer atleta
            while (true) {
                int pasoActual = avanzar(1);
                if (pasoActual >= 33) {
                    equipo.setRelevo1(33);
                    synchronized (equipo) {
                        equipo.notifyAll();//notificacion a todos los hilos
                        posicion = 33;
                    }
                    break;
                }
            }
        } else {
            synchronized (equipo) {
                try {
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        if (posicion == 33) {//segundo alteta comienza cundo   la posicion esta en 33
            while (true) {
                int pasoActual = avanzar(2);
                if (pasoActual >= 66) {
                    equipo.setRelevo2(66);
                    synchronized (equipo) {
                        equipo.notify();
                    }
                    break;
                }
            }
        } else {
            synchronized (equipo) {
                try {
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        if (posicion == 66) {//segundo alteta comienza cundo   la posicion esta en 33
            while (true) {
                int pasoActual = avanzar(3);
                if (pasoActual >= 100) {
                    equipo.setRelevo3(100);
                    System.out.println("El ganador es: "+equipo.getNombre());
                    System.exit(0);
                    break;
                }
            }
        } else {
            synchronized (equipo) {
                try {
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }
    /**
     * metodo para avanzar los atletas del 1 (el que inicia)
     * @param numeroAtleta donde se iguala segun el atleta si es 1,2 y 3
     * @return 0
     */

    public int avanzar(int numeroAtleta) {
        try {
            Thread.sleep(500);            
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
        }
        int pasos = Utilitaria.random();
        if (numeroAtleta == 1) {//atleta uno donde se imprime  los corredores correspondientes a la primera tanda
            equipo.setRelevo1(equipo.getRelevo1() + pasos);
            if(equipo.imprimir().contains("Corredores1")){
                equipo1=equipo.imprimir();
            }else if(equipo.imprimir().contains("Corredores2")){
                equipo2=equipo.imprimir();
            }else if(equipo.imprimir().contains("Corredores3")){
                equipo3=equipo.imprimir();
            }
            if(equipo1!=null){
                System.out.println(equipo1);
            }
            if(equipo2!=null){
                System.out.println(equipo2);
            }
            if(equipo3!=null){
                System.out.println(equipo3);
            }            
            return equipo.getRelevo1();
        }
        if (numeroAtleta == 2) {//atleta 2 donde se imprime  los corredores correspondientes a la segunda tanda
            equipo.setRelevo2(equipo.getRelevo2() + pasos);
            if(equipo.imprimir().contains("Corredores1")){
                equipo1=equipo.imprimir();
            }else if(equipo.imprimir().contains("Corredores2")){
                equipo2=equipo.imprimir();
            }else if(equipo.imprimir().contains("Corredores3")){
                equipo3=equipo.imprimir();
            }
            if(equipo1!=null){
                System.out.println(equipo1);
            }
            if(equipo2!=null){
                System.out.println(equipo2);
            }
            if(equipo3!=null){
                System.out.println(equipo3);
            }
            return equipo.getRelevo2();
        }
        if (numeroAtleta == 3) {//atleta u3 donde se imprime  los corredores correspondientes a la primera tanda
            equipo.setRelevo3(equipo.getRelevo3() + pasos);
            if(equipo.imprimir().contains("Corredores1")){
                equipo1=equipo.imprimir();
            }else if(equipo.imprimir().contains("Corredores2")){
                equipo2=equipo.imprimir();
            }else if(equipo.imprimir().contains("Corredores3")){
                equipo3=equipo.imprimir();
            }
            if(equipo1!=null){
                System.out.println(equipo1);
            }
            if(equipo2!=null){
                System.out.println(equipo2);
            }
            if(equipo3!=null){
                System.out.println(equipo3);
            }
            
            return equipo.getRelevo3();
        }
        return 0;
    }
}
