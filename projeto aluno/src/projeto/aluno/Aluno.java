/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.aluno;

/**
 *
 * @author crisf
 */
public class Aluno {
    String nome;
    double nota1;
    double nota2;
    
    
    public void calcularMedia(){
        double media = (nota1+nota2)/2;
        System.out.println("nome:"+nome);
        System.out.println("nota1:"+nota1);
        System.out.println("nota2:"+nota2);
        System.out.println("média:"+media);
      
    }
    public void verificarsituação(){
        double media=(nota1+nota2)/2;
        if(media>=7){
            System.out.println("situação: aprovado");
        }else if(media>=5){
            System.out.println("situação: recuperação");
        }else{
            System.out.println("situação: reprovado");
        }
    }
    
}

