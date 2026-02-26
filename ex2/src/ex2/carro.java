/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author crisf
 */
public class carro {
    String marca;
    String modelo;
    boolean ligado;
    public void ligar(){
        System.out.println("a marca do carro é: " + marca);
        System.out.println("o modelo do carro é: " + modelo);
        ligado=true;
        if (ligado==true) {
            System.out.println("carro ligado");
        }
                
    }
    public void deliga(){
        System.out.println("a marca do carro é: " + marca);
        System.out.println("o modelo é: "+ modelo);
        ligado=false;
        if (ligado==false) {
            System.out.println("carro desligado");
        }
    }
    public void status(){
        if (ligado==true) {
            System.out.println("status:ligado");
        }else{
            System.out.println("status:desligado");
        }
    }
}


