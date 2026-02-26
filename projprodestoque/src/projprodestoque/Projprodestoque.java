/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projprodestoque;

/**
 *
 * @author crisf
 */
public class Projprodestoque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      produto objprod = new produto();
      objprod.nome = "revista";
      objprod.preço=(12);
      objprod.quantidadeestoque=69;
      objprod.vender(23);
      objprod.repor(7);
      objprod.mostrarestoque();
    }
    
}
