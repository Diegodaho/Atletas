/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import com.mycompany.relevos.Hilo;
import com.mycompany.relevos.Equipo;
import com.mycompany.relevos.Principal;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tegui
 */
public class NewEmptyJUnitTest {
    
    static Principal pp;
    static Equipo e;
    static Hilo a;
    
    /**
     * metodo que hace comenzar los hios de la clase principal
     */
    @BeforeClass
    public static void setUpClass() {
        pp = new Principal();
        e = new Equipo("equipo1",0,100);
        a = new Hilo(e,0,100);
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    /**
     * metodo que mprime la trayectoria 
     */
    @Test
    public void trayecto(){
        String prueba ="Equipo: equipo1 |1--------------------------------|2--------------------------------|3----------------------------------";
        String trayecto = e.imprimir();
        assertEquals(prueba,trayecto);
            
    }
    /**
     * metodo para 
     */
    @Test
    public void entero(){
        int prueba = 2;
        int entero = a.avanzar(1);
        assertEquals(prueba,entero);
        
    
    }
    
}
