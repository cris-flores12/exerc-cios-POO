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
public class ProjetoAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno=new Aluno();
        aluno.nota1=7;
        aluno.nota2=5;
        aluno.nome="Cristian Moraes Flores";
        aluno.calcularMedia();
        aluno.verificarsituação();
        
     
        
                
    }
    
}
