/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_1;

/**
 *
 * @author aalvarezbretana
 */
public class Boletin4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche coche = new Coche();
        coche.acelerar(120);
        System.out.println(coche.getVelocidade());
        coche.frenar(50);
        System.out.println(coche.getVelocidade());

    }

}
