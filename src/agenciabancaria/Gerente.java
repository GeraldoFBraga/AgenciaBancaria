/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciabancaria;

/**
 *
 * @author geraldo.braga
 */
public class Gerente extends Funcionario {
    
   private int senha;
   private int numSubordinados;

    public Gerente(int senha, int numSubordinados, String cpf, String nome, double salario) {
        super(cpf, nome, salario);
        this.senha = senha;
        this.numSubordinados = numSubordinados;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumSubordinados() {
        return numSubordinados;
    }

    public void setNumSubordinados(int numSubordinados) {
        this.numSubordinados = numSubordinados;
    }
    
    
   
   
   
   public  boolean autentica(int senha){
       return senha == this.senha;
   }

    @Override
    public double getBonificacao() {
        return getSalario()*0.15;
        
    }
    
}
