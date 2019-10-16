/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_3;

/**
 *
 * @author aalvarezbretana
 */
public class Circulo {

    private double radio;
    private final double PI = 3.14;

    public Circulo() {
        radio = 0;
    }

    public Circulo(double r) {
        radio = r;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        double area = 2 * PI * Math.pow(radio, 2);
        return area;
    }

    public double calcularLonxitude() {
        double lonxitude = 2 * PI * radio;
        return lonxitude;
    }

}
