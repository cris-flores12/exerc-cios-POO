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
public class contabancaria {
String titular;
double saldo;
public void depositar(double valor){
    System.out.println("a conta presente é:"+titular);
    System.out.println("o valor depositado foi:"+valor );
    saldo=valor;
}
public void sacar (double valor){
    System.out.println("o valor do saque foi:"+valor);
    if (valor>saldo) {
        System.out.println("valor acima do saldo, saque ineficaz");
    }else{
        System.out.println("saque feito");
        saldo-=valor;
    }
}
public void mostrarsaldo(){
    System.out.println("o saldo total é:" + saldo);
}
}
