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
public class Equipo extends Thread {
    
    
    
   
    private String nombre;
    private int inicio;
    private int fin;
    private int relevo1;
    private int relevo2;
    private int relevo3;
   
    /**
     * Constructor Equipo
     * @param nombre nombre de Equipo 
     * @param inicio inicio de equipo 
     * @param fin  fin de Equipo 
     */
    public Equipo(String nombre, int inicio, int fin) {
        this.nombre = nombre;
        this.inicio = inicio;
        this.fin = fin;
        this.relevo1 = 0;
        this.relevo2 = 33;
        this.relevo3 = 66;
    }
    
    /**
     * metodo para ver nombre de Equipo 
     * @return nombre
     */
    
    public String getNombre() {
        return nombre;
    }
    
    /**
     * metodo para crear nombre de Equipo
     * @param nombre nuevo nombre
     */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * metodo para ver inicio de Equipo
     * @return inicio
     */
    
    public int getInicio() {
        return inicio;
    }
    /**
     * metodo para crear inicio de Equipo
     * @param inicio nuevo inicio
     */
    
    public void setInicio(int inicio) {
        this.inicio = inicio;
    }
    /**
     * metodo para ver fin de Equipo
     * @return int inicio
     */
    
    public int getFin() {
        return fin;
    }
    /**
     * metodo para crear nombre de Equipo
     * @param fin nuevo fin
     */
    
    public void setFin(int fin) {
        this.fin = fin;
    }
    /**
     * metodo para ver relevo1 nombre de Equipo
     * @return int relevo
     */
    
    public int getRelevo1() {
        return relevo1;
    }
    /**
     * metodo para crear relevo de Equipo
     * @param relevo1 nuevo relevo1
     */
    
    public void setRelevo1(int relevo1) {
        this.relevo1 = relevo1;
    }
    /**
     * metodo para ver relevo2 de Equipo
     * @return int relevo2
     */
    
    public int getRelevo2() {
        return relevo2;
    }
    /**
     * metodo para crear relevo2 de Equipo
     * @param relevo2 nuevo relevo
     */
    
    public void setRelevo2(int relevo2) {
        this.relevo2 = relevo2;
    }
    /**
     * metodo para ver relevo3 de Equipo
     * @return int relevo3
     */
    
    public int getRelevo3() {
        return relevo3;
    }
    /**
     * metodo para crear relevo3 de Equipo
     * @param relevo3 nuevo relevo
     */
   
    public void setRelevo3(int relevo3) {
        this.relevo3 = relevo3;
    }
    /**
     * metodo para sincronizar 
     * @return trayecto
     */
    
    public synchronized String imprimir() {
        String trayecto = "Equipo: "+nombre+" ";
        for (int i = inicio; i <= fin; i++) {
            if (i == relevo1) {
                trayecto += "|1";
            } else if (i == relevo2) {
                trayecto += "|2";
            } else if (i == relevo3) {
                trayecto += "|3";
            } else {
                trayecto += "-";
            }
        }
        
        return trayecto;
        
    }

}
