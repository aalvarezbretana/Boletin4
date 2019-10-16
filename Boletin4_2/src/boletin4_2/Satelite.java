/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_2;

/**
 *
 * @author aalvarezbretana
 */
public class Satelite {

    private double meridiano;
    private double paralelo;
    private double distanciaTerra;

    public void Satelite() {

        meridiano = 0;
        paralelo = 0;
        distanciaTerra = 0;
    }

    public void Satelite(double m, double p, double d) {

        meridiano = m;
        paralelo = p;
        distanciaTerra = d;
    }

    public void verPosicion() {

        System.out.println("O satélite atópase no paralelo "
                + paralelo + " meridiano " + meridiano
                + ", a unha distancia da terra " + distanciaTerra + ".");
    }
}
