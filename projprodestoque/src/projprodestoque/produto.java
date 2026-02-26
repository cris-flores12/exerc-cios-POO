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
public class produto {
String nome;
double preço;
int quantidadeestoque;
public void vender(int quantidade){
    System.out.println("nome do produto comprado:"+nome);
    System.out.println("preço do produto:"+preço);
    System.out.println("quantidade que possui no estoque:"+quantidadeestoque);
    System.out.println("quantidade de produtos comprados:"+quantidade);
    if (quantidadeestoque<quantidade) {
        System.out.println("acima do estoque, favor comprar menos");
    }else{
        System.out.println("compra realizada");
        quantidadeestoque-=quantidade;
    }
}
public void repor(int quantidade){
    quantidadeestoque+=quantidade;
    System.out.println("a quantidade "+ nome +" reposto foi " + quantidade);
}
public void mostrarestoque(){
    System.out.println("a quantidade do estoque é:" + quantidadeestoque);
}
}
