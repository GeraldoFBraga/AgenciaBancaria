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
public class AgenciaBancaria {

    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Funcionario f = new Funcionartio("123456", "Paulo", 2000);
        Funcionario g = new Gerente(1234, 10, "1231234", "Paulo", 200.0);
        System.out.println(g.getBonificacao());
        
    }
    
}
