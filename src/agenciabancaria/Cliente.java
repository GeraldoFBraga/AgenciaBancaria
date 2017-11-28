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
public class Cliente implements Autenticavel{
    
    private int digital;
    
    @Override
    public boolean autentica(int senha){
        return senha == getSenhaFromDigital();
        
    }
    
    private int getSenhaFromDigital(){
        return digital * digital;
        
    }
}
