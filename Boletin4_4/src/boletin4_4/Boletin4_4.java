/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_4;

/**
 *
 * @author aalvarezbretana
 */
public class Boletin4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta conta = new Conta();
        conta.setSaldo(-20);
        System.out.println("O saldo da conta é " + conta.getSaldo());
        System.out.println("O saldo co ingreso é " + conta.ingreso(5));
        if (conta.getSaldo() < 0) {
            conta.reintegro(10);
        } else {
            System.out.println("O saldo co reintegro é " + conta.reintegro(10));
        }
        Conta contaOrixe = new Conta();
        Conta contaDestino = new Conta();
        contaOrixe.setSaldo(100);
        contaDestino.setSaldo(25);
        contaOrixe.transferencia(contaDestino, 50);
        System.out.println("O saldo da conta orixe coa transferencia "
                + "sería de " + contaOrixe.getSaldo());
        System.out.println("O saldo da conta destino coa "
                + "transferencia sería de " + contaDestino.getSaldo());
    }

}
