/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocontabancaria;

/**
 *
 * @author crisf
 */
public class Projetocontabancaria {

    public static void main(String[] args) {
      contabancaria objcontabanc = new contabancaria();
      objcontabanc.titular="Cristian Moraes Flores";
      objcontabanc.depositar(120);
      objcontabanc.sacar(20);
      objcontabanc.mostrarsaldo();
    }
    
}
