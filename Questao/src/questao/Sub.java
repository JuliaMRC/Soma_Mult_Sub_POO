/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao;

import javax.swing.JOptionPane;

/**
 *
 * @author Julia
 */
public class Sub extends Questao{
    
    public Sub(){
        this.pontos = 1;
    }
    
    @Override
    public boolean FazConta(){
        if (this.operador1 - this.operador2 == this.resultado){
            return true;
        }
        return false;
    }
    
    public void FazPergunta(){
        String resposta = JOptionPane.showInputDialog("Quanto é "+operador1+" - "+operador2+"? ");
        
        this.resultado = Integer.parseInt(resposta);
    }
}
